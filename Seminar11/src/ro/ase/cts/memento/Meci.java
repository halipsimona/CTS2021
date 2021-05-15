package ro.ase.cts.memento;

public class Meci {
	
	private String echipaGazda;
	private String echipaOaspete;
	private int nrBilete;
	private int nrSpectatori;
	private int profit;
	public Meci(String echipaGazda, String echipaPaspete, int nrBilete, int nrSpectatori, int profit) {
		super();
		this.echipaGazda = echipaGazda;
		this.echipaOaspete = echipaPaspete;
		this.nrBilete = nrBilete;
		this.nrSpectatori = nrSpectatori;
		this.profit = profit;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Meci [echipaGazda=");
		builder.append(echipaGazda);
		builder.append(", echipaPaspete=");
		builder.append(echipaOaspete);
		builder.append(", nrBilete=");
		builder.append(nrBilete);
		builder.append(", nrSpectatori=");
		builder.append(nrSpectatori);
		builder.append(", profit=");
		builder.append(profit);
		builder.append("]");
		return builder.toString();
	}
	public String getEchipaGazda() {
		return echipaGazda;
	}
	public void setEchipaGazda(String echipaGazda) {
		this.echipaGazda = echipaGazda;
	}
	public String getEchipaPaspete() {
		return echipaOaspete;
	}
	public void setEchipaPaspete(String echipaPaspete) {
		this.echipaOaspete = echipaPaspete;
	}
	public int getNrBilete() {
		return nrBilete;
	}
	public void setNrBilete(int nrBilete) {
		this.nrBilete = nrBilete;
	}
	public int getNrSpectatori() {
		return nrSpectatori;
	}
	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	
	public MementoMeci creareMementoMeci() {
		return new MementoMeci(this.nrSpectatori, this.echipaGazda, this.echipaOaspete);
	}
	
	public void setMemento(MementoMeci meci) {
		this.echipaGazda=meci.getEchipaGaza();
		this.echipaOaspete=meci.getEchipaOaspete();
		this.nrSpectatori=meci.getNrSpectatori();
	}

}
