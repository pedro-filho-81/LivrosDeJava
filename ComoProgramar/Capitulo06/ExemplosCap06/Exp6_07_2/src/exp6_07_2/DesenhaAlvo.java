package exp6_07_2;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DesenhaAlvo extends JPanel 
{
    // cria método paint
    public void paintComponent( Graphics g )
    {
        super.paintComponent(g);
        
        // desenha um alvo
        g.setColor(Color.green);
         //( COLUNA, LINHA, LARGURA, ALTURA )
        g.fillOval(30, 30, 200, 200); // círculo maior
        g.setColor(Color.yellow);
        g.fillOval(55, 55, 150, 150);
        g.setColor(Color.GREEN);
        g.fillOval(80, 80, 100, 100);
        g.setColor(Color.yellow);
        g.fillOval(105, 105, 50, 50);
        g.setColor(Color.GREEN);
        g.fillOval(118, 118, 25, 25); // círculo menor
    } // fim método
} // fim classe