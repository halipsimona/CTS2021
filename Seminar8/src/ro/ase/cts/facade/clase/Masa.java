package ro.ase.cts.facade.clase;

public class Masa {
	private int numarMasa;
	private int numarLocuri;
	public int getNumarMasa() {
		return numarMasa;
	}
	public int getNumarLocuri() {
		return numarLocuri;
	}
	public Masa(int numarMasa, int numarLocuri) {
		super();
		this.numarMasa = numarMasa;
		this.numarLocuri = numarLocuri;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Masa [numarMasa=");
		builder.append(numarMasa);
		builder.append(", numarLocuri=");
		builder.append(numarLocuri);
		builder.append("]");
		return builder.toString();
	}
	

}
