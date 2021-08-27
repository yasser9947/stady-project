package com.theherose.h3rogroub.repositores;

import com.theherose.h3rogroub.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner , Long> {
    Owner findByLastName(String name);
}
