package pckGrupo;

public class Carro {

	private String placa;
	private String modelo;
	private int numPortas;
	private double diaria;

	private String nomeLocador;
	private String cpf;
	private int dias;
	private boolean alugado = false;
	
	
	public Carro() {

	}

	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	public double getDiaria() {
		return diaria;
	}
	public void setDiaria(double diaria) {
		this.diaria = diaria;
	}
	public String getNomeLocador() {
		return nomeLocador;
	}
	public void setNomeLocador(String nomeLocador) {
		this.nomeLocador = nomeLocador;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public boolean isAlugado() {
		return alugado;
	}
	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}
	
}