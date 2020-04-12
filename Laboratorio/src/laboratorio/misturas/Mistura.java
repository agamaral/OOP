package laboratorio.misturas;
import laboratorio.util.Tempo;

public class Mistura {
	private String nome;
	private Tempo tempo;
	
	public Mistura(String nome) {
		this.nome = nome;
	}
	public Mistura() {
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}

	public void setTempo(Tempo tempo) {
		this.tempo = tempo;
	}
	public Tempo getTempo() {
		return tempo;
	}
	
	public void exibirMistura() {
		System.out.println("A nome da mistura é:" + this.nome);
		System.out.printf("A mistura foi concluida em:");
		tempo.exibirTempo();
	}
}
