public class Parcelado extends Pagamento {

    public Parcelado(double valor) {
        super(valor);
    }

    private int numParcelas;
    private int jurosParcela;

    public int getNumParcelas() {
        return this.numParcelas;
    }

    public void setNumParcelas(int numParcelas) {
        if(numParcelas > 0 && numParcelas < 100 ) {
            this.numParcelas = numParcelas;
        }
    }

    public int getJurosParcela() {
        return this.jurosParcela;
    }

    public void setJurosParcela(int jurosParcela) {
        this.jurosParcela = jurosParcela;
    }

    public void exibirValorParcelado(int jurosParcela, int numParcelas){
        int valorPago = 0;

        valorPago = this.numParcelas + (this.jurosParcela * this.valor);
        System.out.println("O valor pago em cada parcela eh: " + valorPago);
    }

}