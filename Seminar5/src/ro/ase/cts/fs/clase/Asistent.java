package ro.ase.cts.fs.clase;

public class Asistent extends PersonalMedical{

//  private int durataLucru;

//  public Asistent(String nume, int salariu, int durataLucru) {
//      super(nume, salariu);
//      this.durataLucru = durataLucru;
//  }

  public Asistent(String nume, int salariu) {
      super(nume, salariu);
  }

//  public void setDurataLucru(int durataLucru) {
//      this.durataLucru = durataLucru;
//  }

  @Override
  public String toString() {
      final StringBuilder sb = new StringBuilder("Asistent{");
      sb.append(super.toString());
      sb.append('}');
      return sb.toString();
  }

	
}
