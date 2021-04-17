package ro.ase.cts.composite.clase;

import java.util.ArrayList;

public class Sectiune implements ComponentaAbstracta {

	private String numeSectiune;
	private ArrayList<ComponentaAbstracta> listaComponenta=new ArrayList<>();
	
	
	public Sectiune(String numeSectiune) {
		super();
		this.numeSectiune = numeSectiune;
	}

	@Override
	public void printareElement() {
		// TODO Auto-generated method stub
		System.out.println("Sectiune "+this.numeSectiune);
		for (ComponentaAbstracta componenta: listaComponenta) {
			componenta.printareElement();
		}
		
	}

	@Override
	public void adaugaNod(ComponentaAbstracta componenta) {
		// TODO Auto-generated method stub
		listaComponenta.add(componenta);
		
	}

	@Override
	public void stergeNod(ComponentaAbstracta componenta) {
		// TODO Auto-generated method stub
		listaComponenta.remove(componenta);
		
	}

	@Override
	public ComponentaAbstracta getNod(int pozitie) {
		// TODO Auto-generated method stub
		if(pozitie>=0 &&pozitie<listaComponenta.size()) {
			return listaComponenta.get(pozitie);
		}
		throw new IndexOutOfBoundsException();
	}

	
}
