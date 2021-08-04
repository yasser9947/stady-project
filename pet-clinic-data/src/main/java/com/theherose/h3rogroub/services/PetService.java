package com.theherose.h3rogroub.services;

import com.theherose.h3rogroub.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findBuId(Long id);
    Pet save(Pet pet);

    Set<Pet> findAll();
}
