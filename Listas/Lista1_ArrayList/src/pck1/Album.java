package pck1;

import java.util.ArrayList;

public class Album {

	ArrayList<Figurinha> figurinhas = new ArrayList<Figurinha>();

	public Album() {

	}

	public void exibirAlbum() {
		for (int i = 0; i < figurinhas.size(); i++) {
			figurinhas.get(i);
		}
	}

	public int getNumFigurinhas() {
		return figurinhas.size();
	}

	public boolean addFigurinha(Figurinha fi) {
		boolean bol = true;
		for (Figurinha f : figurinhas) {
			
			if (f.getNumero() == fi.getNumero()) {
				f.setQuantidade(f.getQuantidade()+1);
				bol = false;
			} 
		}
		if (bol) {
			figurinhas.add(fi);
		}
		return bol;
	}

}