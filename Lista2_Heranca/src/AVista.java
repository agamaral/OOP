public class AVista extends Pagamento {

    public AVista(double valor) {
        super(valor);
    }
    
    protected int desconto;

    public void setDesconto(int desconto) {
        if (desconto > 0 &&  desconto < 30) {
            this.desconto = desconto;
        }
    }
    public void exibirValorAVista(double valor, int desconto) {
        int valorDesconto = 0;

        valorDesconto = (this.valor - (this.desconto * this.valor));
        System.out.println("O valor com desconto é: "+valorDesconto);
    }
    
}