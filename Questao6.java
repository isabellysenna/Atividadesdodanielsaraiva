import java.util.Scanner;

public class Questao6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0; 

        while (opcao != 4) {
            System.out.println("\n=======================");
            System.out.println("     MENU PRINCIPAL    ");
            System.out.println("=======================");
            System.out.println("1 - Ver mensagem de boas-vindas");
            System.out.println("2 - Mostrar a hora atual");
            System.out.println("3 - Elogiar programador(a)");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            System.out.println();

            switch (opcao) {
                case 1:
                    System.out.println("-> Olá! Seja muito bem-vindo(a) ao nosso sistema!");
                    break;
                case 2:
                    System.out.println("-> Hora atual: " + java.time.LocalTime.now().withNano(0));
                    break;
                case 3:
                    System.out.println("-> Mandou bem! Você está aprendendo Java muito rápido!");
                    break;
                case 4:
                    System.out.println("-> Encerrando o programa... Até logo!");
                    break;
                default:
                    System.out.println("-> Opção inválida! Por favor, escolha um número de 1 a 4.");
                    break;
            }
        }
        scanner.close();
    }
}
