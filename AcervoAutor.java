package Library;

import java.util.ArrayList;

public class AcervoAutor {
    private static ArrayList<Autores> banca = new ArrayList<Autores>();

    public static ArrayList<Autores> getBanca() {
        return banca;
    }

    public static void adicionarAutor(Autores A) {
        banca.add(A);
    }

    static public String listar2() {
        String saida2 = "";
        int i2 = 1;
        for (Autores A : banca) {
            saida2 += "\n---------------AUTOR CADASTRADO" + (i2++) + "---------------" + "\n";
            saida2 += A.toString();
        }
        return saida2;
    }

    public int buscar2(String paisDeOrig) {
        int contador2 = 0;
        for (Autores A : banca) {
            if (A.getPaisDeOrigem().equalsIgnoreCase(paisDeOrig)) {
                System.out.println("---------------AUTOR ENCONTRADO---------------" + "\n" + A.getNome());
                contador2++;
            } else if (A.getPaisDeOrigem() != paisDeOrig) {
                System.out.println("---------------NENHUM AUTOR ENCONTRADO---------------" + "\n");
            }
        }
        return contador2;
    }
}
