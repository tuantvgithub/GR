package com.example.minventorysheet.adapter;

import com.example.minventorysheet.model.dto.InventorySheetDTO;

import java.util.List;

public interface InventorySheetPort {
    List<InventorySheetDTO> findAll();
    InventorySheetDTO findByID(String id);
    InventorySheetDTO create(InventorySheetDTO dto);
    InventorySheetDTO update(InventorySheetDTO dto);
    void deleteByID(String id);
}
