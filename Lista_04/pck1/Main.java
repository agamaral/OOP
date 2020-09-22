import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de lados:");
        int n = sc.nextInt();

        Poligono p1 = new Poligono(n);

        double tamanhoLado = 0.0;
        System.out.println("Digite os n tamanho de lados:");
        for (int i = 0; i < n; i++) {
            tamanhoLado = sc.nextDouble();
            p1.setLado(i, tamanhoLado);
        }

        System.out.println(p1.perimetro(n));

        sc.close();
    }
}