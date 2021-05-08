package ro.ase.cts.chain.program;

import ro.ase.cts.chain.clase.ContCredit;
import ro.ase.cts.chain.clase.ContCurent;
import ro.ase.cts.chain.clase.ContEconomii;
import ro.ase.cts.chain.clase.Handler;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handler contCurent=new ContCurent(200);
		Handler contEconomii=new ContEconomii(600);
		Handler contCredit=new ContCredit(100);
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		
		contCurent.realizeazaPlata(100);
		contCurent.realizeazaPlata(110);
		contCurent.realizeazaPlata(50);
		contCurent.realizeazaPlata(760);
		contCurent.realizeazaPlata(160);
		contCurent.realizeazaPlata(60);

	}

}
