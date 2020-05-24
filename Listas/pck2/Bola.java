package pck2;

public class Bola {
    private int peso;
    private int tamanho;
    private String forma;
    private String proposito;

    public Bola() {
    }

    public int getPeso() {
        return this.peso;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public String getForma() {
        return this.forma;
    }

    public String getProposito() {
        return this.proposito;
    }
    public Bola(int peso, int tamanho, String forma, String proposito ) {
        this.peso = peso;
        this.tamanho = tamanho;
        this.forma = forma;
        this.proposito = proposito;
    }

    public Bola(int peso, String forma ) {
        this.peso = peso;
        this.forma = forma;
    }

    public Bola(String proposito, int tamanho) {
        this.proposito = proposito;
        this.tamanho = tamanho;
    }
}