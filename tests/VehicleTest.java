package tests;

import static org.junit.Assert.*;

import org.junit.*;

import main.Vehicle;

public class VehicleTest {
	
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
		assertEquals(70,vehicle1.currentSpeed.changeSpeed());
	}

	@Test
	public void testForChangeSpeed2()
	{
		assertEquals(60,vehicle1.changeSpeed());
	}

	@Test
	public void testForChangeSpeed3()
	{
		assertEquals(140,vehicle1.changeSpeed());
	}
	
	@Test
	public void testForZeroSpeed1()
	{
		assertEquals(00,vehicle1.stopSpeed());
	}	
	
	@Test
	public void testForZeroSpeed2()
	{
		assertEquals(0,vehicle1.stopSpeed());
	}	

	@Test
	public void testForZeroSpeed3()
	{
		assertEquals(0,vehicle1.stopSpeed());
	}
}	