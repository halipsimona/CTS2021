package ro.ase.cts.stare.clase;

public class StareOcupata implements State{

	@Override
	public void modificaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(!(masa.getState() instanceof StareOcupata)) {
			System.out.println("Masa cu nr. "+masa.getNrMasa()+" a fost ocupata");
			masa.setState(this);
		}else {
			System.out.println("Masa cu nr. "+masa.getNrMasa()+" nu se poate ocupa");
		}
	}

}
