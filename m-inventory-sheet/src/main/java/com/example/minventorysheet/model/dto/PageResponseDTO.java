package com.example.minventorysheet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class PageResponseDTO<T> {
    private List<T> data;
    private MetaDTO meta;
}
