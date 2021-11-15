package com.univlittoral.pokemon.dto;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.univlittoral.pokemon.enums.TypeEnum;

@Entity
@Table(name="pokemon")public class PokemonDO {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="ID")
		private Long id;
		
		@Column(name="NUMERO")
		private int numero;
		
		@Column(name="NOM")
		private String nom;
		
		@Column(name="Description")
		private String description;
		
		@Column(name="TYPE")
		@Enumerated(EnumType.STRING)
		private TypeEnum type;
		
		@Column(name="TAILLE")
		private int taille;
		
		@Column(name="POIDS")
		private int poids;
		
		@Column(name="CATEGORIE")
		private String categorie;
		
		@Column(name="TALENT")
		private String talent;
		
		@Column(name="FORCEE")
		private String force;
		
		@Column(name="FAIBLESSE")
		private String faiblesse;
		

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

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

		public int getTaille() {
			return taille;
		}

		public void setTaille(int taille) {
			this.taille = taille;
		}

		public int getPoids() {
			return poids;
		}

		public void setPoids(int poids) {
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
		
		
}
