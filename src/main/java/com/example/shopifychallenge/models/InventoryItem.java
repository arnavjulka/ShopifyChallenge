package com.example.shopifychallenge.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "inventory_item")
public class InventoryItem implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "productId")
  private long productId;

  @Column(name = "productCode")
  private String productCode;

  @Column(name = "sellDate")
  private String sellDate;

  @Column(name = "supplierCode")
  private String supplierCode;

  @Column(name = "productName")
  private String productName;

  @Column(name = "quantity")
  private int quantity;

  @Column(name = "costPrice")
  private double costPrice;

  @Column(name = "sellingPrice")
  private double sellingPrice;

  @Column(name = "brand")
  private String brand;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "inventory_group_id", referencedColumnName = "groupId")
  private InventoryGroup inventoryGroup;

}
