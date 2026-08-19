package Livro;

public class Q04disciplina {
     private int codigo;
    private String nome;
    private int cargaHorariaGeral;

    public Q04disciplina(int codigo, String nome, int cargaHorariaGeral) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHorariaGeral = cargaHorariaGeral;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHorariaGeral() {
        return cargaHorariaGeral;
    }

    public boolean ehPratica() {
        return false;
    }
}
