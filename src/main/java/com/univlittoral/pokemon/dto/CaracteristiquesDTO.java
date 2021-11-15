package com.univlittoral.pokemon.dto;

public class CaracteristiquesDTO {
	
	
	private Integer taille;
    private Integer poids;
    private String categorie;
    private String talent;
    private String force;
    private String faiblesse;
    
    
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
	public void setCategorie(String catagorie) {
		this.categorie = catagorie;
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
	
	

    
}
