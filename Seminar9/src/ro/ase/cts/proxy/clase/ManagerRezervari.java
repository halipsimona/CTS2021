package ro.ase.cts.proxy.clase;

public class ManagerRezervari implements Rezervabil{

	private String numeLocal;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ManagerRezervari [numeLocal=");
		builder.append(numeLocal);
		builder.append("]");
		return builder.toString();
	}
	

	public ManagerRezervari(String numeLocal) {
		super();
		this.numeLocal = numeLocal;
	}


	@Override
	public void rezerva(int numarPersoane) {
		// TODO Auto-generated method stub
		System.out.println("A fost realizata o rezervare la restaurantul "+this.numeLocal+" pentru "+numarPersoane+" persoane");
		
	}

}
