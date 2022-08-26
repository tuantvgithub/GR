package com.example.minventorysheet.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "inventory-sheet")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InventorySheetEntity {
    @Id
    private String id;
    private Boolean deleted;
}
