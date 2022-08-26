package com.example.minventorysheet.validation.impl;

import com.example.minventorysheet.model.dto.InventorySheetDTO;
import com.example.minventorysheet.validation.InventorySheetValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InventorySheetValidatorImpl implements InventorySheetValidator {
    @Override
    public void validateInventorySheetInput(InventorySheetDTO dto) {
        // TODO document why this method is empty
    }
}
