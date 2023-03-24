package Library;

import javax.swing.*;

public class CadastroAutor {

    public static void main(String[] args) {
        while (true) {

            String nomeDoAut = JOptionPane.showInputDialog("Digite o nome do autor:");
            String paisDeOr = JOptionPane.showInputDialog("Digite o país de origem:");

            Autores obecAutor = new Autores(nomeDoAut, paisDeOr);
            AcervoAutor.adicionarAutor(obecAutor);
            int escolha2 = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais autores?");
            if (escolha2 == 1) {
                break;
            } else if (escolha2 == 2) {
                break;
            }
        }
        System.out.println(AcervoAutor.listar2());
        int buscar2 = JOptionPane.showConfirmDialog(null, "Buscar autor pelo país de origem?");
        if (buscar2 == 0) {
            String paisOrig = JOptionPane.showInputDialog("País de origem: ");
            AcervoAutor quant2 = new AcervoAutor();
            System.out.println("Quantidade de autores nascidos em " + paisOrig + " encontrados = " + quant2.buscar2(paisOrig));
        }
    }
}
