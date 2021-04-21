package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.ManagerRezervari;
import ro.ase.cts.proxy.clase.ProxyManager;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerRezervari managerRezervari=new ManagerRezervari("E3");
		managerRezervari.rezerva(2);
		ProxyManager proxyManager=new ProxyManager(managerRezervari,4);
		proxyManager.rezerva(2);
		proxyManager.rezerva(4);
	}

}
