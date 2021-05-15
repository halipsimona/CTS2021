package ro.ase.cts.memento;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ManagerMemento managerMemento=new ManagerMemento();
		
		Meci meci=new Meci("Rapid", "Dinamo", 390, 386, 100000);
		managerMemento.adaugaMemento(meci.creareMementoMeci());
		
		meci.setEchipaGazda("Steaua");
		meci.setNrSpectatori(388);
		managerMemento.adaugaMemento(meci.creareMementoMeci());
		
		System.out.println(meci.toString());
		
		meci.setMemento(managerMemento.getMemento(0));
		System.out.println(meci.toString());
		
		meci.setMemento(managerMemento.getLastMemento());
		System.out.println(meci.toString());
		
		
	}

}


