package de.springframework.springpetclinic.bootstrap;

import de.springframework.springpetclinic.model.*;
import de.springframework.springpetclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class DataInitializer implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private  final PetTypeService petTypeService;
    private  final SpecialtyService specialtyService;
    private final VisitService visitService;
    public DataInitializer(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {
      int count = petTypeService.findAll().size();
      if(count==0){
        loadData();
      }
    }

    private void loadData() {
        //Setup Pettypes
        PetType dog = new PetType();
        dog.setTypeName("Dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setTypeName("Cat");
        PetType savedCatType = petTypeService.save(cat);

        //Setup Specialties
        Specialty radiology = new Specialty();
        radiology.setDescription("Radiology");
        Specialty savedRadiology = specialtyService.save(radiology);

        Specialty surgery = new Specialty();
        surgery.setDescription("Surgery");
        Specialty savedSurgery = specialtyService.save(surgery);

        Specialty dentistry= new Specialty();
        dentistry.setDescription("dentistry");
        Specialty saveDentistry = specialtyService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Bickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("12345678");

        Pet michaelsPet = new Pet();
        michaelsPet.setName("Gintoki");
        michaelsPet.setPetType(savedDogType);
        michaelsPet.setBirthDate(LocalDate.now());
        michaelsPet.setOwner(owner1);
        owner1.getPets().add(michaelsPet);
        ownerService.save(owner1);


        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Wilson");
        owner2.setAddress("123 Bickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("12345634");

        Pet fionasCat = new Pet();
        fionasCat.setName("Pussy");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(savedCatType);
        owner2.getPets().add(fionasCat);
        ownerService.save(owner2);
        System.out.println("OwnersLoaded");

        Visit visit2 = new Visit();
        visit2.setPet(fionasCat);
        visit2.setLocalDate(LocalDate.now());
        visit2.setDescription("Fiona visited her cat");
        visitService.save(visit2);



        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Abdellaoi");
        vet1.getSpecialties().add(savedRadiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Nami");
        vet2.setLastName("Same");
        vet2.getSpecialties().add(saveDentistry);
        vetService.save(vet2);

        System.out.println("VetsLoaded");
    }
}
