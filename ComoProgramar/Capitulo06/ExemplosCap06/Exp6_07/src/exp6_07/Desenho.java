package exp6_07;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Desenho extends JPanel{
    
    public void paintComponent(Graphics g) {

            super.paintComponent(g);

            // desenha o rosto
            g.setColor(Color.yellow);                
            //( COLUNA, LINHA, LARGURA, ALTURA )
            g.fillOval(10, 10, 200, 200);

            // cor dos olhos
            g.setColor(Color.black);
            // olho direito
            g.fillOval(55, 65, 30, 30);
            // olho esquerdo
            g.fillOval(135, 65, 30, 30);

            // desenha a boca
            g.fillOval(50, 110, 120, 60);

            //"retoca" a boca para criar sorriso
            g.setColor(Color.yellow);
            g.fillRect(50, 110, 120, 30);
            g.fillOval(50, 120, 120, 40);        
        } // fim método
} // fim classe desenha
