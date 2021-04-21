package ro.ase.cts.strategy.clase;

public class Client {
	private String name;
	private Payable payable;
	public Client(String name, Payable payable) {
		super();
		this.name = name;
		this.payable = payable;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPayable(Payable payable) {
		this.payable = payable;
	}
	 public void payCheck(float sum) {
		 System.out.println(this.name+" are de realizat o plata.");
		 this.payable.pay(sum);
	 }
	 
	
}
