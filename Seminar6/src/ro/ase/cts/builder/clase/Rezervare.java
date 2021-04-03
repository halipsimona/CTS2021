package ro.ase.cts.builder.clase;

public class Rezervare {

	private int codRezervare;
	private boolean areScaunErgonomic;
	private boolean areMancare;
	private boolean areBautura;
	private boolean areMuzicaAmbientala;
	private String genMuzical;
	
	public Rezervare(int codRezervare, boolean areScaunErgonomic, boolean areMancare, boolean areBautura,
			boolean areMuzicaAmbientala, String genMuzical) {
		super();
		this.codRezervare = codRezervare;
		this.areScaunErgonomic = areScaunErgonomic;
		this.areMancare = areMancare;
		this.areBautura = areBautura;
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		this.genMuzical = genMuzical;
	}

	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}

	public void setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
	}

	public void setAreMancare(boolean areMancare) {
		this.areMancare = areMancare;
	}

	public void setAreBautura(boolean areBautura) {
		this.areBautura = areBautura;
	}

	public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
	}

	public void setGenMuzical(String genMuzical) {
		this.genMuzical = genMuzical;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [codRezervare=");
		builder.append(codRezervare);
		builder.append(", areScaunErgonomic=");
		builder.append(areScaunErgonomic);
		builder.append(", areMancare=");
		builder.append(areMancare);
		builder.append(", areBautura=");
		builder.append(areBautura);
		builder.append(", areMuzicaAmbientala=");
		builder.append(areMuzicaAmbientala);
		builder.append(", genMuzical=");
		builder.append(genMuzical);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
