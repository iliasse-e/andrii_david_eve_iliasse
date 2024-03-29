package org.sid.entities;

import org.sid.entities.enums.Grade;
import org.sid.entities.enums.Race;
import org.sid.entities.enums.Sante;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@DiscriminatorValue("PI")
@Data @AllArgsConstructor @NoArgsConstructor
public class Pilote extends Rebelle {
	private Grade grade;
	private double heureDeVol;
	private int nbMission;
	private Sante sante;
	@OneToOne(mappedBy = "pilote")
	private Chasseur chasseur;
	@ManyToOne
	private Mission missionActuelle;
	
	public Pilote(
			String _prenom, String _nom, Race _race, int _age, 
			Grade _grade, double _heureDeVol, 
			int _nbMission, Sante _sante, Chasseur _chasseur, 
			Mission _missionActuelle) {
		super(null, _prenom, _nom, _race, _age, true);
		grade = _grade;
		heureDeVol = _heureDeVol;
		nbMission = _nbMission;
		sante = _sante;
		chasseur = _chasseur;
		missionActuelle = _missionActuelle;
	}
	
	public boolean getDispo() {
		return true;
	}
}
