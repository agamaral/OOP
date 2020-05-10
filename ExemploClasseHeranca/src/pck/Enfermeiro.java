package pck;

public class Enfermeiro {
    private string nome;
    private String cpf;
    private double salario;
    private int corem;

    public Enfermeiro() {
    }

    public Enfermeiro(string nome, String cpf, double salario, int corem) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.corem = corem;
    }

    public string getNome() {
        return this.nome;
    }

    public void setNome(string nome) {
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

    public int getCorem() {
        return this.corem;
    }

    public void setCorem(int corem) {
        this.corem = corem;
    }

   

}