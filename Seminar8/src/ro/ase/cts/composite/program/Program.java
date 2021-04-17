package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.Produs;
import ro.ase.cts.composite.clase.Sectiune;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sectiune bauturi=new Sectiune("bauturi");
		Sectiune desert=new Sectiune("desert");
		
		Produs limonada=new Produs("limonada");
		Produs frappe=new Produs("frappe");
		Produs cheesecake=new Produs("cheese cake");
		
		bauturi.adaugaNod(limonada);
		bauturi.adaugaNod(frappe);
		desert.adaugaNod(cheesecake);
		
		Sectiune meniu=new Sectiune("meniu");
		meniu.adaugaNod(bauturi);
		meniu.adaugaNod(desert);
		
		meniu.printareElement();
		
	   bauturi.stergeNod(frappe);
	   desert.adaugaNod(frappe);
	   
	   meniu.printareElement();
	}

}
