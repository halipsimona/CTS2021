package ro.ase.cts.composite.clase;

public interface ComponentaAbstracta {

	public void printareElement();
	public void adaugaNod(ComponentaAbstracta componenta);
	public void stergeNod(ComponentaAbstracta componenta);
	public ComponentaAbstracta getNod(int pozitie);
}
