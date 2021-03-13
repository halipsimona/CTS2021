package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int nr_proiecte;
	protected String[] denumireProiect;
	protected float suma_finantare;
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public int getVarsta() {
		return varsta;
	}
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	public void afisareStatusInProiect(Proiect proiect){
		StringBuilder builder=new StringBuilder();
		builder.append("Aplicantul ").append(nume).append(" ").append(prenume);
		builder.append(punctaj>proiect.getPrag()?("  a fost acceptat." ): (" nu a fost acceptat."));
		System.out.print(builder.toString());
	}
	public int getPunctaj() {
		return punctaj;
	}
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	
	

	
	@Override
	public String toString() {
		return "Aplicant [nume=" + nume + ", prenume=" + prenume + ", varsta=" + varsta + ", punctaj=" + punctaj
				+ ", nr_proiecte=" + nr_proiecte + ", denumireProiect=" + Arrays.toString(denumireProiect)
				+ ", suma_finantare=" + suma_finantare + "]";
	}
	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nr_proiecte = nr_proiecte;
		this.denumireProiect = denumireProiect;
	}
	public int getNr_proiecte() {
		return nr_proiecte;
	}
	
	public String[] getDenumiriProiecte() {
		return denumireProiect;
	}
	public void setDenumiriProiecte(String[] denumireProiect, int nr_proiecte) {
		
		this.denumireProiect = denumireProiect;
		this.nr_proiecte = nr_proiecte;
	}
	public abstract float get_Suma_finantare();
	

}
