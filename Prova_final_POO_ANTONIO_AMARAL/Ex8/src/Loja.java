public class Loja extends Construcao implements Commision {

    public Loja(double area, double precoArea) {
        super(area, precoArea);
    }
    public Loja(){
        
    }

    public String getDados() {
        String s1 = String.valueOf(this.area);
        String s2 = String.valueOf(this.precoArea);
        String s3 = s1 + s2;
        return s3;
    }
    
    public void printDados() {
        System.out.println("Valores de área e preço de área, respectivamente:" + getDados());
        System.out.println("Valor total:" + getPrecoTotal());
    }
    
    public double getPrecoTotal() {
        double precoTotal = 0.0;

        precoTotal = this.area * this.precoArea + ((this.area * this.precoArea) * COMMISSION_RATE);
        return precoTotal;
    }

    public void setVendas(double sales) {
    }
    
}
