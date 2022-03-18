import java.util.Scanner;

public class GrandeCirculo33 {
    /**
     * 1.2.33 Grande círculo.
     * Escreva um programa GreatCircle que receba quatro argumentos 
     * duplos de linha de comando — x1, y1, x2 e y2 — (a latitude 
     * e longitude, em graus, de dois pontos na Terra) e imprima 
     * a distância do grande círculo entre eles. A distância do grande 
     * círculo (em milhas náuticas) é dada pela seguinte equação:
     * d = 60 arcos(sen(x1) sen(x2) + cos(x1) cos(x2) cos(y1 – y2))
     * Observe que esta equação usa graus, enquanto as funções trigonométricas 
     * de Java usam radianos. Use Math.toRadians() e Math.toDegrees() para 
     * converter entre os dois. Use seu programa para calcular a distância do 
     * grande círculo entre Paris (48,87° N e –2,33° W) e São Francisco 
     * (37,8° N e 122,4° W).
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 49). 
     * Pearson Educação. Edição do Kindle.
     * @autor Pedro 17/03/2022
     */
    public static void main(String[] args) {
        
        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Informe a coordenada x1: ");
        double x1 = input.nextDouble();
        System.out.print("Informe a coordenada y1: ");
        double y1 = input.nextDouble();
        System.out.print("Informe a coordenada x2: ");
        double x2 = input.nextDouble();
        System.out.print("Informe a coordenada y2: ");
        double y2 = input.nextDouble();
        
        // convertendo graus em radianos
        x1 = Math.toRadians(Math.toDegrees(x1));
        y1 = Math.toRadians(Math.toDegrees(y1));
        x2 = Math.toRadians(Math.toDegrees(x2));
        y2 = Math.toRadians(Math.toDegrees(y2));

    } // fim main
} // fim classe