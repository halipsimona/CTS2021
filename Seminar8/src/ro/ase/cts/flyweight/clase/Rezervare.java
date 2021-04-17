package ro.ase.cts.flyweight.clase;

public class Rezervare {

	private int numarRezervare;
	private int numarMasa;
	public Rezervare(int numarRezervare, int numarMasa) {
		super();
		this.numarRezervare = numarRezervare;
		this.numarMasa = numarMasa;
	}
	public int getNumarRezervare() {
		return numarRezervare;
	}
	public int getNumarMasa() {
		return numarMasa;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [numarRezervare=");
		builder.append(numarRezervare);
		builder.append(", numarMasa=");
		builder.append(numarMasa);
		builder.append("]");
		return builder.toString();
	}
	
	
}
