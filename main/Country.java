package main;

public class Country {

	public String countryName;
	public long population;
	public long areaOfCountry;
	
	public Country()
	{
	}

	public Country(String countryName,long population,long areaOfCountry)
	{
		this.countryName=countryName;
		this.population=population;
		this.areaOfCountry=areaOfCountry;
	}
	public Country largestPopulation(Country arr[])
	{
		int index=0;
		long value=arr[0].population;
		int x;
		for(x=1;x<arr.length;x++)
		{
			if(arr[x].population>value)
			{
				value=arr[x].population;
				index=x;
			}
		}
		return arr[index];
	}
	
	public Country largestArea(Country arr[])
	{
		int index=0;
		long value=arr[0].areaOfCountry;
		int x;
		for(x=1;x<arr.length;x++)
		{
			if(arr[x].areaOfCountry>value)
			{
				value=arr[x].areaOfCountry;
				index=x;
			}
		}
		return arr[index];
	}

	public Country largestPopulationDensity(Country arr[])
	{
		int index=0;
		long value=arr[0].areaOfCountry/arr[0].population;
		int x;
		for(x=1;x<arr.length;x++)
		{
			if(arr[x].areaOfCountry/arr[x].population>value)
			{
				value=arr[x].areaOfCountry/arr[x].population;
				index=x;
			}
		}
		return arr[index];
	}
	
}	
	

	