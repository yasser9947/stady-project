package com.theherose.h3rogroub.services.map;

import com.theherose.h3rogroub.model.Vet;
import com.theherose.h3rogroub.services.CrudService;
import com.theherose.h3rogroub.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet t) {
        super.delete(t);
    }

    @Override
    public Vet save( Vet owner) {
        return super.save(owner);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
