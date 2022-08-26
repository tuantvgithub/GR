package com.example.minventorysheet.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MetaDTO {
    private Integer total;
    private Integer page;
    private Integer size;
}
