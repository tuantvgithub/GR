package com.example.mcountingminutes.rest;

import com.example.mcountingminutes.service.CountingMinutesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("counting-minutes")
@RequiredArgsConstructor
public class CountingMinutesController {
    private final CountingMinutesService countingMinutesService;
}
