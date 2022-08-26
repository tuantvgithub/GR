package com.example.minventorysheet.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InventorySheetSearchDTO {
    private Integer page;
    private Integer size;
    private String sortPattern;
}
