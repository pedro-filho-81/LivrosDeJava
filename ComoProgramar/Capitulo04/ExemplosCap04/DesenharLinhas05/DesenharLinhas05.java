import java.awt.Graphics;
import javax.swing.JPanel;

// desenha um X a partir dos cantos da janela
public class DesenharLinhas05 extends JPanel {
    // desenha um
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // variáveis largura e altura
        int largura = getWidth(); // largura do quadro
        int altura = getHeight(); // altura do quadro

        // desenha uma linha a partir do canto superior esquerdo (0, 0) até o canto
        // inferior direito
        for (int i = 0; i < 2500; i += 80) {
            g.drawLine(0, 0, 400, i);
            g.drawLine(largura, 0, 400, i);

            // desenha uma linha a partir do canto inferior esquerdo até o canto superior
            // direito
            g.drawLine(0, altura, i, 400);
            //g.drawLine(0, i, largura, 0);
            g.drawLine(0, largura, i, 100);
        } // fim loop

    } // fim paintComponent
} // fim class Desenhar
