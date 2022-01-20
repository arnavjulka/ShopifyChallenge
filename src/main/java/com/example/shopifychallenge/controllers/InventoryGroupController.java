package com.example.shopifychallenge.controllers;

import com.example.shopifychallenge.models.InventoryGroup;
import com.example.shopifychallenge.models.InventoryItem;
import com.example.shopifychallenge.services.InventoryGroupService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InventoryGroupController {

  @Autowired
  InventoryGroupService inventoryGroupService;

  // Save operation
  @PostMapping("/group")
  @ApiOperation(value = "create a new group")
  public InventoryGroup saveItem(
      @RequestBody InventoryGroup group)
  {
    return inventoryGroupService.saveItemGroup(group);
  }

  // Read operation
  @GetMapping("/itemgroups")
  @ApiOperation(value = "get all the groups")
  public List<InventoryGroup> fetchItemList()
  {
    return inventoryGroupService.fetchGroupList();
  }

}
