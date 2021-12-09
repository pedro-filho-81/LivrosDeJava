public class QualSeuNome02 {
    public static void main(String[] args) {

        /**
         * O programa utiliza uma caixa de diálogo JOptionPane predefinida 
         * chamada ( caixa de diálogo de entrada ) que permite ao 
         * usuário inserir dados em um programa.
         * A linha 15 usa o método showInputDialog de JOptionPane para exibir 
         * uma caixa de diálogo de entrada que contém um prompt e um campo 
         * (conhecido como campo de texto) no qual o usuário pode inserir o texto.
         * O método showInputDialog retorna uma String contendo os caracteres 
         * digitados pelo usuário e atribui a variável String nome.
         */
        // entre com seu nome ( prompt )
        String nome = javax.swing.JOptionPane.showInputDialog(null, "Qual é o seu nome? ");

        /**
         * A linha 24 utiliza o método static String format para 
         * retornar uma String que contém uma saudação com o nome do usuário. 
         * O método format funciona como System.out.printf, exceto que format 
         * retorna a String formatada em vez de exibi-la em uma janela de comando
         * e atribui essa String a variável String mensagem.
         */
        // cria mensagem de boas vindas para nome
        String mensagem = String.format("Bem vindo, %s a programação java!", nome);

        /**
         * Tipicamente, as caixas de diálogo são janelas nas quais 
         * os programas mostram mensagens importantes aos usuários. 
         * A classe JOptionPane fornece caixas de diálogo pré-construídas 
         * que permitem aos programas exibir janelas que contêm mensagens 
         * — essas janelas são chamadas de diálogos de mensagem.        
         * o programa utiliza a classe JOptionPane do pacote javax.swing. 
         * Esse pacote contém muitas classes que ajudam a criar 
         * GUIs para aplicativos.
         * A linha 42 chama o método JOptionPane showMessageDialog para 
         * exibir uma caixa de diálogo que contém uma mensagem
         * javax.swing.JOptionPane.showMessageDialog(null, mensagem);
         * mostra a mensagem de boas vindas ao nome digitado.
         */
        // mostra a mensagem de boas vindas
        javax.swing.JOptionPane.showMessageDialog(null, mensagem);
    } // fim main
} // fim classe
