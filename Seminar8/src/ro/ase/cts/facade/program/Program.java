package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Masa;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Masa masa1=new Masa(12,6);
//		if(OperatorMese.esteLibera(masa1.getNumarMasa())==true) {
//			Picolo picolo=new Picolo("Ionut");
//			if(picolo.esteDebarasata(masa1.getNumarMasa())==true&&picolo.esteAranjata(masa1.getNumarMasa())) {
//				System.out.println("Masa este gata!");
//			}
//			else {
//				System.out.println("Asteptati!");
//			}
//		}else {
//			System.out.println("Asteptati!");
//		}
		
		Masa masa2=new Masa(30,2);
		if(Facade.esteMasaPregatita(masa2)) {
			System.out.println("Masa este gata!");
		}else {
			System.out.println("Asteptati");
		}
	}
}
