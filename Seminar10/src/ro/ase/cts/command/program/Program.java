package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.ComandaCreare;
import ro.ase.cts.command.clase.ComandaDepunere;
import ro.ase.cts.command.clase.ComandaRetragere;
import ro.ase.cts.command.clase.Executant;
import ro.ase.cts.command.clase.ManagerComenzi;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ManagerComenzi manager=new ManagerComenzi();
		Executant executant=new Executant("Ionescu");
		
		ComandaCreare comandaCreare=new ComandaCreare(executant,1200);
		ComandaDepunere comandaDepunere=new ComandaDepunere(executant,200);
		ComandaRetragere comandaRetragere1=new ComandaRetragere(executant,800);
		ComandaRetragere comandaRetragere2=new ComandaRetragere(executant,900);
		ComandaRetragere comandaRetragere3=new ComandaRetragere(executant,100);
		
		manager.adaugaComanda(comandaCreare);manager.executa();
		manager.adaugaComanda(comandaDepunere);manager.executa();
		manager.adaugaComanda(comandaRetragere1);manager.executa();
		manager.adaugaComanda(comandaRetragere2);manager.executa();
		manager.adaugaComanda(comandaRetragere3);manager.executa();
		manager.executa();
	}

}
