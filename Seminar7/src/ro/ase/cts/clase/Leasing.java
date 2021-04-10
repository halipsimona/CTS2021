package ro.ase.cts.clase;

public class Leasing {

	private String nume;
	private int suma;
	public Leasing(String nume, int suma) {
		super();
		this.nume = nume;
		this.suma = suma;
	}
	 public void oferaLeasing() {
		 StringBuilder sb=new StringBuilder();
		 sb.append("A fost oferit un leasing de ").append(suma).append(" lei pentru ").append(nume);
		 System.out.println(sb.toString());
	 }
	
}
