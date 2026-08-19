package Livro;

public class Q03produto {
     
    private int numeroProduto;
    private double precoProduto;

    public Q03produto(int numeroProduto, double precoProduto) {
        this.numeroProduto = numeroProduto;
        this.precoProduto = precoProduto;
    }

    public int getNumeroProduto() {
        return numeroProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public double calcularDesconto() {
        if (precoProduto > 100) {
            return precoProduto * 0.15;
        } else {
            return precoProduto * 0.05;
        }
    }
}

