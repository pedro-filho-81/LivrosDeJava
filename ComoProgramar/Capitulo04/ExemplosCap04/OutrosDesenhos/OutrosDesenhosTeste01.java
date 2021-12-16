import java.awt.Graphics;
import javax.swing.JPanel;

public class OutrosDesenhosTeste01 {
    public static void main(String[] args) {

        // cria um painel que conem nosso desenho
        OutrosDesenhos01 painel = new OutrosDesenhos01();

        // cria um novo quadro praa armazenar o paines
        JFrame aplicacao = new JFrame();

        // Configura o frame para ser enerrado quendo o frame for fechado
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        aplicacao.add(painel); // adiciona a aplicação
        aplicacao.setSize(200, 200); // configura o tamanho em máximo
        aplicacao.setVisible(true); // mantem a aplicação
    } // fim main
} // fim classe
