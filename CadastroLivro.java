package Library;

import javax.swing.*;

public class CadastroLivro {

    public static void main(String[] args) {
        while (true) {

            String nomeDoLivro = JOptionPane.showInputDialog("Digite o título do livro:");
            String nomeDoAutor = JOptionPane.showInputDialog("Digite o nome do autor:");
            String anoDePubli = JOptionPane.showInputDialog("Digite o ano de publicação do livro:");
            String edit = JOptionPane.showInputDialog("Digite a editora do livro:");
            String codDoLivro = JOptionPane.showInputDialog("Digite o Isbn do livro:");

            Livros obecLivros = new Livros(nomeDoLivro, nomeDoAutor, anoDePubli, edit, codDoLivro);
            Acervo.adicionar(obecLivros);
            int escolha = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais livros? ");
            if (escolha == 1) {
                break;
            } else if (escolha == 2) {
                break;
            }
        }
        System.out.println(Acervo.listar());
        int buscar = JOptionPane.showConfirmDialog(null, "Buscar livros por autor? ");
        if (buscar == 0) {
            String nomeDoAutor2 = JOptionPane.showInputDialog("Nome do autor:");
            Acervo quant = new Acervo();
            System.out.println("Quantidade de livros encontrados em nome do autor " + nomeDoAutor2 + " = " + quant.buscar(nomeDoAutor2));
        }
    }
}

