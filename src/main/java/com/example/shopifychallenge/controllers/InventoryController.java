package com.example.shopifychallenge.controllers;

import com.example.shopifychallenge.models.InventoryItem;
import com.example.shopifychallenge.services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryController {

  @Autowired
  InventoryService inventoryService;

  // Save operation
  @PostMapping("/item")
  public InventoryItem saveItem(
      @RequestBody InventoryItem item)
  {
    return inventoryService.saveItem(item);
  }

  // Read operation
  @GetMapping("/item")
  public List<InventoryItem> fetchItemList()
  {
    return inventoryService.fetchItemList();
  }

  // Update operation
  @PutMapping("/item/{id}")
  public InventoryItem
  updateDepartment(@RequestBody InventoryItem item,
                   @PathVariable("id") Long itemId) throws Exception {
    return inventoryService.updateItem(
        item, itemId);
  }

  // Delete operation
  @DeleteMapping("/item/{id}")
  public String deleteItemById(@PathVariable("id")
                                         Long itemId)
  {
    inventoryService.deleteItemById(
        itemId);
    return "Deleted Successfully";
  }

}
