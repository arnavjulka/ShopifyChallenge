package com.example.shopifychallenge.repositories;

import com.example.shopifychallenge.models.InventoryItem;
import com.example.shopifychallenge.models.InventoryItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends CrudRepository<InventoryItem, Long> {
}
