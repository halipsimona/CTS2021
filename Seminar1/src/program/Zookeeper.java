package program;

public class Zookeeper {
	private String nume;

	public Zookeeper(String nume) {
		super();
		this.nume = nume;
	};
	
	public void feed (Animal animal) {
		System.out.println(this.nume+" feeds "+animal.getName());
	}

}
