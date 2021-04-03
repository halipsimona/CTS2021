package ro.ase.cts.builder.program;

import ro.ase.cts.builder.clase.BuilderRezervare;
import ro.ase.cts.builder.clase.BuilderRezervareV2;
import ro.ase.cts.builder.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare rezervare0=new Rezervare(1,true,true,false,true,"dance");
		System.out.println(rezervare0.toString());
		
		BuilderRezervare builder=new BuilderRezervare().setCodRezervare(2).setAreBautura(true).setAreMancare(false).setAreMuzicaAmbientala(true).setAreScaunErgonomic(false).setGenMuzical("dance");
		Rezervare rezervare1=builder.build();
		System.out.println(rezervare1.toString());
		
		Rezervare rezervare2=new BuilderRezervare().setCodRezervare(2).setAreBautura(true).build();
		System.out.println(rezervare2.toString());
		
		Rezervare rezervare3=builder.setCodRezervare(4).build();
		System.out.println(rezervare3.toString());
		
		BuilderRezervareV2 builder2=new BuilderRezervareV2().setAreMancare(true).setAreScaunErgonomic(true).setAreBautura(false);
		Rezervare rezervare4=builder2.setCodRezervare(5).build();
		Rezervare rezervare5=builder2.setCodRezervare(6).build();
		System.out.println(rezervare4.toString());
		System.out.println(rezervare5.toString());
	}

}
