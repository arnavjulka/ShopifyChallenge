package com.example.shopifychallenge.services;

import com.example.shopifychallenge.models.InventoryGroup;

import java.util.List;
import java.util.Optional;

public interface InventoryGroupService {

  // Save operation
  InventoryGroup saveItemGroup(InventoryGroup inventoryItem);

  // Read operation
  List<InventoryGroup> fetchGroupList();


    Optional<InventoryGroup> getGroupById(Long groupId);
}
