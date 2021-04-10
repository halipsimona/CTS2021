package ro.ase.cts.decorator.clase;

public class DecoratorContactlessTelefon extends DecoratorAbstract {

	public DecoratorContactlessTelefon(CardBancar card) {
		super(card);
		// TODO Auto-generated constructor stub
	}
	
	public void platesteContactless() {
		System.out.println(((Card)super.getCard()).getTitular()+" realizeaza o plata contactless cu telefonul.");
	}

}
