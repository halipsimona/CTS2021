package ro.ase.cts.reteta.program;

import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.reteta.clase.Reteta;

public class Program {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> listaDenumiriSolutii=new ArrayList<>();
		listaDenumiriSolutii.add("apa");
		listaDenumiriSolutii.add("etanol");
		List<Integer> listaCantitati=new ArrayList<>();
		listaCantitati.add(20);
		listaCantitati.add(200);
		Reteta reteta1=new Reteta(listaDenumiriSolutii,listaCantitati);
		Reteta reteta2=(Reteta) reteta1.copiaza();
		System.out.print(reteta1);
		System.out.println(reteta2);
		
		
	}

}
