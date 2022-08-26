package com.example.minventorysheet.mapper;

import com.example.minventorysheet.model.dto.InventorySheetDTO;
import com.example.minventorysheet.model.entity.InventorySheetEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InventorySheetMapper {
    InventorySheetDTO mappingEntityToDTO(InventorySheetEntity entity);
    List<InventorySheetDTO> mappingEntitiesToDTOs(List<InventorySheetEntity> entities);
    InventorySheetEntity mappingDTOToEntity(InventorySheetDTO dto);
}
