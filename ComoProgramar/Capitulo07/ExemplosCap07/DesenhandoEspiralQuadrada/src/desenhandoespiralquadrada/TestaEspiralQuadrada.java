package desenhandoespiralquadrada;

import javax.swing.JFrame;

public class TestaEspiralQuadrada {

    public static void main(String[] args) {
        
        // cria o objeto desenhando espiral quadrada
        DesenhandoEspiralQuadrada painel = new DesenhandoEspiralQuadrada();
        
        // cria o objeto JFrama
        JFrame aplicacao = new JFrame();
        
        // cria a aplicação
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacao.add(painel);
        aplicacao.setSize(400, 400);
        aplicacao.setVisible(true);        
    } // fim main
} // fim classe