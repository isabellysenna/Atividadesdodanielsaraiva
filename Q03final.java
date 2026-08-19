package Livro;

    import java.util.Scanner;

    public class Q03final {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Q03produto[] produtos = new Q03produto[3];
        Q03cliente[] clientes = new Q03cliente[3];

        for (int i = 0; i < 3; i++) {

            System.out.print("digite o número do produto: ");
            int numero = entrada.nextInt();

            double preco;

            do {
                System.out.print("digite o preço do produto (20 a 350): ");
                preco = entrada.nextDouble();
            } while (preco < 20 || preco > 350);

            produtos[i] = new Q03produto(numero, preco);
        }

        entrada.nextLine();

        for (int i = 0; i < 3; i++) {

            System.out.print("digite o número do cliente: ");
            int numero = entrada.nextInt();
            entrada.nextLine();

            System.out.print("digite o nome do cliente: ");
            String nome = entrada.nextLine();

            char sexo;

            do {
                System.out.print("digite o sexo (M/m/F/f): ");
                sexo = entrada.next().charAt(0);
            } while (sexo != 'M' && sexo != 'm' &&
                     sexo != 'F' && sexo != 'f');

            clientes[i] = new Q03cliente(numero, nome, sexo);
        }

        System.out.print("digite o número do produto da compra: ");
        int numeroProduto = entrada.nextInt();

        System.out.print("digite o número do cliente da compra: ");
        int numeroCliente = entrada.nextInt();

        System.out.print("digite a quantidade comprada: ");
        int quantidade = entrada.nextInt();

        Q03produto produtoEscolhido = null;
        Q03cliente clienteEscolhido = null;

        for (int i = 0; i < 3; i++) {
            if (produtos[i].getNumeroProduto() == numeroProduto) {
                produtoEscolhido = produtos[i];
            }
        }

        for (int i = 0; i < 3; i++) {
            if (clientes[i].getNumeroCliente() == numeroCliente) {
                clienteEscolhido = clientes[i];
            }
        }

        Q03compra compra = new Q03compra(numeroProduto, numeroCliente, quantidade);

        compra.calcularValorTotal(produtoEscolhido, clienteEscolhido);

        System.out.printf("valor total da compra: R$ %.2f%n",
                compra.getValorTotal());

        entrada.close();
    }
}

