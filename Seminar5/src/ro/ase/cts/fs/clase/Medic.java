package ro.ase.cts.fs.clase;

public class Medic extends PersonalMedical{

	public Medic(String nume, int salariu) {
		super(nume, salariu);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder("Medic: ");
		builder.append(super.toString());
		return builder.toString();
	}
}
