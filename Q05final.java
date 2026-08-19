package Livro;

 import java.util.Scanner;

public class Q05final {

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        Q05funcionario[] f = new Q05funcionario[10];
        Q05dependente[] d = new Q05dependente[30];
        int nf = 0, nd = 0, op;

        do {
            System.out.println("\n1-cadastrar\n2-bonus\n3-excluir\n4-alterar salario\n0-sair");
            op = s.nextInt();
            s.nextLine();

            if (op == 1) {
                System.out.print("numero: ");
                int n = s.nextInt();
                s.nextLine();

                System.out.print("nome: ");
                String nome = s.nextLine();

                System.out.print("cargo: ");
                String cargo = s.nextLine();

                System.out.print("salario: ");
                double sal = s.nextDouble();

                f[nf] = new Q05funcionario(n, nome, cargo, sal);

                System.out.print("dependentes: ");
                int q = s.nextInt();
                s.nextLine();

                for (int i = 0; i < q; i++) {
                    System.out.print("nome: ");
                    d[nd++] = new Q05dependente(f[nf], s.nextLine());
                }
                nf++;
            }

            if (op == 2)
                for (int i = 0; i < nf; i++) {
                    int q = 0;
                    for (int j = 0; j < nd; j++)
                        if (d[j].getFuncionario() == f[i]) q++;
                    System.out.printf("%s - %d dependentes - R$ %.2f%n",
                            f[i].getNomeFuncionario(), q,
                            f[i].getSalario() * .02 * q);
                }

            if (op == 3) {
                System.out.print("numero: ");
                int n = s.nextInt(), p = -1;

                for (int i = 0; i < nf; i++)
                    if (f[i].getNumeroFuncionario() == n) p = i;

                if (p < 0)
                    System.out.println("Funcionário Inexistente");
                else {
                    for (int i = 0; i < nd; i++)
                        if (d[i].getFuncionario() == f[p]) {
                            for (int j = i; j < nd - 1; j++) d[j] = d[j + 1];
                            d[--nd] = null;
                            i--;
                        }

                    for (int i = p; i < nf - 1; i++) f[i] = f[i + 1];
                    f[--nf] = null;
                }
            }

            if (op == 4) {
                System.out.print("numero: ");
                int n = s.nextInt();
                Q05funcionario x = null;

                for (int i = 0; i < nf; i++)
                    if (f[i].getNumeroFuncionario() == n) x = f[i];

                if (x == null)
                    System.out.println("Funcionário Inexistente");
                else {
                    System.out.print("novo salario: ");
                    x.setSalario(s.nextDouble());
                }
            }

        } while (op != 0);

        s.close();
    }
}


