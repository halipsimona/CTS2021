package ro.ase.cts.chain.clase;

public class ContEconomii extends Handler {

	public ContEconomii(double sold) {
		super(sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(double suma) {
		// TODO Auto-generated method stub
		if(super.getSold()>=suma) {
			System.out.println("S-a realizat plata din contul economii.");
			super.setSold(super.getSold()-suma);
		}else if(super.getSuccesor()!=null){
			super.getSuccesor().realizeazaPlata(suma);
		}else {
			System.out.println("Nu se poate realiza plata.");
		}
	}

}
