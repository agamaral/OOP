package pck;

public class Medico {
    private String nome;
    private String cpf;
    private double salario;
    private int crm;

    public Medico() {
    }

    public Medico(String nome, String cpf, double salario, int crm) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.crm = crm;
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

    public int getCrm() {
        return this.crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

   
}