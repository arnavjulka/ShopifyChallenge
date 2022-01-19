package com.example.shopifychallenge.services;

import com.example.shopifychallenge.models.InventoryItem;

import java.util.List;

public interface InventoryService {

  // Save operation
  InventoryItem saveItem(InventoryItem inventoryItem);

  // Read operation
  List<InventoryItem> fetchItemList();

  // Read operation only active items
  List<InventoryItem> fetchActiveItemList();

  // Read operation only deleted items
  List<InventoryItem> fetchDeletedItemList();

  // Update operation
  InventoryItem updateItem(InventoryItem inventoryItem,
                              Long productId) throws Exception;

  // Remove operation
  InventoryItem removeById(Long productId) throws Exception;

  // Delete operation
  void deleteItemById(Long productId);

  // add inventory item to group
  InventoryItem addInventoryItemToGroup(Long productId, Long groupId) throws Exception;

  // remove inventory item from group
  InventoryItem removeInventoryItemfromGroup(Long productId) throws Exception;

  List<InventoryItem> fetchGroupItems(Long groupId) throws Exception;
}
