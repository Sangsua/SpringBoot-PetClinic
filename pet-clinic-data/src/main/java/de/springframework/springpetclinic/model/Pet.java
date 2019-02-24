package de.springframework.springpetclinic.model;

import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDate;
@Data
@Entity
public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

}
