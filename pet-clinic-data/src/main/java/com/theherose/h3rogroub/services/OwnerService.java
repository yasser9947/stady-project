package com.theherose.h3rogroub.services;

import com.theherose.h3rogroub.model.Owner;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface OwnerService extends CrudService<Owner , Long> {

    Owner fndByLastName(String lastName);


}
