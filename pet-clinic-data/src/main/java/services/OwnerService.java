package services;

import com.example.springguru.petclinic.sfgspetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Long id);

    Set<Owner> findAll();

}
