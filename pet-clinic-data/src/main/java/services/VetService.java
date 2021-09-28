package services;

import com.example.springguru.petclinic.sfgspetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Long id);

    Set<Vet> findAll();

}
