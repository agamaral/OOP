package pck3;

public class Produto {
    public double preco;
    public int quantidade;

    public Produto (double preco, int quantidade) {
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public boolean attPreco(double novoPreco) { // atualiza preço
        if ( novoPreco < 0 ) {
            return false;
        }
        this.preco = novoPreco;
        return true;
    }

    public void visualiza() {
        System.out.println("O preço do produto é:" + this.preco);
        System.out.println("A quantidade em estoque é:"+ this.quantidade);
        System.out.println("O faturamento é:" + (this.preco * this.quantidade));
    }

    public void addProduto(int n) {
        this.quantidade = this.quantidade + n;
        System.out.println("A nova quantidade de produtos é:" + this.quantidade);
    }    

    public int vendeProduto(int n) {
        if ( n > this.quantidade ) {
            return -1;
        }
        this.quantidade = this.quantidade - n;
        return this.quantidade;
    }
}