package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

public class StudentReader extends AplicantReader{
	
	public StudentReader(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Aplicant> readAplicant() throws FileNotFoundException, NumberFormatException {
		Scanner input = new Scanner(new File(super.fileName));
		input.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Student student=new Student();
			super.readSingleAplicant(input, student);
			
			int an_studii = input.nextInt();
			student.setAn_studii(an_studii);
			String facultate = (input.next()).toString();
			student.setFacultate(facultate);
			studenti.add(student);
		}
		input.close();
		return studenti;
	}
}
