package com.theherose.h3rogroub.services;

import com.theherose.h3rogroub.model.Owner;
import com.theherose.h3rogroub.model.Pet;
import org.springframework.stereotype.Service;
import java.util.Set;


@Service
public interface PetService extends CrudService<Pet, Long> {

}
