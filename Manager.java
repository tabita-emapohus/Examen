
public class Manager extends Angajat {
	private double sal = 0;
	private int vechime;

	public Manager(int valN, int sal) {
		super(valN);
		this.sal= sal;
		
	}
	@Override
	public int afisareSalariu() {
		if(vechime >= (vechime + 1))
			valN = vechime;
			sal = valN * 0.1;
		return (int) sal;
	}

	@Override
	public String afisareNume() {
		return null;
	}

	public void adaugareAngajati(){
		
	}
}
