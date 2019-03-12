package tests;

import static org.junit.Assert.*;

import org.junit.*;

import main.Triangle;

public class TriangleTest {
	
	Triangle obj;
	@Before
	public void setUp()
	{
		obj= new Triangle(3,4,5);
	}
	
	@Test
	public void testForRightAngledTriangle()
	{
		assertTrue(obj.isRight());
	}

	@Test
	public void testForScaleneTriangle()
	{
		assertTrue(obj.isScalene());
	}

	@Test
	public void testForIsoscelesTriangle()
	{
		assertTrue(obj.isIsosceles());
	}

	@Test
	public void testForEquilateralTriangle()
	{
		assertTrue(obj.isEquilateral());
	}
}