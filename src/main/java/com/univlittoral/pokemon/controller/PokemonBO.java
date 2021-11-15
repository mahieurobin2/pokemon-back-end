package com.univlittoral.pokemon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univlittoral.pokemon.dto.PokemonDO;
import com.univlittoral.pokemon.enums.TypeEnum;
import com.univlittoral.pokemon.repository.PokemonRepository;


@Service

public class PokemonBO {
	@Autowired
	private PokemonRepository repo;
	
	public List<PokemonDO> findAll() {
		return repo.findAll();
	}

	public PokemonDO findOne(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	
	public void saveOne(PokemonDO pokemon) {
		repo.save(pokemon);
	}
	
	public void deleteOne(PokemonDO pokemon) {
		repo.delete(pokemon);
	}
	
//	public List<PokemonDO> findByType(TypeEnum type){
//		return PokemonRepository.findByType(type);
//	}


}
