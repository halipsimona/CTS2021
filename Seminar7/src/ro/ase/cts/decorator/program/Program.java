package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Card;
import ro.ase.cts.decorator.clase.DecoratorConcret;
import ro.ase.cts.decorator.clase.DecoratorContactlessTelefon;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card=new Card("Ionel");
		card.platestePOS();
		card.platesteOnline();
		
		DecoratorConcret decorator=new DecoratorConcret(card);
		decorator.platesteContactless();
		decorator.platesteOnline();
		decorator.platestePOS();
		
		DecoratorContactlessTelefon decoratorTelefon=new DecoratorContactlessTelefon(card);
		decoratorTelefon.platesteContactless();
		decoratorTelefon.platestePOS();
		decoratorTelefon.platesteOnline();
	}


}
