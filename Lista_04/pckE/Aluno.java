package pckE;
public class Aluno {
    private String nome;
    private int idade;
    private int turma;

    public Aluno(String nome, int idade, int turma) {
        this.nome = nome;
        this.idade = idade;
        this.turma = turma;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTurma() {
        return this.turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    public void exibeInfos(Aluno a) {
        System.out.println("O nome do aluno é:" + this.aluno);
        System.out.println("A idade do aluno é:"+ this.idade);
        System.out.println("A turma do aluno é:"+ this.turma);
    }

}