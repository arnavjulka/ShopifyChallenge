package com.example.shopifychallenge.services.impl;

import com.example.shopifychallenge.models.InventoryItem;
import com.example.shopifychallenge.repositories.InventoryRepository;
import com.example.shopifychallenge.services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryServiceImpl implements InventoryService {

  @Autowired
  InventoryRepository inventoryRepository;

  @Override
  public InventoryItem saveItem(InventoryItem inventoryItem) {
    return inventoryRepository.save(inventoryItem);
  }

  @Override
  public List<InventoryItem> fetchItemList() {
    return (List<InventoryItem>)
        inventoryRepository.findAll();
  }

  @Override
  public InventoryItem updateItem(InventoryItem inventoryItem, Long productId) throws Exception {
    InventoryItem item;
    Optional<InventoryItem> itemOptional = inventoryRepository.findById(productId);
    if(itemOptional.isPresent()){
      item = itemOptional.get();
      item.setProductCode(inventoryItem.getProductCode());
      item.setProductName(inventoryItem.getProductName());
      item.setBrand(inventoryItem.getBrand());
      item.setCostPrice(inventoryItem.getCostPrice());
      item.setSellingPrice(inventoryItem.getSellingPrice());

      // so on and so forth..
    }
    else {
      throw new Exception("Item not found!");
    }

    return inventoryRepository.save(item);
  }

  @Override
  public void deleteItemById(Long productId) {
    inventoryRepository.deleteById(productId);
  }
}
