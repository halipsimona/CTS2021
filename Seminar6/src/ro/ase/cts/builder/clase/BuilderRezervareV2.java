package ro.ase.cts.builder.clase;

public class BuilderRezervareV2 implements AbstractBuilder{

	private int codRezervare;
	private boolean areScaunErgonomic;
	private boolean areMancare;
	private boolean areBautura;
	private boolean areMuzicaAmbientala;
	private String genMuzical;
	
	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return new Rezervare(codRezervare,areScaunErgonomic,areMancare,areBautura, areMuzicaAmbientala,genMuzical);
		
	}
	
	public BuilderRezervareV2() {
		this.codRezervare=0;
		this.genMuzical="techno";
		
	}

	public BuilderRezervareV2 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}

	public BuilderRezervareV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
		return this;
	}

	public BuilderRezervareV2 setAreMancare(boolean areMancare) {
		this.areMancare = areMancare;
		return this;
	}

	public BuilderRezervareV2 setAreBautura(boolean areBautura) {
		this.areBautura = areBautura;
		return this;
	}

	public BuilderRezervareV2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		return this;
	}

	public BuilderRezervareV2 setGenMuzical(String genMuzical) {
		this.genMuzical = genMuzical;
		return this;
	}

	
}
