package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Factory;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare rezervare1=new Rezervare(1,1);
		Rezervare rezervare2=new Rezervare(2,2);
		Rezervare rezervare3=new Rezervare(3,3);
		
		Factory factory=new Factory();
		factory.getClient("0737").printeazaRezervare(rezervare1);
		factory.getClient("073750").printeazaRezervare(rezervare2);
		factory.getClient("0737").printeazaRezervare(rezervare3);
		
		System.out.print(factory.getNumarClienti());
	}

}
