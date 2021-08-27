package com.theherose.h3rogroub.bootstrap;

import com.theherose.h3rogroub.model.Owner;
import com.theherose.h3rogroub.model.Pet;
import com.theherose.h3rogroub.model.PetType;
import com.theherose.h3rogroub.services.OwnerService;
import com.theherose.h3rogroub.services.PetTypeService;
import com.theherose.h3rogroub.services.VetService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private  final OwnerService ownerService;
    private  final VetService vetSevice;
    private  final PetTypeService petTypeService;


    public DataLoader(OwnerService ownerService, VetService vetSevice, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetSevice = vetSevice;
        this.petTypeService = petTypeService;
    }


    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType  savedDogType =  petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType  saveCatType =  petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Yasir");
        owner1.setLastName("Saud");
        owner1.setAddress("123 ");
        owner1.setCity("Zulfi");
        owner1.setTelephone("0054547");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthday(LocalDate.now());
        mikesPet.setName("Areen");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Ali");
        owner2.setLastName("Saud");
        owner2.setAddress("123 ");
        owner2.setCity("Zulfi");
        owner2.setTelephone("0054547");
        Pet mikesPet2 = new Pet();
        mikesPet2.setPetType(saveCatType);
        mikesPet2.setOwner(owner2);
        mikesPet2.setBirthday(LocalDate.now());
        mikesPet2.setName("dodo");
        owner2.getPets().add(mikesPet2);
        ownerService.save(owner2);
        System.out.println("Owners loader ");
    }
}
