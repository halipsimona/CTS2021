package ro.ase.cts.template;

public class SpectatorNormal extends SpectatorAbstract{

	private String nume;
	
	public SpectatorNormal(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void aseazareCoada() {
		// TODO Auto-generated method stub
		System.out.println(this.nume+" se asaza la coada");
	}

	@Override
	public void prezintaBilet() {
		// TODO Auto-generated method stub
		System.out.println(this.nume+" prezinta bilet");
	}

	@Override
	public void controlCorporal() {
		// TODO Auto-generated method stub
		System.out.println(this.nume+" este controlat corporal");
	}

	@Override
	public void ocupaLoc() {
		// TODO Auto-generated method stub
		System.out.println(this.nume+" ocupa loc");
		
	}

	
}
