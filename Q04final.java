package Livro;
 import java.util.Scanner;

public class Q04final {
   
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Q04aluno[] alunos = new Q04aluno[10];
        Q04disciplina[] disciplinas = new Q04disciplina[5];
        Q04matricula[] matriculas = new Q04matricula[30];

        int qtdAlunos = 0;
        int qtdDisciplinas = 0;
        int qtdMatriculas = 0;
        int opcao;

        do {
            System.out.println("\n1 - cadastrar disciplina");
            System.out.println("2 - cadastrar aluno");
            System.out.println("3 - matricular aluno");
            System.out.println("4 - lançar nota");
            System.out.println("5 - mostrar boletim");
            System.out.println("0 - sair");
            System.out.print("opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {

                case 1:
                    entrada.nextLine();

                    System.out.print("código: ");
                    int cd = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("nome: ");
                    String nome = entrada.nextLine();

                    System.out.print("carga horária: ");
                    int ch = entrada.nextInt();

                    System.out.print("é prática? 1-sim 0-não: ");
                    int pratica = entrada.nextInt();

                    if (pratica == 1) {
                        System.out.print("carga prática: ");
                        int cp = entrada.nextInt();

                        disciplinas[qtdDisciplinas] =
                                new Q04disciplinaPratica(cd, nome, ch, cp);
                    } else {
                        disciplinas[qtdDisciplinas] =
                                new Q04disciplina(cd, nome, ch);
                    }

                    qtdDisciplinas++;
                    break;

                case 2:
                    entrada.nextLine();

                    System.out.print("código: ");
                    int ca = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("nome: ");
                    nome = entrada.nextLine();

                    alunos[qtdAlunos] = new Q04aluno(ca, nome);
                    qtdAlunos++;
                    break;

                case 3:
                    System.out.print("código do aluno: ");
                    ca = entrada.nextInt();

                    System.out.print("código da disciplina: ");
                    cd = entrada.nextInt();

                    System.out.print("ano: ");
                    int ano = entrada.nextInt();

                    System.out.print("série: ");
                    int serie = entrada.nextInt();

                    Q04aluno aluno = alunos[0];
                    Q04disciplina disciplina = disciplinas[0];

                    for (int i = 0; i < qtdAlunos; i++) {
                        if (alunos[i].getCodigo() == ca)
                            aluno = alunos[i];
                    }

                    for (int i = 0; i < qtdDisciplinas; i++) {
                        if (disciplinas[i].getCodigo() == cd)
                            disciplina = disciplinas[i];
                    }

                    matriculas[qtdMatriculas] =
                            new Q04matricula(ano, serie, aluno, disciplina);

                    qtdMatriculas++;
                    break;

                case 4:
                    System.out.print("código do aluno: ");
                    ca = entrada.nextInt();

                    System.out.print("código da disciplina: ");
                    cd = entrada.nextInt();

                    System.out.print("ano: ");
                    ano = entrada.nextInt();

                    System.out.print("bimestre: ");
                    int bim = entrada.nextInt();

                    for (int i = 0; i < qtdMatriculas; i++) {
                        if (matriculas[i].getAluno().getCodigo() == ca &&
                            matriculas[i].getDisciplina().getCodigo() == cd &&
                            matriculas[i].getAnoLetivo() == ano) {

                            System.out.print("nota: ");
                            double nota = entrada.nextDouble();

                            matriculas[i].alterarNota(bim, nota);
                        }
                    }
                    break;

                case 5:
                    System.out.print("código do aluno: ");
                    ca = entrada.nextInt();

                    System.out.print("ano: ");
                    ano = entrada.nextInt();

                    for (int i = 0; i < qtdMatriculas; i++) {

                        if (matriculas[i].getAluno().getCodigo() == ca &&
                            matriculas[i].getAnoLetivo() == ano) {

                            System.out.println(
                                    "\nAluno: " +
                                    matriculas[i].getAluno().getNome());

                            System.out.println(
                                    "Disciplina: " +
                                    matriculas[i].getDisciplina().getNome());

                            System.out.println(
                                    "1º Bim.: " +
                                    matriculas[i].getNota1Bim());

                            System.out.println(
                                    "2º Bim.: " +
                                    matriculas[i].getNota2Bim());

                            System.out.println(
                                    "3º Bim.: " +
                                    matriculas[i].getNota3Bim());

                            System.out.println(
                                    "4º Bim.: " +
                                    matriculas[i].getNota4Bim());

                            System.out.printf(
                                    "Média: %.2f%n",
                                    matriculas[i].calcularMedia());
                        }
                    }
                    break;

                case 0:
                    System.out.println("fim.");
                    break;
            }

        } while (opcao != 0);

        entrada.close();
    }
}

