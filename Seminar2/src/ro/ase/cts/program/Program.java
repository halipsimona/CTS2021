package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.readers.AngajatReader;
import ro.ase.cts.readers.AplicantReader;
import ro.ase.cts.readers.ElevReader;
import ro.ase.cts.readers.StudentReader;

public class Program {
	
	//functie
	public static List<Aplicant> readAplicanti(AplicantReader aplicantReader) throws FileNotFoundException{
		return aplicantReader.readAplicant();
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicant;
	Proiect proiect=new Proiect(80);
		try {
			listaAplicant = readAplicanti(new ElevReader("elevi.txt"));
			for(Aplicant aplicant:listaAplicant) {
				System.out.println(aplicant.toString());
				System.out.print(aplicant.get_Suma_finantare());
				aplicant.afisareStatusInProiect(proiect);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
