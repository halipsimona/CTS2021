package program;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Zoo zoo=new Zoo();
	Cat cat1=new Cat("Cat1");
	Cat cat2=new Cat("Cat2");
	
	zoo.Add(cat1);
	zoo.Add(cat2);
	
	zoo.feedAllAnimals();

	}

}
