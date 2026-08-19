package Livro;

public class Q03cliente {
    private int numeroCliente;
    private String nomeCliente;
    private char sexoCliente;

    public Q03cliente(int numeroCliente, String nomeCliente, char sexoCliente) {
        this.numeroCliente = numeroCliente;
        this.nomeCliente = nomeCliente;
        this.sexoCliente = sexoCliente;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public char getSexoCliente() {
        return sexoCliente;
    }

    public double calcularDescontoAdicional(double preco) {
        if (sexoCliente == 'F' || sexoCliente == 'f') {
            return preco * 0.05;
        } else {
            return 0;
        }
    }
}