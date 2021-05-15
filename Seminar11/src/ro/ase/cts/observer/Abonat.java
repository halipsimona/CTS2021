package ro.ase.cts.observer;

public class Abonat implements Observer{
	private String nume;
	

	public Abonat(String nume) {
		super();
		this.nume = nume;
	}


	@Override
	public void receptionareMesaj(String mesaj) {
		// TODO Auto-generated method stub
		System.out.println(this.nume+" a receptionat mesajul "+mesaj);
	}

}
