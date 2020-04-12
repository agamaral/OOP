package ifsuldeminas.academico;

import java.util.ArrayList;

import ifsuldeminas.funcionarios.*;
import ifsuldeminas.alunos.*;

public class Disciplina {
	
	private String nome;
	private int periodo;
	private int numTotalAulas;
	private boolean aprovado;
	private Professor professor;
	
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	ArrayList<Double> notas = new ArrayList<Double>();
	ArrayList<Integer> frequencias = new ArrayList<Integer>();
	
	public Disciplina() {
		
	}

	public Disciplina (String nome, int periodo, int numAulasSemana, int numSemanas) {
		this.nome = nome;
		this.periodo = periodo;
		this.numTotalAulas = numAulasSemana * numSemanas;
		this.professor = null; //disciplina ainda não tem professor
	}
	
	public Disciplina (String nome, int periodo, int numAulasSemana, int numSemanas, Professor p) {
		this.nome = nome;
		this.periodo = periodo;
		this.numTotalAulas = numAulasSemana * numSemanas;
		this.professor = p;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public int getNumTotalAulas() {
		return numTotalAulas;
	}

	public void setNumTotalAulas(int numTotalAulas) {
		this.numTotalAulas = numTotalAulas;
	}
	
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	public boolean getAprovado() {
		return aprovado;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor p) {
		this.professor = p;
	}
	
	public void removerProfessor() {
		this.professor = null;
	}
	
	public void getNumAlunos() {
		System.out.println("O número de alunos é:" + alunos.size());
	}
	
	public boolean addNota(int posAluno, double nota) {
		if (nota >= 0 && nota <= 10) {
			notas.add(posAluno, nota);
		} else {
			System.out.println("Nota inválida.");
		}
		
		if (notas.get(posAluno) == nota) {
			System.out.println("Nota adicionada.");
		} else {
			System.out.println("Erro ao adicionar a nota.");
			return false;
		}
		return true;
	}
	
	public boolean addFrequencia(int posAluno, int frequenciaTotal) {
		if ( frequenciaTotal >= 0 && frequenciaTotal <= numTotalAulas) {
			frequencias.add(posAluno, frequenciaTotal);
		} else {
			System.out.println("Frequência inválida.");
		}
		
		if (frequencias.get(posAluno) == frequenciaTotal) {
			System.out.println("Frequência adicionada.");
		} else {
			System.out.println("Erro ao adicionar frequência.");
			return false;
		}
		return true;
		
	}
	
	public boolean estaAprovado(int posAluno) {
		double n = notas.get(posAluno);
		int freq = frequencias.get(posAluno);
		
		if (n >= 6 && freq > 75) {
			this.aprovado = true;
			System.out.println("O aluno está aprovado! Parabéns.");
		} else {
			this.aprovado = false;
			System.out.println("O aluno está reprovado.");
			return this.aprovado;
		}
		return this.aprovado;
	}
	
	public void exibirAprovados() {
		int cont = 0;
		for(int i = 0; i <alunos.size(); i++) {
			if (this.aprovado) {
				cont++;
				System.out.println("O aluno" + alunos.get(i) + "está aprovado!");
			}
		}
		if (cont == alunos.size()) {
			System.out.println("Todos os alunos aprovados!");
		}
	}
	
	public int getNumAprovados() {
		int cont4 = 0;
		for(int i =0; i <alunos.size(); i++) {
			if(this.aprovado) {
				cont4++;
			} else {
				break;
			}
		}
		return cont4;
	}
	
	public void exibirReprovados() {
		int cont2 = 0;
		for(int i = 0; i <alunos.size(); i++) {
			if (!this.aprovado) {
				cont2++;
				System.out.println("O aluno" + alunos.get(i) + "está reprovado.");
			}
		}
		if (cont2 == 0) {
			System.out.println("Não há alunos reprovados!");
		}
	}
	
	public int getNumReprovados() {
		int cont3 = 0;
		for(int i =0; i <alunos.size(); i++) {
			if(!this.aprovado) {
				cont3++;
			} else {
				break;
			}
		}
		return cont3;
	}
	
	public boolean matricularAluno(Aluno a) {
		alunos.add(a);
		notas.add(0.0);
		frequencias.add(0);
		
		if (alunos.contains(a)) {
			System.out.println("Aluno matriculado com sucesso!");
		} else {
			return false;
		}
		return true;
 	}
	
	public boolean desmatricularAluno(int posAluno) {
		alunos.remove(posAluno);
		notas.remove(posAluno);
		frequencias.remove(posAluno);
		
		if(alunos.get(posAluno) == null) {
			System.out.println("Aluno desmatriculado com sucesso!");
		} else {
			return false;
		}
		return true;
 	}
	
	public double calcularMedia() {
		double media;
		double resNotas = 0;
		
		for (int i = 0; i < alunos.size(); i++) {
			resNotas = notas.get(i);
			resNotas++;
		}
		media = (resNotas / alunos.size());
		return media;
	}
	
	public void exibirMaiorNota() {
		double maiorNota = 0;
		for (int i = 0; i < notas.size(); i++) {
			maiorNota = notas.get(i);
			if (notas.get(i+1) > maiorNota) {
				maiorNota = notas.get(i+1);
			} else {
				break;
			}
		}
		System.out.println("A maior nota é:" + maiorNota);
	}
	
	public void exibirMenorNota() {
		double menorNota = 0;
		for (int i = 0; i < notas.size(); i++) {
			menorNota = notas.get(i);
			if (notas.get(i+1) < menorNota) {
				menorNota = notas.get(i+1);
			} else {
				break;
			}
		}
		System.out.println("A maior nota é:" + menorNota);
	}
	
}