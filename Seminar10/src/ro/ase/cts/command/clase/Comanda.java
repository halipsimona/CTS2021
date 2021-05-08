package ro.ase.cts.command.clase;

public abstract class Comanda {

	private Executant executant;
	private double suma;

	public Comanda(Executant executant, double suma) {
		super();
		this.executant = executant;
		this.suma=suma;
	}

	public Executant getExecutant() {
		return executant;
	}

	public void setExecutant(Executant executant) {
		this.executant = executant;
	}

	public double getSuma() {
		return suma;
	}

	public void setSuma(double suma) {
		this.suma = suma;
	}
	
	public abstract void executa();
	
	
}
