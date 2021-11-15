package com.univlittoral.pokemon.dto;

import com.univlittoral.pokemon.enums.TypeEnum;

public class PokemonRequestDTO {

    private int numero;
    private Long id;
    private String nom, description;
    private TypeEnum type;
	private Integer taille;
    private Integer poids;
    private String categorie;
    private String talent;
    private String force;
    private String faiblesse;
    
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public TypeEnum getType() {
		return type;
	}
	public void setType(TypeEnum type) {
		this.type = type;
	}
	public Integer getTaille() {
		return taille;
	}
	public void setTaille(Integer taille) {
		this.taille = taille;
	}
	public Integer getPoids() {
		return poids;
	}
	public void setPoids(Integer poids) {
		this.poids = poids;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getTalent() {
		return talent;
	}
	public void setTalent(String talent) {
		this.talent = talent;
	}
	public String getForce() {
		return force;
	}
	public void setForce(String force) {
		this.force = force;
	}
	public String getFaiblesse() {
		return faiblesse;
	}
	public void setFaiblesse(String faiblesse) {
		this.faiblesse = faiblesse;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}

