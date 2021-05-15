package ro.ase.cts.observer;

public class ManagerSala extends Subiect {
	private String numeSala;

	public ManagerSala(String numeSala) {
		super();
		this.numeSala = numeSala;
	}
	
	public void anuntaMeci(String tipMeci) {
		super.notificaAbonat(this.numeSala+" va gazdui meciul "+tipMeci);
	}

}
