package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class AplicantReader {
	
	public String fileName;
	
	
public AplicantReader(String fileName) {
		super();
		this.fileName = fileName;
	}


public abstract List<Aplicant> readAplicant() throws FileNotFoundException;

public void readSingleAplicant(Scanner input, Aplicant aplicant) {
	String nume = input.next();
	String prenume = input.next();
	int varsta = input.nextInt();
	int punctaj = input.nextInt();
	int numar_proiecte = input.nextInt();
	String[] denumiri_proiecte = new String[5];
	for (int i = 0; i < numar_proiecte; i++)
		denumiri_proiecte[i] = input.next();
	
	aplicant.setNume(nume);
	aplicant.setPrenume(prenume);
	aplicant.setVarsta(varsta);
	aplicant.setPunctaj(punctaj);
	aplicant.setDenumiriProiecte(denumiri_proiecte,numar_proiecte);
}

}
