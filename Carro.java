public class Carro {
    String placa;
    int anoFabricacao;

    double calcularImposto(int anoAtual) {
        int anosDeUso = anoAtual - anoFabricacao;

        if (anosDeUso >= 10) {
            return 0;
        }

        double imposto = 500 - (anosDeUso * 100);

        if (imposto < 100) {
            imposto = 100;
        }

        return imposto;
    }

    static double totalImpostos(Carro[] carros, int anoAtual) {
        double total = 0;

        for (Carro carro : carros) {
            total += carro.calcularImposto(anoAtual);
        }

        return total;
    }

    static int carrosIsentos(Carro[] carros, int anoAtual) {
        int quantidade = 0;

        for (Carro carro : carros) {
            if (carro.calcularImposto(anoAtual) == 0) {
                quantidade++;
            }
        }

        return quantidade;
    }
}

