package laboratorio.util;

public class Tempo {
	private int h; // 0 a 24
	private int m; // 0 a 59
	private int s; // 0 a 59
	
	public Tempo(int h, int m, int s) {
		this.h = h;
		this.m = m;
		this.s = s;
	}
	
	public Tempo() {
		
	}

	public void setH(int h) {
		if ( h >= 0 && h <=24) {
			this.h = h;
		} else {
			System.out.println("Não foi possível atribuir as horas.");
		}
	}
	public int getH() {
		return h;
	}
	
	public void setM(int m) {
		if ( m >= 0 && m <= 59) {
			this.m = m;
		} else {
			System.out.println("Não foi possível atribuir os minutos.");
		}
	}
	public int getM() {
		return m;
	}
	
	public void setS(int s) {
		if ( s >= 0 && s <= 59) {
			this.s = s;
		} else {
			System.out.println("Não foi possível setar os segundos.");
		}
	}
	public int getS() {
		return s;
	}
	
	public void exibirTempo() {
	
		if (this.h < 10 && this.m < 10 && this.s < 10) {
			System.out.println("0" + this.getH() + ":0" + this.getM() + ":0" + this.getS());
		} else if (this.h < 10 && this.m < 10) {
			System.out.println("0" + this.getH() + ":0" + this.getM() + ":" + this.getS());
		} else if (this.h < 10 && this.s < 10) {
			System.out.println("0" + this.getH() + ":" + this.getM() + ":0" + this.getS());
		} else if (this.m < 10 && this.s < 10) {
			System.out.println("" + this.getH() + ":0" + this.getM() + ":0" + this.getS());
		} else if (this.h < 10) {
			System.out.println("0" + this.getH() + ":" + this.getM() + ":" + this.getS());
		} else if (this.m < 10) {
			System.out.println("" + this.getH() + ":0" + this.getM() + ":" + this.getS());
		} else if (this.s < 10) {
			System.out.println("0" + this.getH() + ":" + this.getM() + ":0" + this.getS());
		} else {
			System.out.println("" + this.getH() + ":" + this.getM() + ":" + this.getS());
		}
	}	
}
