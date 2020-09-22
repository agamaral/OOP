package Ex5;

public class ConversaoDeUnidadesDeTempo {
	private int minutos;
	private int segundos;
	private int horas;
	private double dias;
	private int semanas;
	private int anos;
	private int meses;
	

	public int converteMinutos(int minutos) {
		this.segundos = minutos * 60;
		return this.segundos;
	}
	
	public int converteHoras(int horas) {
		this.minutos = horas * 60;
		return this.minutos;
	}
	public int converteDias (int dias) {
		this.horas = dias * 24;
		return this.horas;
	}
	public double converteSemanas (int semanas) {
		this.dias = semanas * 7;
		return this.dias;
	}
	public double converteMeses (int meses) {
		this.dias = meses * 30;
		return this.dias;
	}
	public double converteAnos (int anos) {
		this.dias = anos * 365.25;
		return this.dias;
	}
	

}
