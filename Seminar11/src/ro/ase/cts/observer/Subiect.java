package ro.ase.cts.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {

	private List<Observer> observerList=null;
	
	public Subiect() {
		super();
		observerList=new ArrayList<>();
	}
	public void adaugaAbonat(Observer abonat) {
		observerList.add(abonat);
	}
	public void dezaboneazaAbonat(Observer abonat) {
		if(observerList.size()>0 && observerList.contains(abonat)) {
			observerList.remove(abonat);
		}
	}
	public void notificaAbonat(String mesaj) {
		for (Observer o: observerList) {
			o.receptionareMesaj(mesaj);
			
		}
	}
	
}
