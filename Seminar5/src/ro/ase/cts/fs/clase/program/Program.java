package ro.ase.cts.fs.clase.program;

import ro.ase.cts.fs.clase.FactorySingleton;
import ro.ase.cts.fs.clase.PersonalMedical;
import ro.ase.cts.fs.clase.TipPersonal;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersonalMedical medic2 = FactorySingleton.getInstance().create(TipPersonal.MEDIC, "Laura", 70000);

        System.out.println(medic2);

	}

}
