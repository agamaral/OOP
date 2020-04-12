package pckGrupo;

import java.util.ArrayList;

public class Locadora {
	private ArrayList<Carro> listaCarros;
	
	private int carrosDisponiveis = 0;
	private int carrosAlugados = 0;

	public Locadora(){
		listaCarros = new ArrayList<Carro>();
	}
	
	public int getCarrosDisponiveis(){
		return this.carrosDisponiveis;
	}
	
	public int getCarrosAlugados(){
		return this.carrosAlugados;
	}
	
	public void alugados(){
		for (Carro carro : listaCarros) {
			if(carro.isAlugado()){
				System.out.println("Placa: " + carro.getPlaca());
				System.out.println("Modelo: " + carro.getModelo());
				System.out.println("Numero de Portas: " + carro.getNumPortas());
				System.out.println("Diaria: " + carro.getDiaria());
				System.out.println("Nome do locador: " + carro.getNomeLocador());
				System.out.println("CPF: " + carro.getCpf());
				System.out.println("Faltam " + carro.getDias() + " dias para o empréstimo terminar");
				System.out.println("___________________________");
			}
		}
	}
	
	public void naoAlugados(){
		int id = 0;
		for (Carro carro : listaCarros) {
			if(!carro.isAlugado()){
				System.out.println("Cod." + (id));
				System.out.println("Placa: " + carro.getPlaca());
				System.out.println("Modelo: " + carro.getModelo());
				System.out.println("Numero de Portas: " + carro.getNumPortas());
				System.out.println("Diaria: " + carro.getDiaria());
				System.out.println("___________________________");
				id = id + 1;
			}
		}
	}
	
	public void addCarro(Carro novoCarro) {
		
		listaCarros.add(novoCarro);
		carrosDisponiveis++;
		
	}
	
	public boolean removerVeiculo(String placa) {
		
		for (Carro carro : listaCarros) {
			if(carro.getPlaca().equals(placa)){
				if(carro.isAlugado()) {
					return false;
				}
				carro = null;
				carrosDisponiveis--;
				return true;
				
			}
		}
		return false;
	}
	
	public boolean alugaCarro(int opcao, String nome, String cpf, int dias) {
		
		if((opcao > listaCarros.size()-1) || opcao < 0) {
			return false;
		}else {
			
			carrosDisponiveis--;
			carrosAlugados++;
			listaCarros.get(opcao).setAlugado(true);
			listaCarros.get(opcao).setCpf(cpf);
			listaCarros.get(opcao).setNomeLocador(nome);
			listaCarros.get(opcao).setDias(dias);
			System.out.println("O valor total a ser pago é: " + (listaCarros.get(opcao).getDiaria() * dias));
			
			return true;
		}
	
		
		
		
	}
	
	public boolean desAlugaCarro(String cpf) {
		
		for (Carro carro : listaCarros) {
			if(carro.getCpf().equals(cpf)){
				carrosAlugados--;
				carro.setAlugado(false);
				carro.setDias(0);
				carro.setNomeLocador(null);
				return true;
			}
		}
		
		return false;
		
		
	}
	
	

}