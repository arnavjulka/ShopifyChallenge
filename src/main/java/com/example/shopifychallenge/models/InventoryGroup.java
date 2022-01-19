package com.example.shopifychallenge.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "inventory_group")
public class InventoryGroup implements Serializable {

  @Id
  @Column(name = "groupId")
  String groupId;

  @Column(name = "groupName")
  String groupName;

  @Column(name = "department")
  String department;

  //TODO add other fields as req.

}
