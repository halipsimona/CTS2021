package ro.ase.cts.command.clase;

public class ComandaCreare extends Comanda{

	public ComandaCreare(Executant executant, double suma) {
		super(executant, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		super.getExecutant().constituieCont(super.getSuma());
	}
	

}
