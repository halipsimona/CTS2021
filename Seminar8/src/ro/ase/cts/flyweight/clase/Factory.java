package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class Factory {

	private Map<String, FlyweightAbstract> client;

	public Factory() {
		super();
		this.client = new HashMap<>();
	}
	
	
	
	public FlyweightAbstract getClient(String numarTelefon) {
		FlyweightAbstract fly=this.client.get(numarTelefon);
		
		if(fly==null) {

			fly=new Client("G","07375","g@");
			this.client.put(numarTelefon,fly);
		}
		return fly;
	}
	
	public int getNumarClienti() {
		return this.client.size();
	}
}
