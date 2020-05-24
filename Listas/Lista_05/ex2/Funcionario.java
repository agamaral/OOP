package ex2;

public class Funcionario {
    private String nome;
    private int salario;
    private String dataAdimissao;

    public Funcionario(String nome, int salario, String dataAdmissao) {
        this.nome = nome;
        this.salario = salario;
        this.dataAdimissao = dataAdmissao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSalario() {
        return this.salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getDataAdimissao() {
        return this.dataAdimissao;
    }

    public void setDataAdimissao(String dataAdimissao) {
        this.dataAdimissao = dataAdimissao;
    }
}