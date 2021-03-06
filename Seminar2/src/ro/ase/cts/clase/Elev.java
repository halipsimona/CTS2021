package ro.ase.cts.clase;


public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static float suma_finantare=30;
	
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int clasa) {
		this.clasa = clasa;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	@Override
	public String toString() {
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append(super.toString()).append(" Elev: [ clasa=").append(clasa).append(" , tutore= ").append(tutore).append(" ]");
		return stringBuilder.toString();
	}
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	
	public static void setSuma_finantare(float suma_finantare) {
		Elev.suma_finantare = suma_finantare;
	}
	
	
	
	public static float getSuma_finantare() {
		return suma_finantare;
	}
	@Override
	public float get_Suma_finantare() {
		// TODO Auto-generated method stub
		return suma_finantare;
	}
	
}
