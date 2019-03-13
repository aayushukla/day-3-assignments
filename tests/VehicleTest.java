package tests;

import static org.junit.Assert.*;

import org.junit.*;

import main.Vehicle;

public class VehicleTest extends Vehicle {
	
	Vehicle vehicle1;
	Vehicle vehicle2;
	Vehicle vehicle3;

	@Before
	public void setUp()
	{
		vehicle1=new Vehicle(50,55.5,"Aayush",2349);
		vehicle2=new Vehicle(40,121.5,"Mrunal",6249);
		vehicle3=new Vehicle(120,123.2,"Prangshu",3349);
	}

	@Test
	public void testForChangeSpeed1()
	{
		assertEquals(50,vehicle1.changeSpeed(50));
	}

	@Test
	public void testForChangeSpeed2()
	{
		assertEquals(30,vehicle2.changeSpeed(30));
	}

	@Test
	public void testForChangeSpeed3()
	{
		assertEquals(10,vehicle3.changeSpeed(10));
	}
	
	@Test
	public void testForZeroSpeed1()
	{
		assertEquals(00,stopSpeed(vehicle1.getCurrentSpeed()));
	}	
	
	@Test
	public void testForZeroSpeed2()
	{
		assertEquals(0,stopSpeed(vehicle2.getCurrentSpeed()));
	}	

	@Test
	public void testForZeroSpeed3()
	{
		assertEquals(0,stopSpeed(vehicle1.getCurrentSpeed()));
	}

	@Test
	public void testForDirectionRotation1()
	{
		assertEquals(50,vehicle1.directionRotation(5.5,"left"),0.5);
	}

	@Test
	public void testForDirectionRotation2()
	{
		assertEquals(130,vehicle2.directionRotation(8.5,"right"),0.5);
	}

	@Test
	public void testForToString()
	{
		assertEquals("50||55.5||Aayush||2349",vehicle1.toString());
	}

	
}	