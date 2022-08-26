package com.example.mcountingminutes.adapter.impl;

import com.example.mcountingminutes.adapter.CountingMinutesPort;
import com.example.mcountingminutes.mapper.CountingMinutesMapper;
import com.example.mcountingminutes.repository.CountingMinutesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CountingMinutesAdapter implements CountingMinutesPort {
    private final CountingMinutesRepository countingMinutesRepository;
    private final CountingMinutesMapper countingMinutesMapper;
}
