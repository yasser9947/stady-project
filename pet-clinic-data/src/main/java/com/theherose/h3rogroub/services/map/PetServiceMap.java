package com.theherose.h3rogroub.services.map;

import com.theherose.h3rogroub.model.Pet;
import com.theherose.h3rogroub.services.CrudService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet , Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet t) {
        super.delete(t);
    }

    @Override
    public Pet save( Pet owner) {
        return super.save(owner);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}

