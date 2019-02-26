package de.springframework.springpetclinic.model;

import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDate;
@Data
public class Pet extends BaseEntity {
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

}
