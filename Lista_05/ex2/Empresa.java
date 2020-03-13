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

    
}