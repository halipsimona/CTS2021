package ro.ase.cts.factorymethod.clase;

public class Fundas extends Jucator{

	public Fundas(String nume, int numar) {
		super(nume, numar);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fundas []").append(super.toString());
		return builder.toString();
	}
	

}
