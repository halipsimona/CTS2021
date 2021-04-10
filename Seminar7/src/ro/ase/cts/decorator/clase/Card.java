package ro.ase.cts.decorator.clase;

public class Card implements CardBancar{

	private String titular;
	public Card(String titular) {
		this.titular=titular;
	}
	@Override
	public void platestePOS() {
		// TODO Auto-generated method stub
		System.out.println(this.titular+" a platit prin POS.");
	}

	@Override
	public void platesteOnline() {
		// TODO Auto-generated method stub
		System.out.println(this.titular+" a platit online.");
	}
	public String getTitular() {
		return this.titular;
	}

}
