package com.theherose.h3rogroub.services.springdatajba;

import com.theherose.h3rogroub.model.Pet;
import com.theherose.h3rogroub.repositores.PetRepository;
import com.theherose.h3rogroub.services.PetService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PetSDJpaPet implements PetService {

    private final PetRepository petRepository;

    public PetSDJpaPet(PetRepository petRepository) {
        this.petRepository = petRepository;
    }


    @Override
    public Set<Pet> findAll() {
            Set<Pet> pets = new HashSet<>();
            petRepository.findAll().forEach(pets::add);

        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public void delete(Pet pet) {
    petRepository.delete(pet);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
