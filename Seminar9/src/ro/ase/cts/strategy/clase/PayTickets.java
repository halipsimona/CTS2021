package ro.ase.cts.strategy.clase;

public class PayTickets implements Payable{

	@Override
	public void pay(float sum) {
		// TODO Auto-generated method stub
		System.out.println("A fost realizata plata cu bonuri de masa in valore de "+sum+"$.");
		
	}

}
