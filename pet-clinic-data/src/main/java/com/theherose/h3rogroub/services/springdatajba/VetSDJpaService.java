package com.theherose.h3rogroub.services.springdatajba;

import com.theherose.h3rogroub.model.Vet;
import com.theherose.h3rogroub.repositores.VetRepository;
import com.theherose.h3rogroub.services.VetService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class VetSDJpaService  implements VetService {
    private final VetRepository vetRepository;

    public VetSDJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet vet) {
        return vetRepository.save(vet);
    }

    @Override
    public void delete(Vet vet) {
    vetRepository.delete(vet);
    }

    @Override
    public void deleteById(Long aLong) {
    vetRepository.deleteById(aLong);
    }
}
