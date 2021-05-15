package ro.ase.cts.memento;
import java.util.ArrayList;
import java.util.List;
public class ManagerMemento {

	private List<MementoMeci> listaMemento;
	
	public ManagerMemento() {
		this.listaMemento=new ArrayList<>();}
	
	public void adaugaMemento(MementoMeci meci) {
		this.listaMemento.add(meci);
	}
	
	public MementoMeci getLastMemento() {
		if(this.listaMemento.size()>0)
		return this.listaMemento.get(this.listaMemento.size()-1);
		else throw new IndexOutOfBoundsException();
	}
	
	public MementoMeci getMemento(int index) {
		if(index>=0 && index<this.listaMemento.size()) {
			return this.listaMemento.get(index);
	}
		else throw new IndexOutOfBoundsException();
	}
}

