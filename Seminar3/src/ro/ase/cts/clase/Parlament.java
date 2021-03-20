package ro.ase.cts.clase;

public class Parlament {
	private String tara;
	private int numarParlamentari;
	private int durataMandat;
	private String locatieSediu;
	
	private static Parlament parlament=new Parlament();
	
	

	public void setTara(String tara) {
		this.tara = tara;
	}

	public void setNumarParlamentari(int numarParlamentari) {
		this.numarParlamentari = numarParlamentari;
	}

	public void setDurataMandat(int durataMandat) {
		this.durataMandat = durataMandat;
	}

	public void setLocatieSediu(String locatieSediu) {
		this.locatieSediu = locatieSediu;
	}


	public static Parlament getInstance() {
		return parlament;
	}

	private Parlament(String tara, int numarParlamentari, int durataMandat, String locatieSediu) {
		super();
		this.tara = tara;
		this.numarParlamentari = numarParlamentari;
		this.durataMandat = durataMandat;
		this.locatieSediu = locatieSediu;
	}
	
	private Parlament() {
		this.tara="";
		this.numarParlamentari=0;
		this.durataMandat=0;
		this.locatieSediu="";
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Parlament [tara=");
		builder.append(tara);
		builder.append(", numarParlamentari=");
		builder.append(numarParlamentari);
		builder.append(", durataMandat=");
		builder.append(durataMandat);
		builder.append(", locatieSediu=");
		builder.append(locatieSediu);
		builder.append("]");
		return builder.toString();
	}
	
	

}
