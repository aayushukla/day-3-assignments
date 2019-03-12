package tests;

import static org.junit.Assert.*;

import org.junit.*;

import main.Date;

public class DateTest {

	Date obj;
	Date obj1;
	Date obj2;
	
	@Before
	public void setUp()
	{
		obj= new Date(21,10,2020);
		obj1= new Date(20,10,2019);
	}

	@Test
	public void testValidOutputForStringOutput()
	{
		assertEquals("21/10/2020", obj.toString());
	}

	@Test
	public void testWhichDateIsSmaller()
	{
		assertTrue(obj1.isSmaller(obj));
	}

	@Test
	public void testDifferenceOfDates()
	{
		int[] myArr={1,0,1};	
		assertArrayEquals(myArr,obj.diff(obj1));
	}

}
































