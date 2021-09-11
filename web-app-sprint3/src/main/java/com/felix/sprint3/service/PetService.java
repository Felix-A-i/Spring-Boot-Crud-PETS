package com.felix.sprint3.service;

import java.util.List;

import com.felix.sprint3.model.Pet;

public interface PetService {
	List<Pet> getAllPets();
	void savePet(Pet pet);
	Pet getPetById(long id);
	void deletePetById(long id);
}
