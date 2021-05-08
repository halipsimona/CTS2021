package ro.ase.cts.chain.clase;

public abstract class Handler {
	private double sold;
	private Handler succesor;

	public abstract void realizeazaPlata(double suma);

	public Handler(double sold) {
		super();
		this.sold = sold;
		this.succesor=null;
	}

	public double getSold() {
		return sold;
	}

	public void setSold(double sold) {
		this.sold = sold;
	}

	public Handler getSuccesor() {
		return succesor;
	}

	public void setSuccesor(Handler succesor) {
		this.succesor = succesor;
	}
	
}
