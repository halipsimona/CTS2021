package ro.ase.cts.spital.clase;

public class Factory {

	public PersonalMedical create(TipPersonal tip, String nume, int salariu) {

		switch(tip) {
		case MEDIC:{
			return new Medic(nume,salariu);
		}
		case ASISTENT:{
			return new Asistent(nume,salariu);
		}
		case BRANCARDIER:{
			return new Brancardier(nume,salariu);
		}
		default: throw new IllegalArgumentException("incorrect type");
		}
		
	}
}
