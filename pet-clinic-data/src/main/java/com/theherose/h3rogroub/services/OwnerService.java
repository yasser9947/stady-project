package com.theherose.h3rogroub.services;

import com.theherose.h3rogroub.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner fndByLastName(String lastName);

    Owner findBuId(Long id);
    Owner save(Owner owner);

    Set<Owner> findAll();
}
