package pck_tres;

public class Triangulo { 
    private int anguloUm;
    private int anguloDois;
    private int anguloTres;
    private int ladoUm;
    private int ladoDois;
    private int ladoTres;
    private String tipo;


    public int getTipo(anguloUm, anguloDois, anguloTres) {
        if ( anguloUm == 90 || anguloDois == 90 || anguloTres == 90 ) {
            System.out.println("tipo = Retângulo");
        }
        else if (anguloUm == anguloDois && anguloDois == anguloTres){
            System.out.println("tipo = Equilátero");
        }
        else {
            System.out.println("tipo = Isósceles");
        }
    }

    public int setTipo(anguloUm, anguloDois, anguloTres) {
        if ( anguloUm == 90 || anguloDois == 90 || anguloTres == 90 ) {
            this.tipo = "Retângulo";
        }
        else if (anguloUm == anguloDois && anguloDois == anguloTres){
            this.tipo = "Equilátero";
        }
        else {
            this.tipo = "Isósceles";
        }
    }


}