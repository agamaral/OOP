package Ex4;

public class ConversaoDeUnidadesDeArea {
	private int metros;
	private int pes;
	private int centimetros;
	private int milhas;
	private double acres;
	

	public int converteMetro(int metros) {
		this.pes = (int) (metros * 10.76);
		return this.pes;
	}
	
	public int convertePe(int pes) {
		this.centimetros = pes * 929;
		return this.centimetros;
	}
	public double converteMilha (int milhas) {
		this.acres = (int) (milhas * 640);
		return this.acres;
	}
	public double converteAcre (int acres) {
		this.pes = (int) (acres * 43.560);
		return this.pes;
	}
	
}
