public class Poligono {
    private double lados[];

    public Poligono(int n) { // construtor q recebe n lados
        lados = new double[n];
    }

    public void setLado(int i, double tamanhoLado) {
        lados[i] = tamanhoLado;
    }

    public double perimetro(int n) {
        double perimetro = 0.0;
        for (int i = 0; i < n; i++) {
            perimetro += lados[i];
        }
        return perimetro;
    }

}