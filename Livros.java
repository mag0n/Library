package Library;

public class Livros {

    private String titulo;
    private String autor;
    private String anoDePublicacao;
    private String editora;
    private String isbn;


    public Livros(String titulo, String autor, String anoDePublicacao, String editora, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.editora = editora;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(String anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "\nTítulo: " + titulo +
                "\nAutor: " + autor +
                "\nAno de publicação: " + anoDePublicacao +
                "\nEditora: " + editora +
                "\nIsbn: " + isbn;
    }
}

