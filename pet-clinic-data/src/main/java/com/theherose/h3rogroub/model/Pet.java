package com.theherose.h3rogroub.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "pets")
public class Pet extends BaseEntity {

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType petType;


    @ManyToOne()
    @JoinColumn(name = "owner_id")
    private Owner owner;
    @Column(name = "birth_day" )
    private LocalDate birthday;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "pet")
    private Set<Visit> visit = new HashSet<>();

    public Set<Visit> getVisit() {
        return visit;
    }

    public void setVisit(Set<Visit> visit) {
        this.visit = visit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}
