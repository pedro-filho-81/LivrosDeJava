package desenhandoarcoiris;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DesenhandoArcoIris extends JPanel {
    
    // definindo as constantes, cores INDIGO E VIOLETA
    private final static Color VIOLETA = new Color(128, 0, 128);
    private final static Color INDIGO  = new Color( 75, 0, 130);
    
    // cria e inicializa o array coresDoArcoIris
    private Color[] coresDoArcoIris = { Color.WHITE, Color.WHITE, VIOLETA, INDIGO, Color.BLUE,
                                                                Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED };
    
    // cria o construtor
    public DesenhandoArcoIris() {
        setBackground(Color.WHITE); // configura a cor do fundo da tela
    } // fim construtor
    
    // desenha o arco-iris perto da parte central inferior
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        int raioDoArco = 20;
        
        // desenha o arco perto da parte central inferior
        int centerX = getWidth() / 2;
        int centerY = getHeight() - 10;
        
        // desenha arcos preenchidos com o mais externo
        for( int contar = coresDoArcoIris.length; contar > 0; contar-- ) {
            // configura a cor para o arco atual
            g.setColor(coresDoArcoIris[ contar - 1 ] );
            
            // preenche o arco de 0 a 180 graus
            g.fillArc(centerX - contar * raioDoArco, 
                    centerY - contar * raioDoArco, 
                    contar * raioDoArco * 2, 
                    contar * raioDoArco * 2, 0, 180);
            
        } // fim for
    } // fim paintComponent    
    
} // fim classe 
