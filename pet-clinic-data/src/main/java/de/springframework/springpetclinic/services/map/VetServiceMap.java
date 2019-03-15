package de.springframework.springpetclinic.services.map;

import de.springframework.springpetclinic.model.Vet;
import de.springframework.springpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

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
