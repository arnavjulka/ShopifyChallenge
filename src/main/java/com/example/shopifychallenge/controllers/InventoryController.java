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
  @GetMapping("/items")
  public List<InventoryItem> fetchItemList()
  {
    return inventoryService.fetchItemList();
  }

  @GetMapping("/items/active")
  public List<InventoryItem> fetchActiveItemList()
  {
    return inventoryService.fetchActiveItemList();
  }

  @GetMapping("/items/removed")
  public List<InventoryItem> fetchDeletedItemList()
  {
    return inventoryService.fetchDeletedItemList();
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
  public String deleteItemById(@PathVariable("id")  Long itemId)
  {
    inventoryService.deleteItemById(
        itemId);
    return "Deleted Successfully";
  }

  // Delete operation
  @PutMapping("/item/remove/{id}")
  public String removeItemById(@PathVariable("id")  Long itemId) throws Exception {
    inventoryService.removeById(itemId);
    return "Deleted Successfully";
  }

  @PutMapping("/item/{tid}/group/{groupid}")
  public String removeItemById(@PathVariable("tid")  Long itemId, @PathVariable("groupid")  Long groupId) throws Exception {
    inventoryService.addInventoryItemToGroup(itemId,groupId);
    return "added Successfully";
  }

  @PutMapping("/groupitem/remove/{id}")
  public String removeItemGroup(@PathVariable("id")  Long itemId) throws Exception {
    inventoryService.removeInventoryItemfromGroup(itemId);
    return "Deleted Successfully";
  }

  @GetMapping("/items/groupItems/{groupid}")
  public List<InventoryItem> fetchActiveItemList(@PathVariable("groupid")  Long groupId) throws Exception {
    return inventoryService.fetchGroupItems(groupId);
  }


}
