package pck1;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite l1:");
        int l1 = sc.nextInt();
        System.out.println("Digite l2:");
        int l2 = sc.nextInt();
        System.out.println("Digite l3:");
        int l3 = sc.nextInt();

        Triangulo t1 = new Triangulo(l1, l2, l3);

        System.out.println("Digite l4:");
        int l4 = sc.nextInt();
        System.out.println("Digite l5:");
        int l5 = sc.nextInt();
        System.out.println("Digite l6:");
        int l6 = sc.nextInt();

        Triangulo t2 = new Triangulo(l4, l5, l6);

        int res1 = t1.calcularPerimetro();
        int res2 = t2.calcularPerimetro();

        System.out.println("O perimetro de t1 é:"+ res1);
        System.out.println("O perimetro de t2 é: "+ res2);

        sc.close();
    }
}