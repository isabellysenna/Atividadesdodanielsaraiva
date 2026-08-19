package Livro;

public class Q03compra {
    private int numeroProduto;
    private int numeroCliente;
    private int quantidade;
    private double valorTotal;

    public  Q03compra(int numeroProduto, int numeroCliente, int quantidade) {
        this.numeroProduto = numeroProduto;
        this.numeroCliente = numeroCliente;
        this.quantidade = quantidade;
    }

    public void calcularValorTotal(Q03produto produto, Q03cliente cliente) {
        double preco = produto.getPrecoProduto();
        double descontoProduto = produto.calcularDesconto();
        double precoComDesconto = preco - descontoProduto;
        double descontoCliente = cliente.calcularDescontoAdicional(precoComDesconto);
        double precoFinal = precoComDesconto - descontoCliente;

        valorTotal = quantidade * precoFinal;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
