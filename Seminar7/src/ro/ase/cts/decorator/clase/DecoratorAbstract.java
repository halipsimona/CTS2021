package ro.ase.cts.decorator.clase;

public abstract class DecoratorAbstract implements CardBancar {

	private CardBancar cardBancar;

	public DecoratorAbstract(CardBancar card) {
		super();
		this.cardBancar = card;
	}
	public CardBancar getCard() {
		return this.cardBancar;
	}
	public abstract void platesteContactless();
	@Override
	public void platestePOS() {
		// TODO Auto-generated method stub
		this.cardBancar.platestePOS();
		
	}
	@Override
	public void platesteOnline() {
		// TODO Auto-generated method stub
		this.cardBancar.platesteOnline();
	}
	
}