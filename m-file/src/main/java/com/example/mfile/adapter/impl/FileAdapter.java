package com.example.mfile.adapter.impl;

import com.example.mfile.adapter.FilePort;
import com.example.mfile.mapper.FileMapper;
import com.example.mfile.repository.FileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FileAdapter implements FilePort {
    private final FileRepository fileRepository;
    private final FileMapper fileMapper;
}
