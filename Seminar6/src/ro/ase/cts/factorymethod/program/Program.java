package ro.ase.cts.factorymethod.program;

import ro.ase.cts.factorymethod.clase.FabricaAtacant;
import ro.ase.cts.factorymethod.clase.FabricaFundas;
import ro.ase.cts.factorymethod.clase.FabricaJucator;
import ro.ase.cts.factorymethod.clase.FabricaMijlocas;
import ro.ase.cts.factorymethod.clase.FabricaPortar;
import ro.ase.cts.factorymethod.clase.Jucator;

public class Program {
	
	public static void afiseazaInfoJucator(FabricaJucator fabrica, String nume, int numar) {
		Jucator jucator=fabrica.creeazaJucator(nume, numar);
		System.out.println(jucator.toString());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		afiseazaInfoJucator(new FabricaAtacant(),"Ionita",23);
		afiseazaInfoJucator(new FabricaPortar(),"Popa",2);
		afiseazaInfoJucator(new FabricaFundas(),"Marius",6);
		afiseazaInfoJucator(new FabricaMijlocas(),"Darius",12);
		
	}


}
