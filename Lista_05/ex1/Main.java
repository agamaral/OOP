package primeiro;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Triangulo t1 = new Triangulo();
        Scanner sc = new Scanner(System.in);

        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();
        Ponto p3 = new Ponto();

        System.out.println("Digite os três pontos, x e y, respectivamente:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        p1.setP1(x1);
        p1.setP1(y1);

        p2.setP2(x2);
        p2.setP2(y2);

        p3.setP2(x3);
        p3.setP2(y3);
    }
}