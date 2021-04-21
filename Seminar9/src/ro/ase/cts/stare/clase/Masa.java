package ro.ase.cts.stare.clase;

public class Masa {
	private int nrMasa;
	private State state;
	public Masa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
		this.state = new StareLibera();
	}
	public State getState() {
		return this.state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}
	public int getNrMasa() {
		return this.nrMasa;
	}
	

	public void ocupaMasa() {
		StareOcupata stareOcupata=new StareOcupata();
		stareOcupata.modificaStare(this);
	}
    public void elibereazaMasa() {
    	StareLibera stareLibera=new StareLibera();
		stareLibera.modificaStare(this);
    }
    public void rezervaMasa() {
    	StareRezervata stareRezervata=new StareRezervata();
		stareRezervata.modificaStare(this);
    }
}
