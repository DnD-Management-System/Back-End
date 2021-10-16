package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//Lombok
@Getter
@Setter
@NoArgsConstructor
//@AllArgsConstructor
@ToString


@Entity
@Table(name = "character_db")

public class CharacterDnd {
	@Id
	@Column(name = "characterId") 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int characterId;
	@Column(name = "name")
	String name;
	
	
	@ManyToOne
	@JoinColumn(name = "campaignId")
	private Campaign campaign;
	
	@OneToOne(mappedBy="character")
	private CharacterSheet characterSheet;
	
	@ManyToOne
	@JoinColumn(name = "dungeonMasterId")
	private DungeonMaster dungeonMaster;
	
	public CharacterDnd(String name) {
		this.name = name;
	}
	
	public Campaign getCampaign() {
		return campaign;
	}
	@JsonIgnore
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	
	public DungeonMaster getDungeonMaster() {
		return dungeonMaster;
	}
	
	public void setDungeonMaster(DungeonMaster dungeonMaster) {
		this.dungeonMaster = dungeonMaster;
	}
	
	public CharacterSheet getCharacterSheet() {
		return characterSheet;
	}
	
	public void setCharacterSheet(CharacterSheet characterSheet) {
		this.characterSheet = characterSheet;
	}
}