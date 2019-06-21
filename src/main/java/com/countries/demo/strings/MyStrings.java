package com.countries.demo.strings;

public class MyStrings
{

	private static final String COUNTRIES_API_URL = "https://restcountries.eu";
	
	private static final String GET_ALL_COUNTRIES_API_PATH = "/rest/v2/all";
	public static final String GET_ALL_COUNTRIES_API_REST = String.format( "%s%s" , COUNTRIES_API_URL , GET_ALL_COUNTRIES_API_PATH );
	
	private static final String GET_COUNTRIES_BY_NAME_API_PATH = "/rest/v2/name/%s";
	public static final String GET_COUNTRIES_BY_NAME_API_REST = String.format( "%s%s" , COUNTRIES_API_URL , GET_COUNTRIES_BY_NAME_API_PATH );
	
	private static final String GET_COUNTRIES_BY_REGION_API_PATH = "/rest/v2/region/%s";
	public static final String GET_COUNTRIES_BY_REGION_API_REST = String.format( "%s%s" , COUNTRIES_API_URL , GET_COUNTRIES_BY_REGION_API_PATH );

}
