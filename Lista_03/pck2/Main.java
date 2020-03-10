package pck2;
import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        Calculadora c1 = new Calculadora();
        
        System.out.println("Digite a operação e os números, respectivamente:");
        int id = sc.nextInt();
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        switch (id) {
            case 1:
                System.out.println(c1.soma(n1,n2)); 
                break;
            case 2:
                System.out.println(c1.sub(n1, n2));
                break;
            case 3:
                System.out.println(c1.mul(n1, n2));
                break;
            case 4:
                System.out.println(c1.div(n1, n2));
                break;
            default:
                break;
        }
        sc.close();
    }
}