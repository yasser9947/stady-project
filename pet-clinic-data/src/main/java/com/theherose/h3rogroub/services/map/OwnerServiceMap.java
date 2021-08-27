package com.theherose.h3rogroub.services.map;

import com.theherose.h3rogroub.model.Owner;
import com.theherose.h3rogroub.model.Pet;
import com.theherose.h3rogroub.services.OwnerService;
import com.theherose.h3rogroub.services.PetService;
import com.theherose.h3rogroub.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner , Long> implements OwnerService {

    private final PetTypeService petTypeService;
//    private final PetService petService;


    public OwnerServiceMap(PetTypeService petTypeService) {
        this.petTypeService = petTypeService;
//        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
    super.deleteById(id);
    }

    @Override
    public void delete(Owner t) {
    super.delete(t);
    }

    @Override
    public Owner save( Owner owner) {

    if (owner != null){
        if (owner.getPets() != null){
            owner.getPets().forEach(pet ->{
                        if(pet.getPetType() != null){
                            if(pet.getPetType().getId() != null){
                                pet.setPetType(petTypeService.save(pet.getPetType()));
                            }
                        } else {
                            throw new RuntimeException("Pet Type is required");
                        }
                        if (pet.getId() ==null){
//                            Pet saveedPet = petService.save(pet);
//                            pet.setId(saveedPet.getId());
                        }
            });
        }

        return super.save(owner);
    } else {
        return  null;
    }


    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner fndByLastName(String lastName) {
        return null;
    }
}
