public class Teste {
    public static void main (String args[]) {
        Emprestimo emprestimoJuliano = new Emprestimo("Juliano");
        System.out.println("O usuario e seu emprestimo sao, respectivamente:" + emprestimoJuliano.getNomeUsuario() + emprestimoJuliano.getValorUsuario());
    }
}