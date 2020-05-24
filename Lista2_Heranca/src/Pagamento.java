public class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(double valor) {
        return this.valor;
    }
    public void exibirValor(double valor){
        System.out.println("O valor é: "+ this.valor);
    }
}