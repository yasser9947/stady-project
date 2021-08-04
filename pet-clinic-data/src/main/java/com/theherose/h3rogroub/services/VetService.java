package com.theherose.h3rogroub.services;

import com.theherose.h3rogroub.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findBuId(Long id);
    Vet save(Vet vet);

    Set<Vet> findAll();
}
