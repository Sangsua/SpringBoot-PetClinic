package de.springframework.springpetclinic.repositories;

import de.springframework.springpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;


public interface OwnerRepository extends CrudRepository<Owner,Long > {
}
