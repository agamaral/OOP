package Ex3;
public class Contador {
	private static int cont;
	
	public void setCont(int cont) {
		Contador.cont = cont;
	}
	
	public Contador(int cont) {
		Contador.cont = Contador.cont++;
	}
	public Contador() {
		Contador.cont = Contador.cont++;
	}
	
	public void zeraCont(int cont) {
		Contador.cont = 0;
	}
	
	public void incrementaCont(int cont) {
		Contador.cont = Contador.cont + cont;
	}
	public int returnCont(Contador cont) {
		return Contador.cont;
	}
	
}
