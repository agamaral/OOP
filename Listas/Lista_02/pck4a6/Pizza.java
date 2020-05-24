package pck4a6;

public class Pizza {
    private String nome;
    private double valor;
    private int numeroIngrediente;

    public Pizza() {
    }

    public Pizza(String nome, double valor, int numeroIngrediente) {
        this.nome = nome;
        this.valor = valor;
        this.numeroIngrediente = numeroIngrediente;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getNumeroIngrediente() {
        return this.numeroIngrediente;
    }

    public void setNumeroIngrediente(int numeroIngrediente) {
        this.numeroIngrediente = numeroIngrediente;
    }

}