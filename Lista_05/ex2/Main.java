package ex2;
// import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Empresa aldeia = new Empresa("Aldeia Consultoria Júnior","4513628792-0");

        Departamento depTI = new Departamento("TI");
        Departamento administrativo = new Departamento("Administrativo");
        Departamento financeiro = new Departamento("Financeiro");

        Funcionario antonio = new Funcionario("Antonio Amaral",0,"03/2020");
        Funcionario eliezer = new Funcionario("Eliezer Mafra",0,"03/2020");
        Funcionario toto = new Funcionario("Vinicius Ferraz",200,"04/2019");
        Funcionario muhammed = new Funcionario("Matheus Spigariol",0,"03/2020");

        Aldeia.setDepartamento("TI");
        Aldeia.setDepartamento("Administrativo");
        Aldeia.setDepartamento("Financeiro");

        depTI.setFuncionarios(antonio);
        depTI.setFuncionarios(eliezer);
        depTI.setFuncionarios(muhammed);
        financeiro.setFuncionarios(toto);

        depTI.setAumento(10); //aumento em 10% o salário de todos do TI;


    }
}