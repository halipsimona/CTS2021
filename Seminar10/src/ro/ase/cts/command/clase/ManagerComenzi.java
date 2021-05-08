package ro.ase.cts.command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {

	List<Comanda> lista=new ArrayList<>();
			
	public void adaugaComanda(Comanda comanda) {
		this.lista.add(comanda);
	}
	
	public void executa() {
		if(lista.size()>0) {
			this.lista.get(0).executa();
			this.lista.remove(0);
			System.out.println("Comanda executata.");
		}else {
			System.out.println("Nu exista comenzi");
		}
	}

}
