package pck1;

public class Figurinha {
	
	private int numero;
	private int quantidade;
	
	public Figurinha(int numero, int quantidade) {
		this.numero = numero;
		this.quantidade = quantidade;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public void exibirFigurinha() {
		System.out.println("O número de figurinhas é:" + this.numero);
		System.out.println("A quantidade de figurinhas é:" + this.quantidade);
	}
		
}
