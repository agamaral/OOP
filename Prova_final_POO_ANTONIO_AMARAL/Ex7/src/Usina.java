import java.util.Random;

public class Usina {
    private int x; //pressão
    private int y; //energia
    private int t; //tempo
    private boolean aumentou;

    Random random = new Random();
    
    public Usina() {
        this.x = 0;
        this.y = 0;
        this.t = 0;
        this.aumentou = false;
    }

    public Usina(int x, int t) {
        if (x >= 0 && x <= 30) {
            this.x = x;
        }
        this.y = (((-2 * x) * (t * t)) + (80 * x * t) + 3600);
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getT() {
        return this.t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public void alterarPressao(int x) {
        int numero = random.nextInt(5);

        if (x <= 10 && x >= 1) {
            if ( x > this.x) {
                this.aumentou = true;
            } else {
                this.aumentou = false;
            }
            this.x = x;
        }
        if ( aumentou == true ){
            this.x = this.x + numero;
        } else {
            this.x = this.x - numero;
        }

    }

 
}