import java.util.Scanner;

public class Questao4{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double soma = 0; 
        double numero;  

        System.out.print("Digite um número (ou 0 para encerrar): ");
        numero = scanner.nextDouble();

        while (numero != 0) {
            
            soma += numero; 

            System.out.print("Digite outro número (ou 0 para encerrar): ");
            numero = scanner.nextDouble();
        }

        System.out.println("\n--- Resultado ---");
        System.out.println("A soma total dos números digitados é: " + soma);

        scanner.close();
    }
}