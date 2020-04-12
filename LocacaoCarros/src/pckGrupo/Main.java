package pckGrupo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int op = 0;
		Locadora locadora = new Locadora();

		String cpf;
		String devolveCpf;
		String nome;
		int dias;

		String placa;
		String removePlaca;
		String modelo;
		int numPortas;
		double diaria;

		System.out.println("=====  LVeículos  =====\n");

		System.out.println("Seja Bem-Vindo");
		System.out.println("===============\n");

		do {

			System.out.println("\nEscolha a opção que deseja executar\n");

			System.out.println("1 - Alugar Carro");
			System.out.println("2 - Cadastrar Novo Carro");
			System.out.println("3 - Exibir Carros Disponíveis");
			System.out.println("4 - Exibir Carros Alugados");
			System.out.println("5 - Remover Carro do Catálogo");
			System.out.println("6 - Devolver Carro Alugado");
			System.out.println("7 - Sair");
			System.out.println("\n\n");
			op = leitor.nextInt();

			switch (op) {

			case 1:

				System.out.println("ALUGAR CARRO\n");
				System.out.println("Processo para aluguel de carros\n");
				System.out.println("Esses são os carros disponíveis:\n");

				locadora.naoAlugados();

				if (locadora.getCarrosDisponiveis() > 0) {
					
					System.out.println("Digite qual carro voce vai querer alugar (Escolha pelo Cod.):");
					op = leitor.nextInt();
					System.out.println("Digite seu nome:");
					nome = leitor.next();
					System.out.println("Digite seu CPF:");
					cpf = leitor.next();
					do {
						System.out.println("Digite a quantidade de dias");
						dias = leitor.nextInt();
						
						if(dias < 0) {
							System.out.println("Número de dias não permitido, digite novamente");
						}
					}while(dias < 0);
					
					
					

					if(locadora.alugaCarro(op, nome, cpf, dias)) {
						System.out.println("Alugado com sucesso\n");
						
					}else {
						System.out.println("Não existe um carro disponível com esse código");
					}

				} else {
					System.out.println("Não há carros disponíveis para alugar!");
				}

				break;

			case 2:

				System.out.println("Cadastrar Carros\n");
				Carro carro = new Carro();
				System.out.println("Digite a placa do carro:");
				placa = leitor.next();
				System.out.println("Digite o modelo do carro:");
				modelo = leitor.next();
				
				do {
					System.out.println("Digite o número de portas do carro:");
					numPortas = leitor.nextInt();
					
					if(numPortas < 0) {
						System.out.println("Número de portas não permitido, digite novamente");
					}
				}while(numPortas < 0);
				
				do {
					System.out.println("Digite a diaria do carro:");
					diaria = leitor.nextDouble();
					
					if(diaria < 0) {
						System.out.println("Valor da diaria não permitido, digite novamente");
					}
				}while(diaria < 0);
				

				carro.setPlaca(placa);
				carro.setModelo(modelo);
				carro.setNumPortas(numPortas);
				carro.setDiaria(diaria);

				locadora.addCarro(carro);

				break;

			case 3:
				
				if (locadora.getCarrosDisponiveis() > 0) {
				
					System.out.println("Carros Disponíveis:\n");

					locadora.naoAlugados();
				}else {
					System.out.println("Nenhum carro disponível:");
				}

				break;

			case 4:

				if(locadora.getCarrosAlugados()>0) {
					
					System.out.println("Carros Alugados:\n");

					locadora.alugados();
					
				}else {
					
					System.out.println("Nenhum carro alugado!");
					
				}
				
				
				break;

			case 5:

				System.out.println("Remover Carro do Catálogo");

				System.out.println("Digite a placa do carro que deseja remover");
				removePlaca = leitor.next();

				if (locadora.removerVeiculo(removePlaca)) {
					System.out.println("Carro removido com sucesso");
				} else {
					System.out.println("Essa placa não existe ou o carro esta alugado!");
				}

				break;
			case 6:

				System.out.println("Devolver Carro");
				
				System.out.println("Digite o CPF para devolver o carro");
				devolveCpf = leitor.next();
				
				
				if(locadora.desAlugaCarro(devolveCpf)) {
					System.out.println("Carro devolvido com sucesso:");
				}else {
					System.out.println("Nenhum carro alugado com o CPF digitado!");
				}
				
				
				break;

			case 7:

				System.out.println("Obrigado por utilizar LVeículos");

				break;

			default:

				System.out.println("Opção indisponível");

				break;

			}

		} while (op != 7);

		leitor.close();

	}

}
