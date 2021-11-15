package com.univlittoral.pokemon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.univlittoral.pokemon.dto.PokemonDO;
import com.univlittoral.pokemon.enums.TypeEnum;

@Repository
public interface PokemonRepository extends JpaRepository<PokemonDO, Long> {

	    List<PokemonDO> findByType(final TypeEnum type);



}
