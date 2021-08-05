package com.theherose.h3rogroub.services;

import com.theherose.h3rogroub.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner , Long> {

    Owner fndByLastName(String lastName);


}
