public class Quadrilatero {
    private double[] lados;

    public Quadrilatero(double[] lados) {
        this.lados = lados;
    }

    public double[] getLados(double[] lados) {
        return this.lados;
    }

    public double calcularPerimetro() {
        double perimetro = 0.0;
        for (int i = 0; i < lados.length; i++) {
            perimetro = lados[i]++;
        }
        return perimetro;
    }
    public void exibirLados() {
        for (int i = 0; i < lados.length; i++) {
            System.out.println("Lado " + i + " =" + lados[i]);
        }
    }

}