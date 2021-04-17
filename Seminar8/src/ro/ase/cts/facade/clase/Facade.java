package ro.ase.cts.facade.clase;

public class Facade {
	
	public static boolean esteMasaPregatita(Masa masa) {
		if(OperatorMese.esteLibera(masa.getNumarMasa())==true) {
			Picolo picolo=new Picolo("Ionut");
			if(picolo.esteDebarasata(masa.getNumarMasa())==true&&picolo.esteAranjata(masa.getNumarMasa())) {
				return true;
			}
		}
		return false;
	}

}
