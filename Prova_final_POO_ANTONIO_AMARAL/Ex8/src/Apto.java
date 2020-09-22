public class Apto extends Construcao {
    protected int nQuartos;

    public Apto(double a, double p) {
        super(a,p);
    }
    public Apto() {
        
    }
    public void setNQuartos(int n) {
        this.nQuartos = n;
    }
    public int getNQuartos() {
        return this.nQuartos;
    }
    
    public void printDados() {
        System.out.println("Valores de área e preço de área, respectivamente:" + getDados());
        System.out.println("Valor total:" + getPrecoTotal());
    }
    
    public String getDados() {
        String s1 = String.valueOf(this.area);
        String s2 = String.valueOf(this.precoArea);
        String s3 = s1 + s2;
        return s3;
    }
    public double getPrecoTotal() {
        double precoTotal = 0.0;

        precoTotal = ((this.area * this.precoArea) * nQuartos);
        return precoTotal;
    }
    
}
