package com.theherose.h3rogroub.services.springdatajba;


import com.theherose.h3rogroub.model.Speciality;
import com.theherose.h3rogroub.repositores.SpecialityRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class SpecialitySDJpaService {

    private final SpecialityRepository specialityRepository;


    public SpecialitySDJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }


    public Set<Speciality> findAll() {
        Set<Speciality> Specialities = new HashSet<>();
        specialityRepository.findAll().forEach(Specialities::add);

        return Specialities;
    }


    public Speciality findById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }


    public Speciality save(Speciality speciality) {
        return specialityRepository.save(speciality);
    }


    public void delete(Speciality speciality) {
        specialityRepository.delete(speciality);
    }


    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }

}
