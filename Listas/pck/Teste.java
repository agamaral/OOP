package pck;
import java.util.Scanner;

public class Teste 
{
    public static void main(String args[])
    {
        Funcionario f1 = new Funcionario();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o id");
        int id = sc.nextInt();
        f1.setIdentificacao(id);

        sc.nextLine();

        String nome = sc.next();

        System.out.println("Digite o nome");
        f1.setNome(nome);

        String cargo = sc.next();
        System.out.println("Digite o cargo");
        f1.setCargo(cargo);

        int salario = sc.nextInt();
        System.out.println("Digite o salario");
        f1.setSalario(salario);

        sc.nextLine();
        
        Endereco endereco = new Endereco();

       System.out.println("Digite infos do endereco:");
       System.out.println("Digite o nome da rua");
       String rua = sc.nextLine();
       endereco.setRua(rua);

       System.out.println("Digite o número da casa:");
       int numero = sc.nextInt();
       endereco.setNumero(numero);
       
       sc.nextLine();

       System.out.println("Digite o bairro:");
       String bairro = sc.nextLine();
       endereco.setBairro(bairro);

        System.out.println(f1.getIdentificacao());
        System.out.println(f1.getNome());
        System.out.println(f1.getSalario());
        System.out.println(f1.getCargo());

        sc.close();
    }
}