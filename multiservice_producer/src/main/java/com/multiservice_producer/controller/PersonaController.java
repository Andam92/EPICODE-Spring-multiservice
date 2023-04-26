package com.multiservice_producer.controller;

import java.util.List;

import org.apache.coyote.http11.Http11InputBuffer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multiservice_producer.model.Persona;
import com.multiservice_producer.service.PersonaService;

@RestController
@RequestMapping("/app")
public class PersonaController {
	
	@Autowired PersonaService personaService;

	@GetMapping("/data1")
	public String getStringa() {
		return "Esercizio #1: Ciao, prova Stringa ";
	}
	
	@GetMapping("/data2")
	public String getListPersona() {
		return personaService.findAllPersona().toString();
	}
	
	@GetMapping("/data3")
	public ResponseEntity<?> getPersonaJSON() {	
		return new ResponseEntity<>(personaService.findAllPersona(), HttpStatus.OK);
	}
}
