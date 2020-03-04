package pck1a3;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;
    private char sexo;
    private int idade;

    public Funcionario() {
    }

    public Funcionario(String nome, double salario, String cargo, char sexo, int idade) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
} 