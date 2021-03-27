package ro.ase.cts.fs.clase;

public abstract class PersonalMedical {

	private String nume;
	private int salariu;
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getSalariu() {
		return salariu;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	public PersonalMedical(String nume, int salariu) {
		super();
		this.nume = nume;
		this.salariu = salariu;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PersonalMedical [nume=");
		builder.append(nume);
		builder.append(", salariu=");
		builder.append(salariu);
		builder.append("]");
		return builder.toString();
	}
	
	
}
