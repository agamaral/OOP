package pck;
public class Motorista {
    private String nome;
    private String cpf;
    private double salario;
    private String numCarteira;
    private int coren;

    public Motorista() {
    }

    public Motorista(String nome, String cpf, double salario, String numCarteira, int coren) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.numCarteira = numCarteira;
        this.coren = coren;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNumCarteira() {
        return this.numCarteira;
    }

    public void setNumCarteira(String numCarteira) {
        this.numCarteira = numCarteira;
    }

    public int getCoren() {
        return this.coren;
    }

    public void setCoren(int coren) {
        this.coren = coren;
    }


}