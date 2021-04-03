package ro.ase.cts.factorymethod.clase;

public class Portar extends Jucator {

	public Portar(String nume, int numar) {
		super(nume, numar);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Portar []").append(super.toString());
		return builder.toString();
	}
	

}
