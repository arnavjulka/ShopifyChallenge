package com.example.shopifychallenge.controllers;

import com.example.shopifychallenge.models.InventoryItem;
import com.example.shopifychallenge.services.InventoryService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryController {

  @Autowired
  InventoryService inventoryService;

  // Save operation
  @ApiOperation(value = "save a new Inventory Item")
  @PostMapping("/item")
  public InventoryItem saveItem(
      @RequestBody InventoryItem item)
  {
    return inventoryService.saveItem(item);
  }

  // Read operation
  @GetMapping("/items")
  @ApiOperation(value = "get all the items from the inventory list")
  public List<InventoryItem> fetchItemList()
  {
    return inventoryService.fetchItemList();
  }

  @GetMapping("/items/active")
  @ApiOperation(value = "get all the items that are NOT REMOVED(ACTIVE) from the inventory list")
  public List<InventoryItem> fetchActiveItemList()
  {
    return inventoryService.fetchActiveItemList();
  }

  @ApiOperation(value = "get all the items that are REMOVED(InACTIVE) from the inventory list")
  @GetMapping("/items/removed")
  public List<InventoryItem> fetchDeletedItemList()
  {
    return inventoryService.fetchDeletedItemList();
  }

  // Update operation
  @ApiOperation(value = "update an inventory Item by its id")
  @PutMapping("/item/{id}")
  public InventoryItem
  updateDepartment(@RequestBody InventoryItem item,
                   @PathVariable("id") Long itemId) throws Exception {
    return inventoryService.updateItem(
        item, itemId);
  }

  // Delete operation
  @DeleteMapping("/item/{id}")
  @ApiOperation(value = "Delete an inventory Item by its id")
  public String deleteItemById(@PathVariable("id")  Long itemId)
  {
    inventoryService.deleteItemById(
        itemId);
    return "Deleted Successfully";
  }

  // Delete operation
  @PutMapping("/item/remove/{id}")
  @ApiOperation(value = "remove(not deleting it here, just disables kinda) an inventory Item by its id")
  public String removeItemById(@PathVariable("id")  Long itemId) throws Exception {
    inventoryService.removeById(itemId);
    return "Deleted Successfully";
  }

  @PutMapping("/item/{id}/group/{groupid}")
  @ApiOperation(value = "add an inventory Item(id) to a group {groupid}")
  public String removeItemById(@PathVariable("id")  Long itemId, @PathVariable("groupid")  Long groupId) throws Exception {
    inventoryService.addInventoryItemToGroup(itemId,groupId);
    return "added Successfully";
  }

  @PutMapping("/groupitem/remove/{id}")
  @ApiOperation(value = "removethe group of an inventory Item(id)")
  public String removeItemGroup(@PathVariable("id")  Long itemId) throws Exception {
    inventoryService.removeInventoryItemfromGroup(itemId);
    return "Deleted Successfully";
  }

  @GetMapping("/items/groupItems/{groupid}")
  @ApiOperation(value = "fetcha list of all the items in a group {groupid}")
  public List<InventoryItem> fetchActiveItemList(@PathVariable("groupid")  Long groupId) throws Exception {
    return inventoryService.fetchGroupItems(groupId);
  }


}
