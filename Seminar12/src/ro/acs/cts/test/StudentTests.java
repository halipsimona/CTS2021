package ro.acs.cts.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.acs.cts.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorWorksCorrectlyForName() {
		String nume="Dan";
		Student student=new Student(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testSetNumeWorksCorrectlyForName() {
		String nume="Dan";
		Student student=new Student();
		student.setNume(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testConstructorWithoutFieldsWorksCorrectly() {
		Student student=new Student();
		assertNotNull("Lista de note nu a fost initializata",student.getNote());
		assertNotNull("Numele nu a fost initializat",student.getNume());
	}
	
	@Test
	public void testAdaugaNotaWorksCorrectly() {
		Student student=new Student();
		int nota=10;
		student.adaugaNota(nota);
		assertEquals(nota,student.getNota(0));
	}
	
	@Test
	public void testGetNotaWorksCorrectly() {
		Student student=new Student();
		student.adaugaNota(10);
		student.adaugaNota(9);
		student.adaugaNota(7);
		student.adaugaNota(8);
		assertEquals(9,student.getNota(1));
	}
	@Test
	public void testAdaugaOSinguraNotaWorksCorrectly() {
		Student student=new Student();
		int nota=10;
		student.adaugaNota(nota);
		assertEquals(1,student.getNote().size());
	}
	
	@Test
	public void testAdaugaNotaIncorecta() {
		Student student=new Student();
		int nota=-1;
		//1
		try {
			//2
			student.adaugaNota(nota);
			//3 nu ajunge aici
			fail("Nu trebuia sa ajunga aici: metoda nu arunca exceptii.");
		}catch(IllegalArgumentException iae) {
			//4
		}
		catch(Exception e) {
			//5 nu ajunge aici
			fail("Exceptia gresita. Nu arunca exceptie de tipul IllegalArgumentException.");
		}
		//6
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAdaugaNotaIncorectaJUnit4() {
		Student student=new Student();
		int nota=-1;
		student.adaugaNota(nota);
		
	}
	
	@Test
	public void testStudentAreRestante() {
		Student student=new Student();
		student.adaugaNota(7);
		boolean rezultat=student.areRestante();
		assertFalse(rezultat);
		
	}
	
	@Test
	public void testCalculeazaMedieCorect() {
		Student student=new Student();
		student.adaugaNota(7);
		student.adaugaNota(5);
		student.adaugaNota(6);
		student.adaugaNota(5);
		assertEquals(5.75, student.calculeazaMedie(),0.00001);
		
	}

}
