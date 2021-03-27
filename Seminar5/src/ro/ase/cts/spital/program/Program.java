package ro.ase.cts.spital.program;

import ro.ase.cts.spital.clase.Factory;
import ro.ase.cts.spital.clase.PersonalMedical;
import ro.ase.cts.spital.clase.TipPersonal;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory=new Factory();
		factory.create(TipPersonal.MEDIC, "Ion", 5000);
		factory.create(TipPersonal.ASISTENT, "Popa", 2000);
		
		PersonalMedical medic= factory.create(TipPersonal.MEDIC, "Ion", 5000);
		PersonalMedical asistent= factory.create(TipPersonal.ASISTENT,"Dorian", 1200);
		
		System.out.println(medic);
		System.out.println(asistent);

	}

}
