/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp6_07_3; 
    /**
     * 6.2 Crie um programa que desenhe 10 formas preenchidas aleatórias com cores aleatórias, 
     * posições e tamanhos (Figura  6.14). Method paintComponent deve conter um loop que itera 10 vezes. 
     * Em cada iteração, o loop deve determinar se deve ser desenhado um retângulo ou uma oval preenchida, 
     * criar uma cor aleatória e escolher as coordenadas e dimensões aleatoriamente. As coordenadas devem 
     * ser escolhidas com base na largura e altura do painel. O comprimento dos lados deve estar limitado 
     * à metade da largura ou altura 
     * @author Pedro, 24/01/2022 
     */

import javax.swing.JFrame;

public class Exp6_07_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o objeto da classe Desenho
       DesenhosDiferentes painel = new DesenhosDiferentes();
       
       // cria o objeto JFrame
        JFrame aplicacao = new JFrame();
        
        //aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacao.add(painel);
        aplicacao.setSize(500, 500);
        aplicacao.setVisible(true);
        
    } // fim main    
} // fim classe
