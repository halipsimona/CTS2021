package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant{
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int numar_proiecte;
	protected String[] denumiri_proiecte;
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
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append("Aplicant [nume=").append(nume).append(", prenume=").append(prenume).append(", varsta=")
		.append(varsta).append(", punctaj=").append(punctaj).append(", numar_proiecte=").append(numar_proiecte).append(", denumiri_proiecte=").append(Arrays.toString(denumiri_proiecte))
		.append(", suma_finantare=").append(suma_finantare).append( "]");
		return stringBuilder.toString();
	}
	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int numar_proiecte, String[] denumiri_proiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.numar_proiecte = numar_proiecte;
		this.denumiri_proiecte = denumiri_proiect;
	}
	public int getNumarProiecte() {
		return numar_proiecte;
	}
	
	public String[] getDenumiriProiecte() {
		return denumiri_proiecte;
	}
	public void setDenumiriProiecte(String[] denumiri_proiect, int numar_proiecte) {
		
		this.denumiri_proiecte = denumiri_proiect;
		this.numar_proiecte = numar_proiecte;
	}
	public abstract float get_Suma_finantare();
	

}
