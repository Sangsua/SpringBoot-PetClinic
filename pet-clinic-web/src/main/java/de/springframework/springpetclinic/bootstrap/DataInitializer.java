package de.springframework.springpetclinic.bootstrap;

import de.springframework.springpetclinic.model.Owner;
import de.springframework.springpetclinic.model.Vet;
import de.springframework.springpetclinic.services.OwnerService;
import de.springframework.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataInitializer implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataInitializer(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner()   ;
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner()   ;
        owner1.setId(2L);
        owner1.setFirstName("Fiona");
        owner1.setLastName("Wilson");

        ownerService.save(owner2);

        System.out.println("OwnersLoaded");
        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Abdellaoi");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Nami");
        vet2.setLastName("Same");
        vetService.save(vet2);

        System.out.println("VetsLoaded");
    }
}
