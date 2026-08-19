package Livro;

public class Q04matricula {
    private int anoLetivo;
    private int serie;
    private Q04aluno aluno;
    private Q04disciplina disciplina;
    private double nota1Bim;
    private double nota2Bim;
    private double nota3Bim;
    private double nota4Bim;

    public Q04matricula(int anoLetivo, int serie, Q04aluno aluno, Q04disciplina disciplina) {
        this.anoLetivo = anoLetivo;
        this.serie = serie;
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.nota1Bim = 0;
        this.nota2Bim = 0;
        this.nota3Bim = 0;
        this.nota4Bim = 0;
    }

    public int getAnoLetivo() {
        return anoLetivo;
    }

    public int getSerie() {
        return serie;
    }

    public Q04aluno getAluno() {
        return aluno;
    }

    public Q04disciplina getDisciplina() {
        return disciplina;
    }

    public double getNota1Bim() {
        return nota1Bim;
    }

    public double getNota2Bim() {
        return nota2Bim;
    }

    public double getNota3Bim() {
        return nota3Bim;
    }

    public double getNota4Bim() {
        return nota4Bim;
    }

    public void alterarNota(int bimestre, double nota) {
        if (bimestre == 1) {
            nota1Bim = nota;
        } else if (bimestre == 2) {
            nota2Bim = nota;
        } else if (bimestre == 3) {
            nota3Bim = nota;
        } else if (bimestre == 4) {
            nota4Bim = nota;
        }
    }

    public double calcularMedia() {
        if (disciplina instanceof Q04disciplinaPratica) {
            return (nota1Bim + nota2Bim * 2 + nota3Bim + nota4Bim * 2) / 6;
        } else {
            return (nota1Bim + nota2Bim + nota3Bim + nota4Bim) / 4;
        }
    }
}