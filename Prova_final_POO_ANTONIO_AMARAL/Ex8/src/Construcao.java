public abstract class Construcao {
    protected double area;
    protected double precoArea;

    public Construcao(double area, double precoArea) {
        this.area = area;
        this.precoArea = precoArea;
    }
    public Construcao() {
        
    }

    public String getDados() {
        String s1 = String.valueOf(this.area);
        String s2 = String.valueOf(this.precoArea);
        String s3 = s1 + s2;
        return s3;
    }
    public void printDados() {
        System.out.println("Valores de área e preço de área, respectivamente:"+ getDados());
        System.out.println("Valor total:"+ getPrecoTotal());
    }

    
    public double getPrecoTotal() {
        double precoTotal = 0.0;

        precoTotal = this.area * this.precoArea;
        return precoTotal;
    }
}