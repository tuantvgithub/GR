package com.example.mcountingminutes.service.impl;

import com.example.mcountingminutes.adapter.CountingMinutesPort;
import com.example.mcountingminutes.service.CountingMinutesService;
import com.example.mcountingminutes.validation.CountingMinutesValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CountingMinutesServiceImpl implements CountingMinutesService {
    private final CountingMinutesValidator countingMinutesValidator;
    private final CountingMinutesPort countingMinutesPort;
}
