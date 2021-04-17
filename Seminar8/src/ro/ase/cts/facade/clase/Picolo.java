package ro.ase.cts.facade.clase;

class Picolo {

	private String nume;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Picolo(String nume) {
		super();
		this.nume = nume;
	}
	
	public boolean esteDebarasata(int numarMasa) {
		return numarMasa%3==0;
	}
	
	public boolean esteAranjata(int numarMasa) {
		return numarMasa%5==0;
	}
}
