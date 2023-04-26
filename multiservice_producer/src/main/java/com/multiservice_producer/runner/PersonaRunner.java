package com.multiservice_producer.runner;

import java.util.Iterator;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.multiservice_producer.model.Persona;
import com.multiservice_producer.repository.PersonaRepository;

@Component
public class PersonaRunner implements ApplicationRunner {
	
	 @Autowired ObjectProvider<Persona> persona;
	 @Autowired PersonaRepository repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
	creaQuattroPersone();

	}
	
	private void creaQuattroPersone() {
		for(int i = 0; i < 4; i++) {
			repo.save(persona.getObject());
		}
	}

}
