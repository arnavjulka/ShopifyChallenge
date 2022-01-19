package com.example.shopifychallenge.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.lang.Nullable;

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

  @Column(name = "supplierCode")
  private String supplierCode;

  @Column(name = "productName")
  private String productName;

  @Column(name = "quantity")
  private int quantity;

  @Column(name = "brand")
  private String brand;

  @Column(name = "addedOnDate")
  private java.sql.Date addedOnDate;

  @Column(name = "isRemoved",columnDefinition = "boolean default false")
  @JsonIgnore
  private boolean isRemoved=false;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "inventory_group_id", referencedColumnName = "groupId")
  private InventoryGroup inventoryGroup;

}
