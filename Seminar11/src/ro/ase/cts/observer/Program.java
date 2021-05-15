package ro.ase.cts.observer;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ManagerSala managerSala=new ManagerSala("numeSala");
		Observer abonat1=new Abonat("Daniel");
		Observer abonat2=new Abonat("Ionela");
		
		managerSala.adaugaAbonat(abonat1);
		managerSala.adaugaAbonat(abonat2);
		
		managerSala.anuntaMeci("Meci 1");
		
		managerSala.dezaboneazaAbonat(abonat1);
		
		managerSala.anuntaMeci("Meci 2");
		
	}

}
