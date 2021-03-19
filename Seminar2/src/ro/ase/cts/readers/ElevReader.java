package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class ElevReader extends AplicantReader {
	public ElevReader(String fileName) {
		super(fileName);
		// TODO Auto-generated constructor stub
	}

	@Override
	
	public List<Aplicant> readAplicant()  throws FileNotFoundException {
		Scanner input = new Scanner(new File(super.fileName));
		input.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Elev elev=new Elev();
			super.readSingleAplicant(input, elev);
			int clasa = input.nextInt();
			elev.setClasa(clasa);
			String tutore = input.next();
			elev.setTutore(tutore);
			elevi.add(elev);
		}

		input.close();
		return elevi;
	}

}
