package ro.ase.cts.template;

public abstract class SpectatorAbstract {
	
	public abstract void aseazareCoada();
	public abstract void prezintaBilet();
	public abstract void controlCorporal();
	public abstract void ocupaLoc();
	
	public final void intraPeStadion() {
		aseazareCoada();
		prezintaBilet();
		controlCorporal();
		ocupaLoc();
	}
	

}
