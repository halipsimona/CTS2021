package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.PayCard;
import ro.ase.cts.strategy.clase.PayCash;
import ro.ase.cts.strategy.clase.PayTickets;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client=new Client("Dana",new PayCash());
		client.payCheck(32);
		client.setPayable(new PayCard());
		client.payCheck((float) 12.5);
		client.setPayable(new PayTickets());
		client.payCheck(10);
	}

}
