package com.theherose.h3rogroub.services.springdatajba;

import com.theherose.h3rogroub.model.Owner;
import com.theherose.h3rogroub.repositores.OwnerRepository;
import com.theherose.h3rogroub.repositores.PetRepository;
import com.theherose.h3rogroub.repositores.PetTypeRepository;
import com.theherose.h3rogroub.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class OwnerSDJpaService  implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;


    public OwnerSDJpaService(OwnerRepository ownerRepository,
                             PetRepository petRepository,
                             PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }


    @Override
    public Set<Owner> findAll() {

        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().iterator().forEachRemaining(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        Optional<Owner> optionalOwner = ownerRepository.findById(aLong);
        return optionalOwner.orElse(null);
    }

    @Override
    public Owner save(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public void delete(Owner owner) {

        ownerRepository.delete(owner);
    }

    @Override
    public void deleteById(Long aLong) {
    ownerRepository.deleteById(aLong);
    }

    @Override
    public Owner fndByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }
}
