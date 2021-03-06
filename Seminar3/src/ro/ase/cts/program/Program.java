package ro.ase.cts.program;

import ro.ase.cts.clase.Hamster;
import ro.ase.cts.clase.Parlament;
import ro.ase.cts.clase.ParlamentLazy;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parlament parlament1=Parlament.getInstance();
		Parlament parlament2=Parlament.getInstance();
		
		ParlamentLazy parlamentLazy1=ParlamentLazy.getInstance("Romania", 475, 4, "Piata Constitutiei");
		ParlamentLazy parlamentLazy2=ParlamentLazy.getInstance("Romania2", 4750, 40, "Piata Constitutiei2");
		
		parlament1.setLocatieSediu("Piata Constitutiei");
		parlament2.setNumarParlamentari(450);
		
		System.out.println(parlament1.toString());
		System.out.println(parlament2.toString());
		
		System.out.println(parlamentLazy1.toString());
		System.out.println(parlamentLazy2.toString());
		
		
		Hamster hamster1=Hamster.getInstance("Bob","chinezesc",3,1250);
		Hamster hamster2=Hamster.getInstance("Bob2","pitic",6,1950);
		
		System.out.println(hamster1.toString());
		System.out.println(hamster2.toString());
		

	}

}
