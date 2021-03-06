package ro.ase.cts.clase;


public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static float suma_finantare=20;
	
	public String getOcupatie() {
		return ocupatie;
	}
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public int getSalariu() {
		return salariu;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumire_Proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	public Angajat() {
		super();
		
	}
	
	
	public static void setSuma_finantare(float suma_finantare) {
		Angajat.suma_finantare = suma_finantare;
	}
	
	
	
	public static float getSuma_finantare() {
		return suma_finantare;
	}
	@Override
	public String toString() {
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append(super.toString()).append(" Angajat: [ ocupatie=").append(ocupatie).append(" , salariu= ").append(salariu).append(" ]");
		return stringBuilder.toString();
	}
	
	
	@Override
	public float get_Suma_finantare() {
		// TODO Auto-generated method stub
		return suma_finantare;
	}
	
}
