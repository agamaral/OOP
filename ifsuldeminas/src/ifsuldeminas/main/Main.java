package ifsuldeminas.main;

import java.util.Scanner;

import ifsuldeminas.academico.Disciplina;
import ifsuldeminas.alunos.Aluno;
import ifsuldeminas.funcionarios.Professor;

public class Main {

	public static void main(final String[] args) {
		
		Disciplina c1 = new Disciplina("Calculo I",1,4,20);
		
		Aluno a1 = new Aluno("Antonio", 234, 1,"Engenharia");
		Aluno a2 = new Aluno("Cindel", 233, 1,"Engenharia");
		Aluno a3 = new Aluno("Toto", 232, 1,"Engenharia");
		Aluno a4 = new Aluno("Eliezer", 231, 1,"Engenharia");
		Aluno a5 = new Aluno("Brenda", 230, 1,"Engenharia");
		Aluno a6 = new Aluno("Isa", 229, 1,"Engenharia");
		Aluno a7 = new Aluno("Matheus", 228, 1,"Engenharia");
		Aluno a8 = new Aluno("Mateus", 227, 1,"Engenharia");
		Aluno a9 = new Aluno("Leonardo", 226, 1,"Engenharia");
		Aluno a10 = new Aluno("Gabriel", 225, 1,"Engenharia");
		
		c1.matricularAluno(a1); 
		c1.matricularAluno(a2); 
		c1.matricularAluno(a3); 
		c1.matricularAluno(a4); 
		c1.matricularAluno(a5); 
		c1.matricularAluno(a6); 
		c1.matricularAluno(a7); 
		c1.matricularAluno(a8); 
		c1.matricularAluno(a9); 
		c1.matricularAluno(a10); 
		
		/* posicao 1 a 10, respectivamente */
		c1.addNota(0, 9);
		c1.addNota(1, 9);
		c1.addNota(2, 9);
		c1.addNota(3, 8);
		c1.addNota(4, 9);
		c1.addNota(5, 6);
		c1.addNota(6, 4);
		c1.addNota(7, 2);
		c1.addNota(8, 7);
		c1.addNota(9, 6);
		
		/* 80 = num max de aulas */
		c1.addFrequencia(0, 80);
		c1.addFrequencia(1, 80);
		c1.addFrequencia(2, 75);
		c1.addFrequencia(3, 75);
		c1.addFrequencia(4, 80);
		c1.addFrequencia(5, 80);
		c1.addFrequencia(6, 80);
		c1.addFrequencia(7, 80);
		c1.addFrequencia(8, 80);
		c1.addFrequencia(9, 80);
		
		Professor p1 = new Professor("Bruno", 256);
		c1.setProfessor(p1);
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.println("===========================================================================");
			System.out.println("=========================IFSULDEMINAS - BY ANTONIO AMARAL ===============");
			System.out.println("(0) DELETAR TUDO DA DISCIPLINA");
			System.out.println("(1) EXIBIR INFOS DAS DISCIPLINAS");
			System.out.println("(2) EXIBIR NUM DE APROVADOS E REPROVADOS");
			System.out.println("(3) EXIBIR APROVADOS");
			System.out.println("(4) EXIBIR REPROVADOS");
			System.out.println("(5) EXIBIR MENOR E MAIOR NOTA");
			System.out.println("(6) EXIBIR PROFESSOR DA DISCIPLINA");
			System.out.println("(7) EXIBIR ALUNOS ACIMA DAS MEDIA");
			System.out.println("(8) EXIBIR ALUNOS ABAIXO DA MEDIA");
			System.out.println("(9) EXIBIR NOTAS, NOMES E FREQUENCIAS");
			System.out.println("(10) EXIBIR ALUNOS ORDERNADOS PELA NOTA");
			System.out.println("(11) MATRICULAR ALUNO");
			System.out.println("===============================POO 2020/1==================================");
			System.out.println("===========================================================================");
			int op = sc.nextInt();
			
			int i = 10;
			while(op != 0) {
				switch (op) {
					case 0:
						
						c1.desmatricularAlunos();
						c1.removerProfessor();
						System.exit(0);
						break;
						
					case 1:
						
						c1.exibirDisciplina();
						break;
						
						
					case 2:
						System.out.println("O num de alunos eh:"+c1.getNumAlunos());
						System.out.println("O num de alunos reprovados eh:"+c1.getNumReprovados());
						System.out.println("O num de alunos aprovados eh:"+c1.getNumAprovados());
						
						
						break;
						
					case 3:
						
						c1.exibirAprovados();
						break;
						
					case 4:
						
						c1.exibirReprovados();
						break;
						
					case 5: // half working
						
						System.out.println("A maior nota eh:" +c1.exibirMaiorNota());
						System.out.println("A menor nota eh:" +c1.exibirMenorNota());
						break;
						
					case 6:
						
						c1.exibirProfessor();
						break;
						
					case 7:
						
						System.out.println("A media eh:" +c1.calcularMedia());
						System.out.println("Alunos acima da media:");
						c1.exibirAlunosAcimaMedia();
						break;
						
					case 8:
						
						System.out.println("A media eh:" +c1.calcularMedia());
						System.out.println("Alunos abaixo da media:");
						c1.exibirAlunosAbaixoMedia();
						break;
						
					case 9:
						
						c1.exibirAlunoNotaAproveitamento();
						break;
						
					case 10:
						
						c1.exibirOrdenadosPorNota();
						break;
						
					case 11:
						
						System.out.println("Digite o nome do aluno:");
						String nome = sc.next();
						
						System.out.println("Digite o RA (de 0 a 9999) para aluno:");
						int ra = sc.nextInt();
						
						System.out.println("Digite o curso do aluno:");
						String curso = sc.next();
						
				
						Aluno g1 = new Aluno(nome,ra,curso);
						c1.matricularAluno(g1);
							
						System.out.println("Digite a nota do aluno:");
						double nota = sc.nextDouble();
					
						c1.addNota(i, nota);
						
						
						System.out.println("Digite a frequencia do aluno:");
						int freq = sc.nextInt();
						c1.addFrequencia(i, freq);
						c1.estaMatriculado(g1);
						i++;
						break;
						
					default:
						
						break;
						
				}
				
				System.out.println("Aperte 12 para voltar ao menu");
				int decisao = sc.nextInt();
				
				if ( decisao == 12) {
					break;
				}
			}
			
		}
		//sc.close();
	}
	
}