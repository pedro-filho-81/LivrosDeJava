import java.awt.Graphics;
import javax.swing.JFrame;

public class DesenharLInhasTeste05 {
    public static void main(String[] args) {
        
        // cria um painel que conem nosso desenho
        DesenharLinhas05 painel = new DesenharLinhas05();

        // cria um novo quadro praa armazenar o paines
        JFrame aplicacao = new JFrame();

        // Configura o frame para ser enerrado quendo o frame for fechado
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        aplicacao.add(painel); // adiciona a aplicação
        aplicacao.setSize(800, 810); // configura o tamanho em máximo
        aplicacao.setVisible(true); // mantem a aplicação
        
    } // fim main
} // fim clase