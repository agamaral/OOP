public class Emprestimo {
    private String nomeUsuario;
    private double valorUsuario;

    public String getNomeUsuario() {
        return this.nomeUsuario;
    }

    public double getValorUsuario() {
        return this.valorUsuario;
    }

   public Emprestimo(String nomeUsuario) {
       this.valorUsuario = 100.00;
       this.nomeUsuario = nomeUsuario;
   }

}