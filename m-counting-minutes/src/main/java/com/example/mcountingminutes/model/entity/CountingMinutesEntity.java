package com.example.mcountingminutes.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "counting-minutes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CountingMinutesEntity {
    @Id
    private String id;
    private Boolean deleted;
}
