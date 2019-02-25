package services;

import de.springframework.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findVetById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAllVets();
}
