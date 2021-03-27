package ro.ase.cts.reteta.clase;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements AbstractPrototype{

	private List<String> denumiriSolutii;
	private List<Integer> cantitati;
	public List<String> getDenumiriSolutii() {
		return denumiriSolutii;
	}
	public void setDenumiriSolutii(List<String> denumiriSolutii) {
		this.denumiriSolutii = denumiriSolutii;
	}
	public List<Integer> getCantitati() {
		return cantitati;
	}
	public void setCantitati(List<Integer> cantitati) {
		this.cantitati = cantitati;
	}
	public Reteta(List<String> denumiriSolutii, List<Integer> cantitati) {
		super();
		//TODO: validari
		this.denumiriSolutii = denumiriSolutii;
		this.cantitati = cantitati;
	}
	public Reteta() {
		//nu facem validari
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reteta [denumiriSolutii=");
		builder.append(denumiriSolutii);
		builder.append(", cantitati=");
		builder.append(cantitati);
		builder.append("]");
		return builder.toString();
	}
	

	@Override
	public AbstractPrototype copiaza() {
		// TODO Auto-generated method stub
		Reteta copie=new Reteta();
		copie.cantitati=new ArrayList<>();
		copie.cantitati.addAll(this.cantitati);
		copie.denumiriSolutii=new ArrayList<>();
		copie.denumiriSolutii.addAll(this.denumiriSolutii);
		return copie;
	}
	
	
}
