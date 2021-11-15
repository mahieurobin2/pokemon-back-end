/**
 * 
 */
package com.univlittoral.pokemon.controller;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author antoineoffroy
 *
 */

@RestController
@RequestMapping
@Transactional
public class TestBD {
	
	@GetMapping
	public String getMethodtest() {
		return "Wow amazing it works :O!";	
	}
}
