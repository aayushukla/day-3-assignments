package tests;

import static org.junit.Assert.*;

import org.junit.*;

import main.Country;

public class CountryTest {

	Country countries[];

	@Before
	public void setUp()
	{
		countries=new Country[4];
		countries[0]=new Country("India",10000,45000);
		countries[1]=new Country("China",1030,3500000);
		countries[2]=new Country("Canada",4000,15000);
		countries[3]=new Country("Italy",6000,22000);
	}

	@Test
	public void testForCountryWithLargestPopulation()
	{
		Country expectedValue=new Country ("India",10000,45000);
		Country actualValue= new Country().largestPopulation(countries);
		assertEquals(expectedValue.countryName,actualValue.countryName);
	}

	@Test
	public void testForCountryWithLargestArea()
	{
		Country expectedValue=new Country ("China",1030,350000);
		Country actualValue= new Country().largestArea(countries);
		assertEquals(expectedValue.countryName,actualValue.countryName);
	}
	
	@Test
	public void testForCountryWithLargestPopulationDensity()
	{
		Country expectedValue=new Country ("China",1030,350000);
		Country actualValue= new Country().largestPopulationDensity(countries);
		assertEquals(expectedValue.countryName,actualValue.countryName);
	}				

}