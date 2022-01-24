package exp6_07_3;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.security.SecureRandom;

public class DesenhosDiferentes extends JPanel
{
    /**
     * 6.2 Crie um programa que desenhe 10 formas preenchidas aleatórias com cores aleatórias, 
     * posições e tamanhos (Figura  6.14). Method paintComponent deve conter um loop que itera 10 vezes. 
     * Em cada iteração, o loop deve determinar se deve ser desenhado um retângulo ou uma oval preenchida, 
     * criar uma cor aleatória e escolher as coordenadas e dimensões aleatoriamente. As coordenadas devem 
     * ser escolhidas com base na largura e altura do painel. O comprimento dos lados deve estar limitado 
     * à metade da largura ou altura 
     * @author Pedro, 24/01/2022 
     */
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        SecureRandom numAleatorio = new SecureRandom();
            
        for( int i = 1; i <= 10; i++ ) {
            
            //( COLUNA, LINHA, LARGURA, ALTURA )
            int coluna = numAleatorio.nextInt(400);
            int linha = numAleatorio.nextInt(400);
            int largura = numAleatorio.nextInt(200);
            int altura = numAleatorio.nextInt(200);
            int cor = 1 + numAleatorio.nextInt(6);
            
            switch( cor ) {
                
                case 1:
                    g.setColor(Color.yellow);
                    g.fillOval(coluna, linha, largura, altura);
                    break;
            
                case 2:
                    g.setColor(Color.BLUE);
                    g.fillRect(coluna, linha, largura, altura);
                    break;
                
                case 3:
                    g.setColor(Color.CYAN);
                    g.fillOval(coluna, linha, largura, altura);
                    break;
                
                case 4:
                    g.setColor(Color.GRAY);
                    g.fillRect(coluna, linha, largura, altura);
                    break;
                
                case 5:
                    g.setColor(Color.PINK);
                    g.fillOval(coluna, linha, largura, altura);
                    break;
                
                case 6:
                    g.setColor(Color.RED);
                    g.fillRect(coluna, linha, largura, altura);
                    break;
                    
            } // fim switch
        } // fim for
    } // fim método paint
} // fim classe Desenhos
