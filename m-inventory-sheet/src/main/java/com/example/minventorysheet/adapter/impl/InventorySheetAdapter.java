package com.example.minventorysheet.adapter.impl;

import com.example.minventorysheet.adapter.InventorySheetPort;
import com.example.minventorysheet.exception.ResourceNotFoundException;
import com.example.minventorysheet.mapper.InventorySheetMapper;
import com.example.minventorysheet.model.dto.InventorySheetDTO;
import com.example.minventorysheet.model.entity.InventorySheetEntity;
import com.example.minventorysheet.repository.InventorySheetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class InventorySheetAdapter implements InventorySheetPort {
    private final InventorySheetRepository inventorySheetRepository;
    private final InventorySheetMapper inventorySheetMapper;

    @Override
    public List<InventorySheetDTO> findAll() {
        return inventorySheetMapper.mappingEntitiesToDTOs(inventorySheetRepository.findAll());
    }

    @Override
    public InventorySheetDTO findByID(String id) {
        return inventorySheetRepository.findById(id)
                .map(inventorySheetMapper::mappingEntityToDTO)
                .orElseThrow(() -> new ResourceNotFoundException("Inventory sheet not found"));
    }

    @Override
    public InventorySheetDTO create(InventorySheetDTO dto) {
        return inventorySheetMapper.mappingEntityToDTO(
                inventorySheetRepository.save(inventorySheetMapper.mappingDTOToEntity(dto)));
    }

    @Override
    public InventorySheetDTO update(InventorySheetDTO dto) {
        inventorySheetRepository.findById(dto.getId()).orElseThrow(() -> new ResourceNotFoundException(
                String.format("Inventory sheet with id %s not found", dto.getId())));

        return inventorySheetMapper.mappingEntityToDTO(
                inventorySheetRepository.save(inventorySheetMapper.mappingDTOToEntity(dto)));
    }

    @Override
    public void deleteByID(String id) {
        InventorySheetEntity entity = inventorySheetRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(String.format("Inventory sheet with id %s not found", id)));

        entity.setDeleted(true);
        inventorySheetRepository.save(entity);
    }
}
