package com.multiservice_producer.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;
import com.multiservice_producer.model.Persona;

@Configuration
public class PersonaConfig {

	@Bean
	@Scope("prototype")
	public Persona creaPersona() {
		Faker fake = Faker.instance(new Locale("it-IT"));
		
		return Persona.builder().
				nome(fake.name().fullName())
				.username(fake.name().username())
				.email(fake.internet().emailAddress())
				.cellulare(fake.phoneNumber().cellPhone())
				.build();
	}	
}
