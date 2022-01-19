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
@Table(name = "inventory_group")
public class InventoryGroup implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long groupId;

  @Column(name = "groupName")
  String groupName;

  @Column(name = "department")
  String department;


}
