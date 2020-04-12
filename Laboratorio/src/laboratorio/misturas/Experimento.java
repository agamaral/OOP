package laboratorio.misturas;
import java.util.ArrayList;

public class Experimento {
	
	ArrayList<Mistura> misturas = new ArrayList<Mistura>();
	
	public Experimento() {
		
	}
	
	public boolean registrarMistura(Mistura m) {
		misturas.add(m);
		for (int i = 0; i < misturas.size(); i++) {
			if (misturas.contains(m)) {
				System.out.println("A mistura foi adicionada com sucesso!");
			} else {
				return false;
			}
		}
		return true;
	}
	
	public void exibirExperimento() {
		for (int j = 0; j < misturas.size(); j++ ) {
			System.out.println("Mistura"+ j + ":" + misturas.get(j));
		}
	}
	
}
