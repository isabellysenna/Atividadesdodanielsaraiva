package Livro;

public class Q05dependente {
    private Q05funcionario funcionario;
    private String nomeDependente;

    public Q05dependente(Q05funcionario f, String nome) {
        funcionario = f;
        nomeDependente = nome;
    }

    public Q05funcionario getFuncionario() { return funcionario; }
    public void setFuncionario(Q05funcionario f) { funcionario = f; }

    public String getNomeDependente() { return nomeDependente; }
    public void setNomeDependente(String n) { nomeDependente = n; }
}

