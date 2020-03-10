package pckE;
import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Aluno a1 = new Aluno("Antônio", 19, 4);
        Disciplina poo = new Disciplina(10); // 10 alunos cadastrados
        poo.addAluno(a1);

    }
}