package com.example.shopifychallenge.controllers;

import com.example.shopifychallenge.models.InventoryGroup;
import com.example.shopifychallenge.models.InventoryItem;
import com.example.shopifychallenge.services.InventoryGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryGroupController {

  @Autowired
  InventoryGroupService inventoryGroupService;

  // Save operation
  @PostMapping("/group")
  public InventoryGroup saveItem(
      @RequestBody InventoryGroup group)
  {
    return inventoryGroupService.saveItemGroup(group);
  }

  // Read operation
  @GetMapping("/itemgroups")
  public List<InventoryGroup> fetchItemList()
  {
    return inventoryGroupService.fetchGroupList();
  }

}
