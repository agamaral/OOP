import java.util.Random;

public class Imobiliaria {
    public static void main(String[] args) {

        Loja l1 = new Loja(40, 500);
        Apto a1 = new Apto(50, 25);
        Escritorio e1 = new Escritorio(40,20);
        Escritorio e2 = new Escritorio(50,20);
        Escritorio e3 = new Escritorio(60,20);
        Apto a2 = new Apto(60,30);

        Random randomNumbers = new Random();
        
        int aleat = randomNumbers.nextInt(2);
        double valor = 30 * randomNumbers.nextDouble() + 20;

    }
}
