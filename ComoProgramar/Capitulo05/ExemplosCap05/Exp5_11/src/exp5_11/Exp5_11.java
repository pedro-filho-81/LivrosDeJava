package args
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *  Obtendo a entrada do usuário e criando um JFrame para exibir a escolha
 * @author 15/01/2022
 */

// incluir bibliotecas
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exp5_11 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        String input = JOptionPane.showInputDialog("Entre com 1 para desenhar retângulos.\n" +
                                                                                       "\nEntre com 2 para desenhar ovais.\n");
        
        int choice = Integer.parseInt( input ); // converte a entrada em inteiro
        
        double teste =1000.00;
        System.out.printf("Testando = %,10.2f%n", teste);
        
        int opcao = 2;
        
        switch( opcao ) {
            case 1:
            case 2:
            case 3:
                System.out.printf("%nOpção = %d%n", opcao );
                break;
        } // fim switch
        
        // cria o objeto da classe Shapes
        Shapes panel = new Shapes( choice );
        
        // cria o nove JFrame
        JFrame aplicacao = new JFrame();
        
        aplicacao.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        aplicacao.add(panel);
        aplicacao.setSize(500, 500);
        aplicacao.setVisible(true);
        
    } // fim main    
} // fim classe
