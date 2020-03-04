package pckCinco;

public class ContaBancaria {
    private double saldo;
    private String nomeTitular;

    public ContaBancaria(double saldo, String nomeTitular) {
        this.saldo = saldo;
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo(double saldo) {
        return this.saldo;
    }

    public String getNome(String nome) {
        return this.nomeTitular;
    }
}