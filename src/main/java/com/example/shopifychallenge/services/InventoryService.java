package com.example.shopifychallenge.services;

import com.example.shopifychallenge.models.InventoryItem;
import com.example.shopifychallenge.models.InventoryItem;

import java.util.List;

public interface InventoryService {

  // Save operation
  InventoryItem saveItem(InventoryItem inventoryItem);

  // Read operation
  List<InventoryItem> fetchItemList();

  // Update operation
  InventoryItem updateItem(InventoryItem inventoryItem,
                              Long productId) throws Exception;

  // Delete operation
  void deleteItemById(Long productId);
}
