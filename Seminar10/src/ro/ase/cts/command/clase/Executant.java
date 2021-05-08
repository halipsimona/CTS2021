package ro.ase.cts.command.clase;

public class Executant {
	private double sold;
	private String detinator;
	public Executant(String detinator) {
		super();
		this.detinator = detinator;
	}
	public double getSold() {
		return sold;
	}
	public void setSold(double sold) {
		this.sold = sold;
	}
	public String getDetinator() {
		return detinator;
	}
	public void setDetinator(String detinator) {
		this.detinator = detinator;
	}
	
	public void constituieCont(double sold) {
		this.sold=sold;
		System.out.println("S-a constituit contul cu suma "+sold);
	}
	
	public void retrageSuma(double suma) {
		if(this.sold>=suma) {
		this.sold-=suma;
		System.out.println("Sold curent= "+this.sold);
		}else {
			System.out.println("Fonduri insuficiente ");	
		}
		
	}
	public void depuneSuma(double suma) {
		this.sold+=suma;
		System.out.println("Sold curent= "+this.sold);
	}

}
