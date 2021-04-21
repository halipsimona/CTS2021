package ro.ase.cts.strategy.clase;

public class PayCash implements Payable{

	@Override
	public void pay(float sum) {
		// TODO Auto-generated method stub
		System.out.println("A fost realizata plata cash in valore de "+sum+"$.");
	}

}
