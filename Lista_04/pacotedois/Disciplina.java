package pacotedois;
public class Disciplina {
    private Aluno alunos[];
    private int res;

    public Disciplina(int numAlunos) { //numAlunos é apenas a qtd inicial de alunos
        alunos = new int[numAlunos];
    }

    public void removeAluno(Aluno a) {
        int i;
        for (i = 0; i < numAlunos; i++) {
            if (a.equals(alunos[i])) {
                alunos[i] = null;
                break;
            }
        }
        if (i < numAlunos) {
            for (; i < numAlunos - 1; i++) {
                alunos[i] = alunos[i + 1];
            }
            numAlunos--;
        } else {
            System.out.println("Este aluno não existe! :(");
        }
    }

    public void addAluno(Aluno a) {
        int j;
        alunos[i]++;
        for(j = 0; j < numAlunos; i++) {
            if (a != alunos[i]) {
                alunos[i] = a;
                break;
            } else {
                System.out.println("Este aluno já existe! :(");
            }
        }
    }

    public int getNumAlunos() {
        for(int k=0; k< alunos.lenght(); k++) {
            res = alunos++;
        }   
        numAlunos = res;
        return numAlunos;
    }

    public void exibeAlunos() {
        for(int z=0; z <alunos.lenght(); z++) {
            exibeInfos(alunos[z]);
        }
    }

}