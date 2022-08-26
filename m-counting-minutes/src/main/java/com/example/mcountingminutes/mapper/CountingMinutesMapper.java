package com.example.mcountingminutes.mapper;

import com.example.mcountingminutes.model.dto.CountingMinutesDTO;
import com.example.mcountingminutes.model.entity.CountingMinutesEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CountingMinutesMapper {
    CountingMinutesDTO mappingEntityToDTO(CountingMinutesEntity entity);
    List<CountingMinutesDTO> mappingEntitiesToDTOs(List<CountingMinutesEntity> entities);
    CountingMinutesEntity mappingDTOToEntity(CountingMinutesDTO dto);
}
