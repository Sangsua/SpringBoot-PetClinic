package services.map;

import de.springframework.springpetclinic.model.Pet;
import services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet type) {
        super.delete(type);
    }

    @Override
    public Pet save(Pet type) {
        return super.save(type.getId(), type);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
