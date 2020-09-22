package pckQuatro;

public class Poligono {
    private int lado1;
    private int lado2;
    private int lado3;
    private int lado4;
    private String tipo;


    private int setTipo(lado1,lado2,lado3,lado4) {
        if ( lado1 == lado2 && lado3 == lado4) {
            this.tipo = "Retângulo";
        } else if (lado 1 == lado2 && lado2 == lado3 && lado3 == lado4) {
            this.tipo = "Quadrado;"
        } else {
        this.tipo = "Qualquer";
        }
    }

    private int getTipo(lado1,lado2,lado3,lado4) {
        if ( lado1 == lado2 && lado3 == lado4) {
            System.out.println("Retângulo");
        } else if (lado 1 == lado2 && lado2 == lado3 && lado3 == lado4) {
            System.out.println("Quadrado");
        }
    }

}