package com.example.mfile.rest;

import com.example.mfile.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("files")
@RequiredArgsConstructor
public class FileController {
    private final FileService fileService;
}
