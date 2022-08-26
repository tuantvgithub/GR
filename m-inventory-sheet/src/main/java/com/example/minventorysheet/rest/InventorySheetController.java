package com.example.minventorysheet.rest;

import com.example.minventorysheet.model.dto.*;
import com.example.minventorysheet.service.InventorySheetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("inventory-sheets")
@RequiredArgsConstructor
public class InventorySheetController {
    private final InventorySheetService inventorySheetService;

    @GetMapping
    public ResponseEntity<PageResponseDTO<InventorySheetDTO>> search(@Valid InventorySheetSearchDTO searchDTO) {
        return ResponseEntity.ok(inventorySheetService.searchInventorySheets(searchDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<InventorySheetDTO> getByID(@PathVariable String id) {
        return ResponseEntity.ok(inventorySheetService.getInventorySheetByID(id));
    }

    @PostMapping
    public ResponseEntity<InventorySheetDTO> create(@RequestBody @Validated({Create.class}) InventorySheetDTO inventorySheetDTO) {
        return ResponseEntity.ok(inventorySheetService.createInventorySheet(inventorySheetDTO));
    }

    @PostMapping
    public ResponseEntity<InventorySheetDTO> update(@RequestBody @Validated({Update.class}) InventorySheetDTO inventorySheetDTO) {
        return ResponseEntity.ok(inventorySheetService.updateInventorySheet(inventorySheetDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteByID(@PathVariable String id) {
        inventorySheetService.deleteInventorySheetByID(id);
        return ResponseEntity.ok().build();
    }
}
