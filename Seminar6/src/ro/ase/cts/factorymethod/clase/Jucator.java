package ro.ase.cts.factorymethod.clase;

public abstract class Jucator {

	private String nume;
	private int numar;
	public Jucator(String nume, int numar) {
		super();
		this.nume = nume;
		this.numar = numar;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setNumar(int numar) {
		this.numar = numar;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jucator [nume=");
		builder.append(nume);
		builder.append(", numar=");
		builder.append(numar);
		builder.append("]");
		return builder.toString();
	}
	
}
