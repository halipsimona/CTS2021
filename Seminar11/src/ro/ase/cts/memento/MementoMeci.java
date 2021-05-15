package ro.ase.cts.memento;

public class MementoMeci {

	private int nrSpectatori;
	private String echipaGaza;
	private String echipaOaspete;
	public int getNrSpectatori() {
		return nrSpectatori;
	}
	public String getEchipaGaza() {
		return echipaGaza;
	}
	public String getEchipaOaspete() {
		return echipaOaspete;
	}
	public MementoMeci(int nrSpectatori, String echipaGaza, String echipaOaspete) {
		super();
		this.nrSpectatori = nrSpectatori;
		this.echipaGaza = echipaGaza;
		this.echipaOaspete = echipaOaspete;
	}
	
	
}
