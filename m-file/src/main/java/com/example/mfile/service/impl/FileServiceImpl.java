package com.example.mfile.service.impl;

import com.example.mfile.adapter.FilePort;
import com.example.mfile.service.FileService;
import com.example.mfile.validation.FileValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService {
    private final FileValidator fileValidator;
    private final FilePort filePort;
}
