package pacotedois;
import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Aluno a1 = new Aluno("Antônio", 19, 4);
        Aluno a2 = new Aluno("Toto",23,4);
        Disciplina poo = new Disciplina(35); // 35 alunos cadastrados
        poo.addAluno(a1);
        poo.addAluno(a2);

        poo.exibeAlunos();

    }
}