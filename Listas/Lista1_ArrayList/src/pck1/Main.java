package pck1;

public class Main {

	public static void main(String[] args) {
		Figurinha f1 = new Figurinha(4, 1);
		
		Album a1 = new Album();
		
		a1.addFigurinha(f1);
		a1.exibirAlbum();
		
		Figurinha f2 = new Figurinha(4, 1);
		a1.addFigurinha(f2);
		
		a1.exibirAlbum();
	}

}