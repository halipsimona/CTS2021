package ro.ase.cts.clase;

public class AdapterLeasing implements Creditable {

	private Leasing leasing=null;
	
	public AdapterLeasing(Leasing leasing) {
		this.leasing=leasing;
	}

	@Override
	public void crediteaza() {
		// TODO Auto-generated method stub
		this.leasing.oferaLeasing();
	}
}
