package Exercicios1_2;
/*
 * 1.2.33 Círculo máximo. 
 * Escreva um programa GreatCircle que receba quatro argumentos de linha 
 * de comando double — x1, y1, x2 e y2 — (a latitude e longitude, em 
 * graus, de dois pontos na Terra) e imprima a distância do círculo 
 * máximo entre eles. A distância do círculo máximo (em milhas náuticas) 
 * é dada pela seguinte equação: d = 60 arccos(sin(x1) sin(x2) + cos(x1) 
 * cos(x2) cos(y1 – y2)) Observe que esta equação usa graus, enquanto as 
 * funções trigonométricas do Java usam radianos. Use Math.toRadians() e 
 * Math.toDegrees() para converter entre os dois. Use seu programa para 
 * calcular a distância do círculo máximo entre Paris (48,87° N e –2,33° 
 * W) e São Francisco (37,8° N e 122,4° W). 
 * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação: Uma Abordagem 
 * Interdisciplinar (p. 49). Pearson Education. Edição do Kindle.
 */
public class CirculoMaximo33 {

   public static void main(String[] args) {
   
      // variáveis
      double x1 = -2.5, y1 = 0.4, x2 = 12.1, y2 = 7.3;
      double distancia = 0.0;

      distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
      
      System.out.printf("distancia = %.5f\n", distancia);
   }
}
