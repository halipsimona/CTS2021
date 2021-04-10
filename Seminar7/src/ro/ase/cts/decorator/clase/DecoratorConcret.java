package ro.ase.cts.decorator.clase;

public class DecoratorConcret extends DecoratorAbstract{

	public DecoratorConcret(CardBancar card) {
		super(card);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void platesteContactless() {
		// TODO Auto-generated method stub
		System.out.println(((Card)super.getCard()).getTitular()+" realizeaza o plata contactless.");
	}

	
}
