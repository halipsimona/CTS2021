package ro.ase.cts.clase;

public class AdapterClaseLeasing extends Leasing implements Creditable {

	public AdapterClaseLeasing(String nume, int suma) {
		super(nume, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crediteaza() {
		// TODO Auto-generated method stub
		super.oferaLeasing();
	}
	

}
