package com.countryservice.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.BaseCountry;


@RestController
public class CountryController {
	
	
	static List<BaseCountry> responList=null;
	List<BaseCountry> countryList=null;

	
	@GetMapping("/countries")
	public List<BaseCountry> sortCountriesByPopulation() throws StreamReadException, DatabindException, IOException {
	String uri = "https://restcountries.com/v3.1/all";
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity=new HttpEntity<>(headers);
		
		
		
		
		String response=restTemplate.exchange(uri, HttpMethod.GET,entity,String.class).getBody();
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			responList=new ArrayList<>();
			countryList=mapper.readValue(response, new TypeReference<List<BaseCountry>>(){});
		countryList.sort((a1,a2)-> a2.getPopulation().compareTo(
		    		a1.getPopulation()));
//			countryList.stream().sorted((a1,a2)-> a2.getPopulation().compareTo(
//		    		a1.getPopulation()));
		
		
	
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return countryList;
		//return Arrays.asList(object);

	}
	
	@GetMapping("/mostBorderedCountry")
	public List<BaseCountry> getMostBorderingCoutries() throws StreamReadException, DatabindException, IOException {
	String uri = "https://restcountries.com/v3.1/all";
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers=new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity=new HttpEntity<>(headers);
		
		
	
		String response=restTemplate.exchange(uri, HttpMethod.GET,entity,String.class).getBody();
		
		ObjectMapper mapper = new ObjectMapper();
		List<BaseCountry> filteredCountryList=null;
		BaseCountry b=new BaseCountry();
		List<BaseCountry> finalList=null;
		try {
			responList=new ArrayList<>();
			countryList=mapper.readValue(response, new TypeReference<List<BaseCountry>>(){});
			filteredCountryList=countryList.stream().filter(x->x.getRegion().equalsIgnoreCase("asia")).collect(Collectors.toList());
			Collections.sort(filteredCountryList, new BorderComparator()); 
			// b=filteredCountryList.get(filteredCountryList.size()-1);
			finalList=filteredCountryList.stream().skip(filteredCountryList.size()-1).collect(Collectors.toList());
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	return finalList;
		

	}

}
