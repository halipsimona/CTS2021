package ro.ase.cts.command.clase;

public class ComandaRetragere extends Comanda {

	public ComandaRetragere(Executant executant, double suma) {
		super(executant, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		super.getExecutant().retrageSuma(super.getSuma());
		
	}

}
