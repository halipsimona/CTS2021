package program;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
private Zookeeper zookeeper;
private List<Animal> animals;

public Zoo() {
	this.animals=new ArrayList<>();
	this.zookeeper=new Zookeeper("Ion");
}

public Zoo(Zookeeper zookeeper,List<Animal> animals) {
	this.zookeeper=zookeeper;
	this.animals=animals;
}

public void Add(Animal animal) {
	this.animals.add(animal);
}

public void feedAllAnimals() {
	for(Animal animal:animals){
		zookeeper.feed(animal);
	}
}

}
