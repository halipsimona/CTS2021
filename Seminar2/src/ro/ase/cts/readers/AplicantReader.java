package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public abstract class AplicantReader {
	
	public String fileName;
	
	
public AplicantReader(String fileName) {
		super();
		this.fileName = fileName;
	}


public abstract List<Aplicant> readAplicant() throws FileNotFoundException;

public void readSingleAplicant(Scanner input2, Aplicant aplicant) {
	String nume = input2.next();
	String prenume = input2.next();
	int varsta = input2.nextInt();
	int punctaj = input2.nextInt();
	int nr = input2.nextInt();
	String[] vect = new String[5];
	for (int i = 0; i < nr; i++)
		vect[i] = input2.next();
	
	aplicant.setNume(nume);
	aplicant.setPrenume(prenume);
	aplicant.setVarsta(varsta);
	aplicant.setPunctaj(punctaj);
	aplicant.setDenumiriProiecte(vect,nr);
}

}
