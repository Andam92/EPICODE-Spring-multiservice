package com.spring_security_project.auth.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/persone")
public class MultiservicePersonaController {
	
	@GetMapping("/data1")
	public String getStringa() {
		String url = "http://localhost:8080/app/data1";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> response = rt.getForEntity(url, String.class);		
		return "Stringa esercizio #1 = " + response.getBody();
	}
	
	@GetMapping("/data2")
	public String getListaPersone() {
		String url = "http://localhost:8080/app/data2";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> response = rt.getForEntity(url, String.class);		
		return "Stringa esercizio #2 = " + response.getBody();
	}
	
	@GetMapping("/data3")
	public Object getPersoneJSON() {
		String url = "http://localhost:8080/app/data3";
		RestTemplate rt = new RestTemplate();
		Object response = rt.getForObject(url, Object.class);		
		return response;
	}
	
}
