import java.awt.Graphics;
import javax.swing.JPanel;

public class OutrosDesenhos01 extends JPanel {
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        int getLargura = getWidth(); // getLargura
        int getAltura = getHeight(); // getAltura

        // desenha uma linha a partir do canto superior esquerdo (0, 0) até o canto
        // inferior direito
        g.drawLine(0, 0, getLargura, getAltura);
        g.drawLine(0, 0, getLargura, getAltura);
        g.drawLine(0, 0, getLargura, getAltura);

        // desenha uma linha a partir do canto inferior esquerdo até o canto superior
        // direito
        g.drawLine(0, getAltura, getLargura, 0);
    } // fim paintComponent
} // fim classe
