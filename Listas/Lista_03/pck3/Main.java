package pck3;

public class Main {
    public static void main( String args[] ) {
        
        Produto caneta = new Produto(3, 5000);
       
        caneta.attPreco(3.20);
        caneta.vendeProduto(1000); //vendeu 1000 das 5000 canetas;
        caneta.visualiza();
        caneta.addProduto(2000);
        caneta.visualiza();
    }
}