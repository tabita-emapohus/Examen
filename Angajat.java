
public abstract class Angajat  {

	private int valN = 0;
	private String nume;
	private String prenume;

	public Angajat(int valN) {
		this.valN = valN;
	}
	
	private void CONCAT(String nume,String prenume) {
		
	}
	public abstract int afisareSalariu();
	public abstract String afisareNume();{
		CONCAT(nume, prenume);
	}
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}


	
}
