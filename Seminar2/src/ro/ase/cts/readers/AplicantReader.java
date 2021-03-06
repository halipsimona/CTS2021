package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public interface AplicantReader {
	
public List<Aplicant> readAplicant(String fileName) throws FileNotFoundException;

}
