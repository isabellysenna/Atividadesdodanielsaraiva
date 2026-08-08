import java.util.Scanner;

public class Questao2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("1 - Domingo");
                break;
            case 2:
                System.out.println("2 - Segunda-feira");
                break;
            case 3:
                System.out.println("3 - Terça-feira");
                break;
            case 4:
                System.out.println("4 - Quarta-feira");
                break;
            case 5:
                System.out.println("5 - Quinta-feira");
                break;
            case 6:
                System.out.println("6 - Sexta-feira");
                break;
            case 7:
                System.out.println("7 - Sábado");
                break;
            default:
                System.out.println("Número inválido! Por favor, digite um valor entre 1 e 7.");
                break;
        }

        scanner.close();
    }
}