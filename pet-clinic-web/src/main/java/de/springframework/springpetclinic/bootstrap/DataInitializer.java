package de.springframework.springpetclinic.bootstrap;

import de.springframework.springpetclinic.model.Owner;
import de.springframework.springpetclinic.model.PetType;
import de.springframework.springpetclinic.model.Vet;
import de.springframework.springpetclinic.services.OwnerService;
import de.springframework.springpetclinic.services.PetTypeService;
import de.springframework.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataInitializer implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private  final PetTypeService petTypeService;
    public DataInitializer(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setTypeName("Dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setTypeName("Cat");
        PetType savedCatType = petTypeService.save(cat);


        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Wilson");

        ownerService.save(owner2);

        System.out.println("OwnersLoaded");
        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Abdellaoi");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Nami");
        vet2.setLastName("Same");
        vetService.save(vet2);

        System.out.println("VetsLoaded");
    }
}
