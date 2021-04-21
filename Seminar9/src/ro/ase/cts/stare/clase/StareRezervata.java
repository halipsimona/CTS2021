package ro.ase.cts.stare.clase;

public class StareRezervata  implements State{

	@Override
	public void modificaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(masa.getState() instanceof StareLibera) {
			System.out.println("Masa cu nr. "+masa.getNrMasa()+" a fost rezervata");
			masa.setState(this);
		}else {
			System.out.println("Masa cu nr. "+masa.getNrMasa()+" nu se poate rezerva");
		}
	}

}
