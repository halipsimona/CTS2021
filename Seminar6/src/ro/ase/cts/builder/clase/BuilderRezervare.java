package ro.ase.cts.builder.clase;

public class BuilderRezervare implements AbstractBuilder {

	Rezervare rezervare=null;
	
	public BuilderRezervare() {
		this.rezervare=new Rezervare(0,false,false,false,false,"");
	}
	
	public BuilderRezervare(int codRezervare) {
		this.rezervare=new Rezervare(codRezervare,false,false,false,false,"");
	}
	
	@Override
	public Rezervare build() {
		// TODO Auto-generated method stub
		return this.rezervare;
	}

	//setterii din builder pot fi apelati in cascada
	
	public BuilderRezervare setCodRezervare(int codRezervare) {
		this.rezervare.setCodRezervare(codRezervare);
		return this;
	}

	public BuilderRezervare setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return this;
	}

	public BuilderRezervare setAreMancare(boolean areMancare) {
		this.rezervare.setAreMancare(areMancare);
		return this;
	}

	public BuilderRezervare setAreBautura(boolean areBautura) {
		this.rezervare.setAreBautura(areBautura);
		return this;
	}

	public BuilderRezervare setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
		return this;
	}

	public BuilderRezervare setGenMuzical(String genMuzical) {
		this.rezervare.setGenMuzical(genMuzical);
		return this;
	}
	
}
