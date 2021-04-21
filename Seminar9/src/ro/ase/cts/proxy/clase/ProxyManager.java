package ro.ase.cts.proxy.clase;

public class ProxyManager implements Rezervabil{

	private ManagerRezervari managerRezervari;
	private int pragInferior;
	
	public ProxyManager(ManagerRezervari managerRezervari,int pragInferior) {
		super();
		this.managerRezervari = managerRezervari;
		this.pragInferior=pragInferior;
	}

	@Override
	public void rezerva(int numarPersoane) {
		// TODO Auto-generated method stub
		if(numarPersoane>=this.pragInferior) {
			managerRezervari.rezerva(numarPersoane);
		} else {
			System.out.println("Rezervarea nu se poate efectua: veniti fara rezervare.");
		}
	}

}
