package ro.ase.cts.factorymethod.clase;

public class FabricaFundas implements FabricaJucator{

	@Override
	public Jucator creeazaJucator(String nume, int numar) {
		// TODO Auto-generated method stub
		return new Atacant(nume,numar);
	}

}
