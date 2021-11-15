package com.univlittoral.pokemon.mapper;

import java.util.ArrayList;
import java.util.List;

import com.univlittoral.pokemon.dto.CaracteristiquesDTO;
import com.univlittoral.pokemon.dto.PokemonDO;
import com.univlittoral.pokemon.dto.PokemonDTO;

public class PokemonMapper {
    public final static List<PokemonDTO> map(final List<PokemonDO> entities) {
        final List<PokemonDTO> listPokemon = new ArrayList<PokemonDTO>();
        final CaracteristiquesDTO caracteristiquesDTO = new CaracteristiquesDTO();
        if (null == entities) {
            return null;
        }
        for(PokemonDO pokemonDO : entities) {         
            listPokemon.add(map(pokemonDO));
        }
        return listPokemon;
    }
    
    public final static PokemonDTO map(final PokemonDO pokemonDO) {
        final PokemonDTO pokemonDTO = new PokemonDTO();
        final CaracteristiquesDTO caracteristiquesDTO = new CaracteristiquesDTO();
        
        pokemonDTO.setNumero(pokemonDO.getNumero());
        pokemonDTO.setNom(pokemonDO.getNom());
        pokemonDTO.setDescription(pokemonDO.getDescription());
        pokemonDTO.setType(pokemonDO.getType());
        pokemonDTO.setId(pokemonDO.getId());
        
        caracteristiquesDTO.setCategorie(pokemonDO.getCategorie());
        caracteristiquesDTO.setFaiblesse(pokemonDO.getFaiblesse());
        caracteristiquesDTO.setForce(pokemonDO.getForce());
        caracteristiquesDTO.setPoids(pokemonDO.getPoids());
        caracteristiquesDTO.setTaille(pokemonDO.getTaille());
        caracteristiquesDTO.setTalent(pokemonDO.getTalent());
        pokemonDTO.setCaracteristiques(caracteristiquesDTO);
        return pokemonDTO;
    }
    
}