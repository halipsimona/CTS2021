package ro.ase.cts.teste;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import ro.ase.cts.clse.Grupa;

public class GroupTest {

	@Test
	public void testConstructorRight() {
		Grupa grupa=new Grupa(1086);
		assertEquals(1086, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorUpperBoundary() {
		Grupa grupa=new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}

	@Test
	public void testConstructorLowerBoundary() {
		Grupa grupa=new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorException1() {
		Grupa grupa=new Grupa(1900);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorException2() {
		Grupa grupa=new Grupa(100);
		
	}
	
	@Test(timeout = 500)
	public void testConstructorPerformance() {
		Grupa grupa=new Grupa(1100);
		
	}
	@Test
	public void testConstructorRange() {
		Grupa grupa=new Grupa(1001);
		assertEquals(1001,grupa.getNrGrupa());
		Grupa grupa1=new Grupa(1099);
		assertEquals(1099,grupa1.getNrGrupa());
		
	}
	@Test
	public void testConstructorExistence() {
		Grupa grupa=new Grupa(1001);
		assertNotNull(grupa.getStudenti());
		
	}
}
