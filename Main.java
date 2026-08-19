import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Carro[] carros = new Carro[5];

        System.out.print("digite o ano atual: ");
        int anoAtual = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < 5; i++) {
            carros[i] = new Carro();

            System.out.println("\ncarro " + (i + 1));

            System.out.print("placa: ");
            carros[i].placa = entrada.nextLine();

            System.out.print("ano de fabricação: ");
            carros[i].anoFabricacao = entrada.nextInt();
            entrada.nextLine();
        }

        System.out.println("\nresultado:");

        for (Carro carro : carros) {
            System.out.printf("placa: %s - imposto: R$ %.2f%n",
                    carro.placa,
                    carro.calcularImposto(anoAtual));
        }

        System.out.printf("%ntotal dos impostos: R$ %.2f%n",
                Carro.totalImpostos(carros, anoAtual));

        System.out.println("carros isentos: " +
                Carro.carrosIsentos(carros, anoAtual));

        entrada.close();
    }
}
