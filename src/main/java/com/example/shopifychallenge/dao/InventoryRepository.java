package com.example.shopifychallenge.dao;

import com.example.shopifychallenge.models.InventoryGroup;
import com.example.shopifychallenge.models.InventoryItem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends CrudRepository<InventoryItem, Long> {
    @Query("from InventoryItem where isRemoved = true ")
    List<InventoryItem> findRemovedItems();

    @Query("from InventoryItem where isRemoved = false ")
    List<InventoryItem> findActiveItems();

    @Query("from InventoryItem where inventoryGroup = :groupId ")
    List<InventoryItem> findGroupItems(InventoryGroup groupId);
}
