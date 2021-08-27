package com.theherose.h3rogroub.services;

import com.theherose.h3rogroub.model.PetType;
import com.theherose.h3rogroub.services.CrudService;
import org.springframework.stereotype.Service;

@Service
public interface PetTypeService extends CrudService<PetType ,Long> {

}
