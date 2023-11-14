package com.pojo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseCountry{
    public Name name;
    public ArrayList<String> tld;
    public String cca2;
    public String ccn3;
    public String cca3;
    public String cioc;
    public boolean independent;
    public String status;
    public boolean unMember;
    public Currencies currencies;
    public Idd idd;
    public ArrayList<String> capital;
    public ArrayList<String> altSpellings;
    public String region;
    public String subregion;
    public Languages languages;
    public Translations translations;
    public ArrayList<Double> latlng;
    public boolean landlocked;
    public ArrayList<String> borders;

    public double area;
    public Demonyms demonyms;
    public String flag;
    public Maps maps;
    public Integer population;
    public Gini gini;
    public String fifa;
    public Car car;
    public ArrayList<String> timezones;
    public ArrayList<String> continents;
    public Flags flags;
    public CoatOfArms coatOfArms;
    public String startOfWeek;
    public CapitalInfo capitalInfo;
    public PostalCode postalCode;
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public ArrayList<String> getTld() {
		return tld;
	}
	public void setTld(ArrayList<String> tld) {
		this.tld = tld;
	}
	public String getCca2() {
		return cca2;
	}
	public void setCca2(String cca2) {
		this.cca2 = cca2;
	}
	public String getCcn3() {
		return ccn3;
	}
	public void setCcn3(String ccn3) {
		this.ccn3 = ccn3;
	}
	public String getCca3() {
		return cca3;
	}
	public void setCca3(String cca3) {
		this.cca3 = cca3;
	}
	public String getCioc() {
		return cioc;
	}
	public void setCioc(String cioc) {
		this.cioc = cioc;
	}
	public boolean isIndependent() {
		return independent;
	}
	public void setIndependent(boolean independent) {
		this.independent = independent;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isUnMember() {
		return unMember;
	}
	public void setUnMember(boolean unMember) {
		this.unMember = unMember;
	}
	public Currencies getCurrencies() {
		return currencies;
	}
	public void setCurrencies(Currencies currencies) {
		this.currencies = currencies;
	}
	public Idd getIdd() {
		return idd;
	}
	public void setIdd(Idd idd) {
		this.idd = idd;
	}
	public ArrayList<String> getCapital() {
		return capital;
	}
	public void setCapital(ArrayList<String> capital) {
		this.capital = capital;
	}
	public ArrayList<String> getAltSpellings() {
		return altSpellings;
	}
	public void setAltSpellings(ArrayList<String> altSpellings) {
		this.altSpellings = altSpellings;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getSubregion() {
		return subregion;
	}
	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}
	public Languages getLanguages() {
		return languages;
	}
	public void setLanguages(Languages languages) {
		this.languages = languages;
	}
	public Translations getTranslations() {
		return translations;
	}
	public void setTranslations(Translations translations) {
		this.translations = translations;
	}
	public ArrayList<Double> getLatlng() {
		return latlng;
	}
	public void setLatlng(ArrayList<Double> latlng) {
		this.latlng = latlng;
	}
	public boolean isLandlocked() {
		return landlocked;
	}
	public void setLandlocked(boolean landlocked) {
		this.landlocked = landlocked;
	}
	public ArrayList<String> getBorders() {
		return borders;
	}
	public void setBorders(ArrayList<String> borders) {
		this.borders = borders;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public Demonyms getDemonyms() {
		return demonyms;
	}
	public void setDemonyms(Demonyms demonyms) {
		this.demonyms = demonyms;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public Maps getMaps() {
		return maps;
	}
	public void setMaps(Maps maps) {
		this.maps = maps;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	public Gini getGini() {
		return gini;
	}
	public void setGini(Gini gini) {
		this.gini = gini;
	}
	public String getFifa() {
		return fifa;
	}
	public void setFifa(String fifa) {
		this.fifa = fifa;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public ArrayList<String> getTimezones() {
		return timezones;
	}
	public void setTimezones(ArrayList<String> timezones) {
		this.timezones = timezones;
	}
	public ArrayList<String> getContinents() {
		return continents;
	}
	public void setContinents(ArrayList<String> continents) {
		this.continents = continents;
	}
	public Flags getFlags() {
		return flags;
	}
	public void setFlags(Flags flags) {
		this.flags = flags;
	}
	public CoatOfArms getCoatOfArms() {
		return coatOfArms;
	}
	public void setCoatOfArms(CoatOfArms coatOfArms) {
		this.coatOfArms = coatOfArms;
	}
	public String getStartOfWeek() {
		return startOfWeek;
	}
	public void setStartOfWeek(String startOfWeek) {
		this.startOfWeek = startOfWeek;
	}
	public CapitalInfo getCapitalInfo() {
		return capitalInfo;
	}
	public void setCapitalInfo(CapitalInfo capitalInfo) {
		this.capitalInfo = capitalInfo;
	}
	public PostalCode getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(PostalCode postalCode) {
		this.postalCode = postalCode;
	}
    
    
    
    
    
}



 class Ara{
    public String official;
    public String common;
}

 class Bre{
    public String official;
    public String common;
}

 class CapitalInfo{
    public ArrayList<Double> latlng;
}

/*
 * class Car{ public ArrayList<String> signs; public String side; }
 */

 class Ces{
    public String official;
    public String common;
}

 @JsonIgnoreType
 class CoatOfArms{
}
 @JsonIgnoreType
 class Currencies{
    @JsonProperty("USD") 
    public USD uSD;
}

 class Cym{
    public String official;
    public String common;
}
 @JsonIgnoreType
 class Demonyms{
    public Eng eng;
}
 class Deu{
    public String official;
    public String common;
}

 class Eng{
    public String official;
    public String common;
    public String f;
    public String m;
}

 class Est{
    public String official;
    public String common;
}

 class Fin{
    public String official;
    public String common;
}

 @JsonIgnoreType
 class Flags{
    public String png;
    public String svg;
}

 class Fra{
    public String official;
    public String common;
}
 class Hrv{
    public String official;
    public String common;
}

 class Hun{
    public String official;
    public String common;
}

/*
 * class Idd{ public String root; public ArrayList<String> suffixes; }
 */

 class Ita{
    public String official;
    public String common;
}

 class Jpn{
    public String official;
    public String common;
}

 class Kor{
    public String official;
    public String common;
}

 @JsonIgnoreType
 class Languages{
    public String eng;
}
 @JsonIgnoreType
 class Gini{
	    public double year;
	}

 class Maps{
    public String googleMaps;
    public String openStreetMaps;
}

 

 

 class Nld{
    public String official;
    public String common;
}

 class Per{
    public String official;
    public String common;
}

 class Pol{
    public String official;
    public String common;
}

 class Por{
    public String official;
    public String common;
}

 class PostalCode{
    public String format;
    public String regex;
}



 class Rus{
    public String official;
    public String common;
}

 class Slk{
    public String official;
    public String common;
}

 class Spa{
    public String official;
    public String common;
}

 class Srp{
    public String official;
    public String common;
}

 class Swe{
    public String official;
    public String common;
}

 class Translations{
    public Ara ara;
    public Bre bre;
    public Ces ces;
    public Cym cym;
    public Deu deu;
    public Est est;
    public Fin fin;
    public Fra fra;
    public Hrv hrv;
    public Hun hun;
    public Ita ita;
    public Jpn jpn;
    public Kor kor;
    public Nld nld;
    public Per per;
    public Pol pol;
    public Por por;
    public Rus rus;
    public Slk slk;
    public Spa spa;
    public Srp srp;
    public Swe swe;
    public Tur tur;
    public Urd urd;
    public Zho zho;
}

 class Tur{
    public String official;
    public String common;
}

 class Urd{
    public String official;
    public String common;
}

 class USD{
    public String name;
    public String symbol;
}

 class Zho{
    public String official;
    public String common;
}


