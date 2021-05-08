package ro.ase.cts.command.clase;

public class ComandaDepunere extends Comanda {

	public ComandaDepunere(Executant executant, double suma) {
		super(executant, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		super.getExecutant().depuneSuma(super.getSuma());
	}

}
