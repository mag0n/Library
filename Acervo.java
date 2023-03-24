package Library;

import java.util.ArrayList;

public class Acervo {
    private static ArrayList<Livros> estante = new ArrayList<Livros>();

    public static ArrayList<Livros> getEstante() {
        return estante;
    }

    public static void adicionar(Livros L) {
        estante.add(L);
    }

    static public String listar() {
        String saida = "";
        int i = 1;
        for (Livros L : estante) {
            saida += "\n---------------LIVRO CADASTRADO" + (i++) + "---------------" + "\n";
            saida += L.toString();
        }
        return saida;
    }

    public int buscar(String autor) {
        int contador = 0;
        for (Livros L : estante) {
            if (L.getAutor().equalsIgnoreCase(autor)) {
                System.out.println("----------LIVRO ENCONTRADO----------" + "\n" + L.getTitulo());
                contador++;
            } else if (L.getAutor() != autor) {
                System.out.println("----------NENHUM LIVRO ENCONTRADO----------" + "\n");
            }
        }
        return contador;
    }
}
