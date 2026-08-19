package Livro;

public class Q04disciplinaPratica extends Q04disciplina {
    private int cargaHorariaPratica;

    public Q04disciplinaPratica(int codigo, String nome, int cargaHorariaGeral, int cargaHorariaPratica) {
        super(codigo, nome, cargaHorariaGeral);
        this.cargaHorariaPratica = cargaHorariaPratica;
    }

    public int getCargaHorariaPratica() {
        return cargaHorariaPratica;
    }

    @Override
    public boolean ehPratica() {
        return true;
    }
}
