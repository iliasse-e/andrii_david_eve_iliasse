package org.sid.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Mission {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String mission;
	//@OneToMany
	//private List<Chasseur> chasseurs;
	@OneToMany
	private List<Pilote> pilotes;
	private int nbHeureMission;
	private boolean etatMission;
	
	public void finMission() {
		
	}
}
