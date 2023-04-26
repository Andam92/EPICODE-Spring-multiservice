package com.multiservice_producer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multiservice_producer.model.Persona;
import com.multiservice_producer.repository.PersonaRepository;

@Service
public class PersonaService {

	@Autowired PersonaRepository personaRepo;
	
	public Persona findPersona(Long id) {
		return personaRepo.findById(id).get();
	}
	
	public List<Persona> findAllPersona(){
		return personaRepo.findAll();
	}
	
}
