package ifsuldeminas.academico;

import java.util.ArrayList;
import java.util.Collections;

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

	public Disciplina (String nome, int periodo, int numAulasSemana, int numSemanas) {
		this.nome = nome;
		this.periodo = periodo;
		this.numTotalAulas = numAulasSemana * numSemanas;
		this.professor = null;
	}
	
	public Disciplina (String nome, int periodo, int numAulasSemana, int numSemanas, Professor p) {
		this.nome = nome;
		this.periodo = periodo;
		this.numTotalAulas = numAulasSemana * numSemanas;
		this.professor = p;
	}
	
	public void setProfessor(Professor p) {
		this.professor = p;
	}
		
	public void exibirProfessor() {
		if (this.professor != null) {
			System.out.println("O professor da disciplina eh:" + professor.getNome());
		} else {
			System.out.println("Disciplina nao tem professor.");
		}
	}
	
	public void removerProfessor() {
		this.professor = null;
	}
	
	public int getNumAlunos() {
		return alunos.size();
	}
	public int getNumNotas() {
		return notas.size();
	}
	
	public double getAproveitamentoAluno(int posAluno) {
		return frequencias.get(posAluno);
	}
	
	public void exibirAlunosAcimaMedia() {
		if (alunos != null) {
			for(int i =0; i< alunos.size(); i++) {
				if(notas.get(i) > calcularMedia()) {
					System.out.println(alunos.get(i).getNome());
					
				}
			}
		} else {
			System.out.println("Nao existem alunos matriculados na disciplina.");
		}
	}
	
	public void exibirAlunosAbaixoMedia() {
		if (alunos != null) {
			for(int i =0; i< alunos.size(); i++) {
				if(notas.get(i) < calcularMedia()) {
					System.out.println(alunos.get(i).getNome());
				}
			}
		} else {
			System.out.println("Nao existem alunos matriculados na disciplina.");
		}
	}
	
	public void exibirAlunoNotaAproveitamento() {
		for(int i=0; i< alunos.size(); i++) {
			System.out.println("O nome do aluno eh:" + alunos.get(i).getNome());
			System.out.println("A nota do aluno eh:" + notas.get(i));
			System.out.println("O aproveitamento do aluno eh: "+frequencias.get(i)+"%");
		}
	}

	public void exibirOrdenadosPorNota() {
		
		 Collections.sort(notas);
		 
		 for(int i = notas.size() - 1; i >= 0; i--) {
				System.out.println("Aluno: "+alunos.get(i).getNome()+", Nota: " + notas.get(i));
		 }
	}
	
	public void exibirDisciplina() {
		
		System.out.println("O nome da disciplina eh:" + this.nome);
		System.out.println("A disciplina eh ofertada no "+ this.periodo + "� periodo");
		
		if(alunos != null) {
			exibirProfessor();
			System.out.println("O num de alunos �:"+ getNumAlunos());
			System.out.println("A m�dia total da turma �:" + calcularMedia());
			System.out.println("Quantidade de alunos aprovados:" + getNumAprovados());
			System.out.println("Quantidade de alunos reprovados:" + getNumReprovados());
		} else {
			System.out.println("N�o existem alunos matriculados na disciplina.");
		}

	}
	
	public boolean addNota(int posAluno, double nota) {
		if (nota >= 0 && nota <= 10) {
			notas.add(posAluno,nota);
		} else {
			System.out.println("Nota inv�lida.");
		}
		
		if (notas.get(posAluno) == nota) {
			//System.out.println("Nota adicionada.");
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
			System.out.println("Frequ�ncia inv�lida.");
		}
		
		if (frequencias.get(posAluno) == frequenciaTotal) {
			//System.out.println("Frequ�ncia adicionada.");
		} else {
			System.out.println("Erro ao adicionar frequ�ncia.");
			return false;
		}
		return true;
	}
	
	public boolean estaAprovado(int posAluno) {
		double n = notas.get(posAluno);
		int freq = frequencias.get(posAluno);
		
		if (n >= 6 && freq > 0.75 * numTotalAulas) {
			this.aprovado = true;
			System.out.println("O aluno est� aprovado! Parab�ns.");
		} else {
			this.aprovado = false;
			System.out.println("O aluno est� reprovado.");
			return this.aprovado;
		}
		return this.aprovado;
	}
	
	public void estaMatriculado(Aluno a) {
		for(int i = 0; i< alunos.size(); i++) {
			if (alunos.get(i) == a) {
				System.out.println("Aluno matriculado com sucesso.");
			}
		}
	}
	public void exibirAprovados() {
		int cont = 0;
		for(int i = 0; i <alunos.size(); i++) {
			if (notas.get(i) >= 6) {
				cont = cont + 1;
				System.out.println("O aluno " + alunos.get(i).getNome() + " est� aprovado!");
			}
		}
		if (cont == alunos.size()) {
			System.out.println("Todos os alunos aprovados!");
		}
	}
	
	public int getNumAprovados() {
		int cont = 0;
		for(int i =0; i <alunos.size(); i++) {
			if(notas.get(i) >= 6) {
				cont++;
			}
		}
		return cont;
	}
	
	public void exibirReprovados() {
		int cont = 0;
		for(int i = 0; i <alunos.size(); i++) {
			if (notas.get(i) < 6) {
				cont = cont + 1;
				System.out.println("O aluno " + alunos.get(i).getNome() + " est� reprovado.");
			}
		}
		if (cont == 0) {
			System.out.println("N�o h� alunos reprovados!");
		}
	}
	
	public int getNumReprovados() {
		int cont = 0;
		for(int i =0; i <alunos.size(); i++) {
			if(notas.get(i) < 6) {
				cont = cont + 1;
			}
		}
		return cont;
	}
	
	public boolean matricularAluno(Aluno a) {
		alunos.add(a);
		//notas.add(0.0);
		//frequencias.add(0);
		
		if (!alunos.contains(a)) {
			return false;
		} else {
			return true;
		}
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
	
	public void desmatricularAlunos() {
		alunos.clear();
	}
	
	public double calcularMedia() {
		double media;
		double resNotas = 0;
		
		for (int i = 0; i < alunos.size(); i++) {
			resNotas = notas.get(i) + resNotas;
		}
		media = (resNotas / alunos.size());
		return media;
	}

	
	public double exibirMaiorNota() {
		return Collections.max(notas);
	}
	
	public double exibirMenorNota() {
		return Collections.min(notas);
	}
	
}