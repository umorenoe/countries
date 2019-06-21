package com.countries.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.countries.demo.model.Pais;
import com.countries.demo.service.CountriesService;

@RestController
public class HolaController
{
	
	@Autowired
	CountriesService countriesService;
	
	@GetMapping( value = "/paises" )
	public ResponseEntity< List<Pais> > paises()
	{
		List<Pais> pais = countriesService.getAllCountries( );
		
		if( pais == null )
		{
			return new ResponseEntity<>( HttpStatus.NOT_FOUND );
		}
		return new ResponseEntity< List<Pais> >( pais , HttpStatus.OK );
	}
	
	@GetMapping( value = "/pais/{nombrePais}" )
	public ResponseEntity< List<Pais> > paisesNombre( @PathVariable( value = "nombrePais" ) String nom )
	{
		List<Pais> pais = countriesService.getCountryByName( nom );
		
		if( pais == null )
		{
			return new ResponseEntity<>( HttpStatus.NOT_FOUND );
		}
		return new ResponseEntity< List<Pais> >( pais , HttpStatus.OK );
	}
	
	@GetMapping( value = "/continente/{nombreContinente}" )
	public ResponseEntity< List<Pais> > paisesContinente( @PathVariable( value = "nombreContinente" ) String nom )
	{
		List<Pais> paises = countriesService.getCountriesByRegion( nom );
		
		if( paises == null )
		{
			return new ResponseEntity<>( HttpStatus.NOT_FOUND );
		}
		return new ResponseEntity< List<Pais> >( paises , HttpStatus.OK );
	}
}
