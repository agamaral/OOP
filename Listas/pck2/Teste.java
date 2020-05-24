package pck2;

public class Teste {
    public static void main(String args[]) 
    {
        Bola bolaFutebol = new Bola(50,10,"Redonda","futebol"); //invoca o construtor da linha 13
        Bola futAmericano = new Bola(10, "oval"); // "" linha 20
        Bola tenis = new Bola("bola de tenis", 7); // "" linha 25
        Bola bolaPadrao = new Bola(); // "" linha 10

        System.out.println("Peso da bola = " + bolaFutebol.getPeso());
    }
}