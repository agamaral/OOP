public class Main {
    public static void main(String args[]) {

        double ladosTriangulo[] = new double[]{3,4,5};
        double ladosQuadrilatero[] = new double[]{7,8,9,10};

        Triangulo t1 = new Triangulo(ladosTriangulo);
        Quadrilatero q1 = new Quadrilatero(ladosQuadrilatero);

        System.out.println("O perimetro eh:"+ t1.calcularPerimetro());
        t1.exibirLados();

        System.out.println("O perimetro eh:"+ q1.calcularPerimetro());
        q1.exibirLados();
    }
}