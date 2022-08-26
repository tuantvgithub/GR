package com.example.minventorysheet.validation;

import com.example.minventorysheet.model.dto.InventorySheetDTO;

public interface InventorySheetValidator {
    void validateInventorySheetInput(InventorySheetDTO dto);
}
