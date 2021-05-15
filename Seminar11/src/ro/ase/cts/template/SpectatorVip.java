package ro.ase.cts.template;

public class SpectatorVip extends SpectatorAbstract{

	private String nume;
	private String numeLoja;
	
	public SpectatorVip(String nume, String numeLoja) {
		super();
		this.nume = nume;
		this.numeLoja=numeLoja;
	}

	@Override
	public void aseazareCoada() {
		// TODO Auto-generated method stub
		System.out.println(this.nume+" nu sta la coada");
	}

	@Override
	public void prezintaBilet() {
		// TODO Auto-generated method stub
		System.out.println(this.nume+" prezinta bilet VIP");
	}

	@Override
	public void controlCorporal() {
		// TODO Auto-generated method stub
		System.out.println(this.nume+" a fost controlat la intrarea VIP");
	}

	@Override
	public void ocupaLoc() {
		// TODO Auto-generated method stub
		System.out.println(this.nume+" ocupa loc la loja "+this.numeLoja);
	}

}
