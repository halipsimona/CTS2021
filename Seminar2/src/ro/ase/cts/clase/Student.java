package ro.ase.cts.clase;


public class Student extends Aplicant {
	protected String facultate;
	protected int an_studii;
	private static float suma_finantare=10;
	public String getFacultate() {
		return facultate;
	}
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public int getAn_studii() {
		return an_studii;
	}
	public void setAn_studii(int an_studii) {
		this.an_studii = an_studii;
	}


	public Student() {
		super();
		
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.facultate = facultate;
		this.an_studii = an_studii;
	}
	@Override
	public String toString() {
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append(super.toString()).append(" , Student: [ facultate=").append(facultate).append(" , an_studii= ").append(an_studii).append(" ]");
		return stringBuilder.toString();
	}
	public static void setSuma_finantare(float suma_finantare) {
		Student.suma_finantare = suma_finantare;
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
