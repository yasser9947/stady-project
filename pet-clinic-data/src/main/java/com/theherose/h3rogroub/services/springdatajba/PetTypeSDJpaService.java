package com.theherose.h3rogroub.services.springdatajba;

import com.theherose.h3rogroub.model.PetType;
import com.theherose.h3rogroub.repositores.PetTypeRepository;
import com.theherose.h3rogroub.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PetTypeSDJpaService implements PetTypeService {

    private final PetTypeRepository petTypeRepository ;

    public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }


    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);

        return petTypes;
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType petType) {
        return petTypeRepository.save(petType);
    }

    @Override
    public void delete(PetType petType) {

        petTypeRepository.delete(petType);
    }

    @Override
    public void deleteById(Long aLong) {
    petTypeRepository.deleteById(aLong);
    }
}
