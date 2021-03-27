package ro.ase.cts.spital.clase;

public class Brancardier extends PersonalMedical{

	public Brancardier(String nume, int salariu) {
		super(nume, salariu);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder("Brancardier: ");
		builder.append(super.toString());
		return builder.toString();
	}

}
