package Library;

public class Autores {

    private String nome;
    private String paisDeOrigem;

    public Autores(String nome, String paisDeOrigem) {
        this.nome = nome;
        this.paisDeOrigem = paisDeOrigem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }

    public void setPaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }

    @Override
    public String toString() {
        return "\nNome do autor: " + nome +
                "\nPaís de origem: " + paisDeOrigem;
    }
}
