package ifsuldeminas.alunos;

public class Aluno {
	
	private String nome;
	private int ra;
	private int periodo;
	private String curso;
	
	public Aluno(String nome, int ra, String curso) {
		this.nome = nome;
		this.ra = ra;
		this.periodo = 1;
		this.curso = curso;
	}
	
	public Aluno(String nome, int ra, int periodo, String curso) {
		this.nome = nome;
		this.ra = ra;
		this.periodo = periodo;
		this.curso = curso;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void exibirAluno() {
		
		System.out.println("O nome do aluno é:" + this.nome);
		System.out.println("O RA do aluno é:" + this.ra);
		System.out.println("O período do aluno é:" + this.periodo);
		System.out.println("O curso do aluno é:" + this.curso);

	}

}
