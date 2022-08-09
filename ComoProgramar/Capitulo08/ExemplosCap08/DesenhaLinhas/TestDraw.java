
// Figura 8.19: TestDraw.java
// Criando um JFrame para exibir um DrawPanel.
import javax.swing.JFrame;

public class TestDraw
{ 
    public static void main(String[] args)
    {
        DrawPanel panel = new DrawPanel(); 
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(300, 300);
        app.setVisible(true);

    } // final principal 
} // fim da classe TestDraw