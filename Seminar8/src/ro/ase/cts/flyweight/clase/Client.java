package ro.ase.cts.flyweight.clase;

public class Client implements FlyweightAbstract{
	private String numeClient;
	private String numarTelefon;
	private String email;
	
	public Client( String numeClient, String numarTelefon, String email) {
		super();
		this.numeClient = numeClient;
		this.numarTelefon = numarTelefon;
		this.email = email;
	}

	public String getNumeClient() {
		return numeClient;
	}
	public String getNumarTelefon() {
		return numarTelefon;
	}
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [numeClient=");
		builder.append(numeClient);
		builder.append(", numarTelefon=");
		builder.append(numarTelefon);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public void printeazaRezervare(Rezervare rezervare) {
		// TODO Auto-generated method stub
		System.out.println(this.toString()+"/"+rezervare.toString());
		
	}
	

}
