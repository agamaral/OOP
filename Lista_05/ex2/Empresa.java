package ex2;

public class Empresa {
    private String nome;
    private String CNPJ;
    private Departamento departamentos[];

    public Empresa(String nome, String CNPJ) {
        departamentos = new int[10];
        this.nome = nome;
        this.CNPJ = CNPJ;
    }

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCNPJ() {
		return this.CNPJ;
	}

	public void setCNPJ(String CNPJ) {
		this.CNPJ = CNPJ;
	}

	public void setDepartamentos(Departamento d) {
		this.departamentos = departamentos;
	}

	public Departamento getDepartamentos() {
		return this.departamentos;
	}

}