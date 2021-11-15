package com.univlittoral.pokemon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.univlittoral.pokemon.dto.PokemonDO;
import com.univlittoral.pokemon.dto.PokemonDTO;
import com.univlittoral.pokemon.dto.PokemonRequestDTO;
import com.univlittoral.pokemon.enums.TypeEnum;
import com.univlittoral.pokemon.mapper.PokemonMapper;

@RestController
@RequestMapping(value = "/rest/bd/pokemons/")
@Transactional

public class PokemonBD {
		@Autowired
	    private PokemonBO pokemonBO;
		
		@GetMapping
	    final List<PokemonDTO> getPokemons() {
	        final List<PokemonDO> pokemonsDO = pokemonBO.findAll();
	        return PokemonMapper.map(pokemonsDO);
	    }

		@GetMapping(value="{id}")
	    final PokemonDTO getPokemon(@PathVariable Long id) {
	        
	        final PokemonDO entities = pokemonBO.findOne(id);
	        
	         return PokemonMapper.map(entities);
	        
	    }
		
		   @PostMapping(value = "/")
		    void postPokemon(@RequestBody PokemonRequestDTO pokemonRequestDTO) {
		        final PokemonDO pokemonDO = new PokemonDO();

		        pokemonDO.setId(pokemonRequestDTO.getId());
		        pokemonDO.setNumero(pokemonRequestDTO.getNumero());
		        pokemonDO.setNom(pokemonRequestDTO.getNom());
		        pokemonDO.setDescription(pokemonRequestDTO.getDescription());
		        pokemonDO.setType(pokemonRequestDTO.getType());
		        pokemonDO.setFaiblesse(pokemonRequestDTO.getFaiblesse());
		        pokemonDO.setForce(pokemonRequestDTO.getForce());
		        pokemonDO.setTalent(pokemonRequestDTO.getTalent());
		        pokemonDO.setCategorie(pokemonRequestDTO.getCategorie());
		        pokemonDO.setPoids(pokemonRequestDTO.getPoids());
		        pokemonDO.setTaille(pokemonRequestDTO.getTaille());

		        pokemonBO.saveOne(pokemonDO);
		    }

		
		@PutMapping(value="{id}")
		final void UpdateUtilisateur(@RequestBody PokemonRequestDTO update, @PathVariable Long id) {
			final PokemonDO userdo = pokemonBO.findOne(id);
			userdo.setNumero(update.getNumero());
			userdo.setNom(update.getNom());
			userdo.setDescription(update.getDescription());
			userdo.setType(update.getType());
			userdo.setTaille(update.getTaille());
			userdo.setCategorie(update.getCategorie());
			userdo.setFaiblesse(update.getFaiblesse());
			userdo.setForce(update.getForce());
			userdo.setPoids(update.getPoids());
			userdo.setTalent(update.getTalent());
			pokemonBO.saveOne(userdo);
		}
				
		@DeleteMapping(value="{id}") 
		void DeleteUtilisateur(@PathVariable Long id) {
			final PokemonDO user = pokemonBO.findOne(id);
			pokemonBO.deleteOne(user);
		}
		
	//	@GetMapping(value="/type")
//			final List<PokemonDTO> getPokemonByType(@RequestParam TypeEnum type){
//			final List<PokemonDO> pokemonDO = pokemonBO.findByType(type);
//			return PokemonMapper.map(pokemonDO);
//		}

		
		
		}
		

