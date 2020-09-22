package ex2;

public class Departamento {
    private String nome;
    private Funcionario funcionarios[];
    private int porcentagem;

    public Departamento(String nome) {
        funcionarios = new int[100];
        this.nome = nome;
    }

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Funcionario getFuncionarios() {
		return this.funcionarios;
	}

    public void setFuncionarios(Funcionario f) {
		this.funcionarios = funcionarios;
    }

    public void setAumento(int porcentagem) {
        int aumento = funcionarios.salario * (porcentagem/100);
        funcionarios.salario = funcionarios.salario + aumento;
    }

    // public void mudaDep(Departamento d) {
    //     this.nome = d.nome;
    // }
}