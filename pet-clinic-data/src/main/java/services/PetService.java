package services;



import com.example.springguru.petclinic.sfgspetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Long id);

    Set<Pet> findAll();

}
