package classes;

public class NomeCarros {
    private String nome;

    public NomeCarros(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "" + nome + "";
    }

    
}
