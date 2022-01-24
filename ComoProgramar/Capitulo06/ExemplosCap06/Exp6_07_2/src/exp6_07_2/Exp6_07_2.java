/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp6_07_2;

import javax.swing.JFrame;

/**
 *
 * @author samsung
 */
public class Exp6_07_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o objeto para a classe desenho
        DesenhaAlvo panel = new DesenhaAlvo();
        
        // cria o objeto JFrama
        JFrame aplicacao = new JFrame();
        
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacao.add( panel );
        aplicacao.setSize(300, 300);
        aplicacao.setVisible(true);

    }
    
}
