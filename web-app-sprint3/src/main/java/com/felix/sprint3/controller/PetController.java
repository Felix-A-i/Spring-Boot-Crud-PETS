package com.felix.sprint3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.felix.sprint3.model.Pet;
import com.felix.sprint3.service.PetService;

@Controller
public class PetController {
	
	@Autowired
	private PetService petService;

	// uma lista de exbibição dos Pets.
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listPets", petService.getAllPets());
		return "index";
		
	}
	@GetMapping("/showNewPetForm")
	public String showNewPetForm(Model model) {
		// criando model attribute para vincular os dados do formulário
		Pet pet = new Pet();
		model.addAttribute("pet", pet);
		return "new_pet";
	}
	@PostMapping("/savePet")
	public String savePet(@ModelAttribute("pet") Pet pet) {
		// salvar um Pet no banco de dados
		petService.savePet(pet);
		return "redirect:/";
	}
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable (value = "id") long id, Model model) {
		
		//get pet for the service
		Pet pet = petService.getPetById(id);
		
		//set pet as a model attribute to pre-populate the form
		model.addAttribute("pet", pet);
		return "update_pet";
		
	}
	@GetMapping("/deletePet/{id}")
	public String deletePet(@PathVariable (value = "id") long id) {
		
		//chamar o método para deletar o pet		
		this.petService.deletePetById(id);
		return "redirect:/";
	}
	
	
}
