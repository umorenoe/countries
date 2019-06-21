package com.countries.demo.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.countries.demo.model.Pais;
import com.countries.demo.strings.MyStrings;

@Service
public class CountriesService
{

	public List<Pais> getAllCountries()
	{
		List<Pais> paises;
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<List<Pais>> response = restTemplate.exchange( 
				MyStrings.GET_ALL_COUNTRIES_API_REST,
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference< List<Pais> >( ) { }
				);
		
		paises = response.getBody();
		return paises;
	}
	
	public List<Pais> getCountryByName( String nom )
	{
		List<Pais> paises;
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<List<Pais>> response = restTemplate.exchange( 
				String.format( MyStrings.GET_COUNTRIES_BY_NAME_API_REST , nom ),
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference< List<Pais> >( ) { }
				);
		
		paises = response.getBody();
		return paises;
	}

	public List<Pais> getCountriesByRegion( String reg )
	{
		List<Pais> paises;
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<List<Pais>> response = restTemplate.exchange( 
				String.format( MyStrings.GET_COUNTRIES_BY_REGION_API_REST , reg ),
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference< List<Pais> >( ) { }
				);
		
		paises = response.getBody();
		return paises;
	}
}
