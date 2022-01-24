/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp6_07;

/**
 *Desenha um rosto soridente com cores e formas preenchidas
 * @author 24/01/2022
 */

import javax.swing.JFrame;

public class Exp6_07 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o objeto para a classe desenho
        Desenho panel = new Desenho();
        
        // cria o objeto JFrama
        JFrame aplicacao = new JFrame();
        
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacao.add( panel );
        aplicacao.setSize(300, 300);
        aplicacao.setVisible(true);
        
    } // fim main    
} // fim classe
