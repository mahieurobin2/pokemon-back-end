package com.univlittoral.pokemon.dto;

import com.univlittoral.pokemon.enums.TypeEnum;

public class PokemonDTO {
	private Long id;
    private int numero;
    private String nom, description;
    private TypeEnum type;
    private CaracteristiquesDTO caracteristiques;
    
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

   public CaracteristiquesDTO getCaracteristiques() {
       return caracteristiques;
   }

   public void setCaracteristiques(CaracteristiquesDTO caracteristiques) {
       this.caracteristiques = caracteristiques;
   }

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

}
