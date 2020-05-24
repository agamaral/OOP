public class Main {
    public static void main(String args[]) {
        Pagamento p1 = new AVista(100);
        Parcelado parc1 = new Parcelado();

        p1.exibirValorAVista(500,20);
        parc1.exibirValorParcelado(5,10);

    }
}