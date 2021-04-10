package ro.ase.cts.program;

import ro.ase.cts.clase.AdapterClaseLeasing;
import ro.ase.cts.clase.AdapterLeasing;
import ro.ase.cts.clase.Creditable;
import ro.ase.cts.clase.Leasing;

public class Program {

	public static void printeazaInfoCredit(Creditable credit) {
		credit.crediteaza();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Leasing leasing=new Leasing("Ionel",2500);
		AdapterLeasing adapter=new AdapterLeasing(leasing);
		printeazaInfoCredit(adapter);
		
		AdapterClaseLeasing adapterClase=new AdapterClaseLeasing("Tomescu",6800);
		printeazaInfoCredit(adapterClase);
	}

}
