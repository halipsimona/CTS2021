package ro.ase.cts.clase;

public class Hamster {
	public String nume;
	private String rasa;
	private int varsta;
	private int greutate;
	private Hamster(String nume, String rasa, int varsta, int greutate) {
		super();
		this.nume = nume;
		this.rasa = rasa;
		this.varsta = varsta;
		this.greutate = greutate;
	}
	
	private Hamster() {
		this.nume="";
		this.rasa="";
		this.varsta=0;
		this.greutate=0;
	}



	public void setNume(String nume) {
		this.nume = nume;
	}



	public void setRasa(String rasa) {
		this.rasa = rasa;
	}



	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}



	public void setGreutate(int greutate) {
		this.greutate = greutate;
	}
	
	private static Hamster hamster=null;
	
	public static synchronized Hamster getInstance(String nume, String rasa, int varsta, int greutate) {
		if(hamster==null) {
			hamster=new Hamster(nume,rasa,varsta,greutate);
		}
		return hamster;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hamster [nume=");
		builder.append(nume);
		builder.append(", rasa=");
		builder.append(rasa);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", greutate=");
		builder.append(greutate);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
