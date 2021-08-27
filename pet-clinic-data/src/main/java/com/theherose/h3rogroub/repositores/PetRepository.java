package com.theherose.h3rogroub.repositores;

import com.theherose.h3rogroub.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet , Long> {
}
