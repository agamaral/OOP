package pck;

public class Funcionario {
    private int identificacao;
    private String nome;
    private int salario;
    private String cargo;

    private Endereco endereco;

    public int getIdentificacao() {
        return this.identificacao;
    }
    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public int getSalario() {
        return this.salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public String getCargo() {
        return this.cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Endereco getEndereco() {
        return this.endereco;
    }
}