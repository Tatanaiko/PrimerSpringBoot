package org.example.miprimerspringboot4;

import org.example.miprimerspringboot4.entity.Persona;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class MiPrimerSpringBoot4Application {

	public static void main(String[] args) {
		SpringApplication.run(MiPrimerSpringBoot4Application.class, args);

		Persona persona = new Persona("Tiare", "Linco", 31);

		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Apellido: " + persona.getApellido());
		System.out.println("Edad: " + persona.getEdad());
	}



}
