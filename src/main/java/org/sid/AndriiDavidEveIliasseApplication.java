package org.sid;

import org.sid.dao.ChasseurRepository;
import org.sid.dao.PiloteRepository;
import org.sid.dao.RebelleRepository;
import org.sid.entities.Chasseur;
import org.sid.entities.Pilote;
import org.sid.entities.Rebelle;
import org.sid.entities.enums.Grade;
import org.sid.entities.enums.Race;
import org.sid.entities.enums.Sante;
import org.sid.entities.enums.TypeChasseur;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AndriiDavidEveIliasseApplication {

	public static void main(String[] args) {
		SpringApplication.run(AndriiDavidEveIliasseApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(RebelleRepository rebelleRepository, ChasseurRepository chasseurRepository, PiloteRepository piloteRepository) {
		return args -> {
			Rebelle jarjar = new Rebelle(null, "Jar Jar", "Binks", Race.KIFFAR, 189, true);
			rebelleRepository.save(jarjar);
			//chasseurRepository.save(new Chasseur(null, TypeChasseur.XWING, new Pilote()));
			
			piloteRepository.save(new Pilote("Juwayni", "Ibn Walid", Race.HUMAIN, 34, 
					Grade.OFFICIER, 100, 10, Sante.FORME, null, null));
		};
		
	}

}
