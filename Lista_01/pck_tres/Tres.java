package pck_tres;

public class Tres {
    public static void main (String args[]) {
        Triangulo trianguloRetangulo = new Triangulo();
        Triangulo trianguloIsosceles = new Triangulo();
        Triangulo trianguloEquilatero = new Triangulo();

        trianguloEquilatero.setTipo(60,60,60);
        trianguloIsosceles.setTipo(45,45,60);
        trianguloRetangulo.setTipo(90,45,45);
    }
}