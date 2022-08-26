package com.example.minventorysheet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InventorySheetDTO {
    @Null(groups = {Create.class})
    @NotNull(groups = {Update.class})
    private String id;
    private Boolean deleted;
}
