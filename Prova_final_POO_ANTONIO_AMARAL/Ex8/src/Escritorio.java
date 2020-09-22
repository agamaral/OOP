public class Escritorio extends Apto implements Commision {

    private double sales;

    public Escritorio(double a, double p) {
        super(a, p);
    }
    public Escritorio () {

    }

    public void printDados() {
        System.out.println("Valores de área e preço de área, respectivamente:" + getDados());
        System.out.println("Valor total:" + getPrecoTotal());
        System.out.println("Parcela de ganho da Loja:" + (getPrecoTotal()/COMMISSION_RATE) );
        System.out.println("Parcela de ganho da Apto:" + (getPrecoTotal() /nQuartos));
    }
    public void setVendas(double s) {
        this.sales = s;
    }
 
    public String getDados() {
        String s1 = String.valueOf(this.area);
        String s2 = String.valueOf(this.precoArea);
        String s3 = s1 + s2;
        return s3;
    }
    public double getPrecoTotal() {
        double precoTotal = 0.0;

        precoTotal = ((this.area * this.precoArea) * nQuartos * COMMISSION_RATE);
        return precoTotal;
    }
}
