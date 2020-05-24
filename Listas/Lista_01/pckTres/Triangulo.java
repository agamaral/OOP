package pckTres;

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
            this.tipo = "Retângulo";
            return this.tipo;
        }
        else if (anguloUm == anguloDois && anguloDois == anguloTres){
            this.tipo = "Equilátero";
            return this.tipo;
        }
        else {
            this.tipo = "Isósceles";
            return this.tipo;
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