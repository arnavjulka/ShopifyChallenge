package com.example.shopifychallenge.dao;

import com.example.shopifychallenge.models.InventoryGroup;
import com.example.shopifychallenge.models.InventoryItem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryGroupRepository extends CrudRepository<InventoryGroup, Long> {

}
