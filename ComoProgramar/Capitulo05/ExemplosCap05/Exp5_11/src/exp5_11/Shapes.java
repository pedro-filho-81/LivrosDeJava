// Desenhando uma cascata de formas com base na escolha do usuário
package exp5_11; // informa que a classe pertence ao pacote exp5_11

// bibliotecas
import java.awt.Graphics;
import javax.swing.JPanel;

public class Shapes extends JPanel 
{
    private int choice; // escolha do usuário de qual forma quer desenhar
    
    // cria o construtor da classe
    public Shapes( int userChoice ) {
        choice = userChoice;
    } // fim construtor
    
    // desenha uma cascata de formas que iniciam no canto superior esquerdo
    public void paintComponent( Graphics g ) {
        
        super.paintComponent(g); 
        
        for( int i = 0; i < 40; i += 2 ) {
            
            // seleciona a forma com quer o desenho
            switch( choice ) {
                case 1: // desenha retângulos
                    g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10 );
                    break; // sai do for
                    
                case 2: // desenha oval
                    g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10 );
                    break; // sai do for
                    
                case 3:
                   g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10 );
                   g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10 );
                   break;
                    
                case 4:
                    // ( coluna, linha, largura, altura )
                    g.drawOval(220 - i * 5, 220 - i * 5, 20 + i * 10, 20 + i * 10);
                    break;
            } // fim switch
        } // fim for
    } // fim método paint
} // fim da classe
