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

}
