package com.example.minventorysheet.service;

import com.example.minventorysheet.model.dto.InventorySheetDTO;
import com.example.minventorysheet.model.dto.InventorySheetSearchDTO;
import com.example.minventorysheet.model.dto.PageResponseDTO;

import java.util.List;

public interface InventorySheetService {
    PageResponseDTO<InventorySheetDTO> searchInventorySheets(InventorySheetSearchDTO searchDTO);
    InventorySheetDTO getInventorySheetByID(String id);
    InventorySheetDTO createInventorySheet(InventorySheetDTO dto);
    InventorySheetDTO updateInventorySheet(InventorySheetDTO dto);
    void deleteInventorySheetByID(String id);
}
