package com.felix.sprint3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felix.sprint3.model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long>{

}
