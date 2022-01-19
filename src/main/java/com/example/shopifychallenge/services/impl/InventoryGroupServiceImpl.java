package com.example.shopifychallenge.services.impl;

import com.example.shopifychallenge.dao.InventoryGroupRepository;
import com.example.shopifychallenge.models.InventoryGroup;
import com.example.shopifychallenge.services.InventoryGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryGroupServiceImpl implements InventoryGroupService {

  @Autowired
  InventoryGroupRepository inventoryGroupRepository;

  @Override
  public InventoryGroup saveItemGroup(InventoryGroup inventoryGroup) {
    return inventoryGroupRepository.save(inventoryGroup);
  }

  @Override
  public List<InventoryGroup> fetchGroupList() {
    return (List<InventoryGroup>)
            inventoryGroupRepository.findAll();
  }

  @Override
  public Optional<InventoryGroup> getGroupById(Long groupId) {
    return inventoryGroupRepository.findById(groupId);
  }
}
