package laboratorio.main;
import laboratorio.util.Tempo;
import laboratorio.misturas.*;

public class Main {

	public static void main(String[] args) {
		Mistura m1 = new Mistura("Sangue saudável");
		Mistura m2 = new Mistura("Sangue com COVID-19");
		
		Tempo t1 = new Tempo(22,59,59); // tempo q m1 foi concluída
		Tempo t2 = new Tempo(23,00,00); // tempo q m2 foi concluída
		
		m1.setTempo(t1);
		m2.setTempo(t2);
		
		Experimento e1 = new Experimento();
		e1.registrarMistura(m1);
		e1.registrarMistura(m2);
		
		e1.exibirExperimento();
		
	}

}
