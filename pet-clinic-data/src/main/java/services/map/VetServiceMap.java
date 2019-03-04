package services.map;

import de.springframework.springpetclinic.model.Vet;
import services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet type) {
        super.delete(type);
    }

    @Override
    public Vet save(Vet type) {
        return super.save(type.getId(), type);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
