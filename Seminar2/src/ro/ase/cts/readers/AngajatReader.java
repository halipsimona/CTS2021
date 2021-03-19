package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class AngajatReader extends AplicantReader{
	
	public AngajatReader(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Aplicant> readAplicant() throws FileNotFoundException {
		Scanner input = new Scanner(new File(super.fileName));
		input.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Angajat angajat=new Angajat();
			super.readSingleAplicant(input, angajat);
			int salariu = input.nextInt();
			angajat.setSalariu(salariu);
			String ocupatie = input.next();
			angajat.setOcupatie(ocupatie);
			angajati.add(angajat);
		}
		input.close();
		return angajati;
	}

	


}
