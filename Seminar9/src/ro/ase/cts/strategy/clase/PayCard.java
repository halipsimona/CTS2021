package ro.ase.cts.strategy.clase;

public class PayCard implements Payable{

	@Override
	public void pay(float sum) {
		// TODO Auto-generated method stub
		System.out.println("A fost realizata plata cu cardul in valore de "+sum+"$.");
	}

}
