package services;

import de.springframework.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findPetById(Long id);
    Pet savePet(Pet pet);
    Set<Pet> findAllPets();
}
