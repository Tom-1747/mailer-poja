package com.example.mailer.file.hash;

import com.example.mailer.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
