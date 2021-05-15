package ro.ase.cts.template;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpectatorAbstract spectatorN=new SpectatorNormal("Popa");
		SpectatorAbstract spectatorVIP=new SpectatorVip("Ionescu", "Loja nr1");
		
		spectatorN.intraPeStadion();
		spectatorVIP.intraPeStadion();
	}

}
