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
        g.drawLine( 0, 0, largura, altura);
        g.drawLine( 0, 0, largura - 5, altura - 5);
        g.drawLine( 0, 0, largura - 10, altura - 10);

        // desenha uma linha a partir do canto inferior esquerdo até o canto superior direito
        g.drawLine(0, altura, largura, 0);

    } // fim paintComponent
} // fim class Desenhar
