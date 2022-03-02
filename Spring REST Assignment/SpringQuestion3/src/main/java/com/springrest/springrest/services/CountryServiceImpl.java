package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entity.Country;

@Service
public class CountryServiceImpl implements CountryService {

	List<Country> countryList;

	public CountryServiceImpl() {
		countryList = new ArrayList(Arrays.asList(new Country(99501, "ANCHORAGE", "AK", "US"),
				new Country(99502, "Gurgaon", "Harayana", "India"), new Country(99503, "Jalandhar", "Punjab", "India"),
				new Country(99504, "Fridabad", "Harayana", "India"),
				new Country(99505, "Gorakhpur", "Uttar pradesh", "India")));

	}

	/*
	 * @Override public List<Country> getCountries() { return countryList; }
	 */

	@Override
	public Country getCountryById(long zipCode) {
		for (Country country : countryList) {
			if (country.getZipcode() == zipCode) {
				return country;
			}
		}
		return null;
	}

}
