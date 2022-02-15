package desenhandoarcoiris;

import javax.swing.JFrame;

public class TestaDesenhandoArcoIris {

    public static void main(String[] args) {
        
        // cria o objeto para a classe desenhando arco iris
        DesenhandoArcoIris painel = new DesenhandoArcoIris();
        
        // cria o objero para JFrame
        JFrame aplicacao = new JFrame();
        
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacao.add(painel);
        aplicacao.setSize(500, 250);
        aplicacao.setVisible(true);
        
    } // fim main
} // fim classe
