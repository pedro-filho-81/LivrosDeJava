
// Figura 8.18: DrawPanel.java
// Programa que utiliza a classe MyLine
// para desenhar linhas aleatórias.
import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;

public class DrawPanel extends JPanel
{
    private SecureRandom randomNumbers = new SecureRandom(); 
    private MyLine[] lines; // array de linhas

    // construtor, cria um painel com formas aleatórias
    public DrawPanel()
    {
        setBackground(Color.WHITE);
 
        lines = new MyLine[5 + randomNumbers.nextInt(5)];

        // cria linhas
        for (int count = 0; count < lines.length; count++)
        {
            // gera coordenadas aleatórias
            int x1 = randomNumbers.nextInt(300);
            int y1 = randomNumbers.nextInt(300);
            int x2 = randomNumbers.nextInt(300);
            int y2 = randomNumbers.nextInt(300);
            
            // gera uma cor aleatória
            Color color = new Color(randomNumbers.nextInt(256), 
            randomNumbers.nextInt(256), randomNumbers.nextInt(256));
            
            // adiciona a linha à lista de linhas a ser exibida
            lines[count] = new MyLine(x1, y1, x2, y2, color);
        } // final for 
    } // final drawPanel 

    // para cada array de forma, desenha as formas individuais
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        // desenha as linhas
        for (MyLine line : lines)
            line.draw(g);
    } // final paintCoponent

} // fim da classe DrawPanel