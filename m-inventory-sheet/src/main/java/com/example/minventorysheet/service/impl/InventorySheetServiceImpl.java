package com.example.minventorysheet.service.impl;

import com.example.minventorysheet.adapter.InventorySheetPort;
import com.example.minventorysheet.model.dto.InventorySheetDTO;
import com.example.minventorysheet.model.dto.InventorySheetSearchDTO;
import com.example.minventorysheet.model.dto.MetaDTO;
import com.example.minventorysheet.model.dto.PageResponseDTO;
import com.example.minventorysheet.service.InventorySheetService;
import com.example.minventorysheet.validation.InventorySheetValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InventorySheetServiceImpl implements InventorySheetService {
    private final InventorySheetPort inventorySheetPort;
    private final InventorySheetValidator inventorySheetValidator;

    @Override
    public PageResponseDTO<InventorySheetDTO> searchInventorySheets(InventorySheetSearchDTO searchDTO) {
        return PageResponseDTO.<InventorySheetDTO>builder().build();
    }

    @Override
    public InventorySheetDTO getInventorySheetByID(String id) {
        return inventorySheetPort.findByID(id);
    }

    @Override
    public InventorySheetDTO createInventorySheet(InventorySheetDTO dto) {
        inventorySheetValidator.validateInventorySheetInput(dto);
        return inventorySheetPort.create(dto);
    }

    @Override
    public InventorySheetDTO updateInventorySheet(InventorySheetDTO dto) {
        inventorySheetValidator.validateInventorySheetInput(dto);
        return inventorySheetPort.update(dto);
    }

    @Override
    public void deleteInventorySheetByID(String id) {
        inventorySheetPort.deleteByID(id);
    }
}
