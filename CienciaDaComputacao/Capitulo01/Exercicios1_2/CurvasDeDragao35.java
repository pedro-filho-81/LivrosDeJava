package Exercicios1_2;
/*
 * 1.2.35 Curvas de dragão.
 *  um programa para imprimir as instruções para desenhar as curvas de 
 * dragão de ordem 0 a 5. As instruções são sequências de caracteres F, L 
 * e R, onde F significa "desenhar linha enquanto se move 1 unidade para 
 * frente", L significa "virar à esquerda" e R significa "virar à 
 * direita". Uma curva de dragão de ordem n é formada quando você dobra 
 * uma tira de papel ao meio n vezes e depois desdobra em ângulos retos. 
 * A chave para resolver esse problema é notar que uma curva de ordem n é 
 * uma curva de ordem n–1 seguida por um L seguido por uma curva de ordem 
 * n–1 atravessada em ordem reversa e, então, descobrir uma descrição 
 * semelhante para a curva reversa.
 * Sedgewick, Robert; Wayne, Kevin. Computer Science: An 
 * Interdisciplinary Approach (p. 49). Pearson Education. 
 * Edição do Kindle.
 */
public class CurvasDeDragao35 {
   public static void main(String[] args) {
      
      // variáveis
      String dragon0 = "F";
      String nogard0 = "F";
      String dragon1 = dragon0 + "L" + nogard0;
      String nogard1 = dragon0 + "R" + nogard0;
      String dragon2 = dragon1 + "L" + nogard1;
      String nogard2 = dragon1 + "R" + nogard1;
      String dragon3 = dragon2 + "L" + nogard2;
      String nogard3 = dragon2 + "R" + nogard2;
      String dragon4 = dragon3 + "L" + nogard3;
      String nogard4 = dragon3 + "R" + nogard3;
      String dragon5 = dragon4 + "L" + nogard4;
      String nogard5 = dragon4 + "R" + nogard4;
      String dragon6 = dragon5 + "L" + nogard5;
      String nogard6 = dragon5 + "R" + nogard5;

      // exibe resultado
      System.out.println(dragon0);
      System.out.println(dragon1);
      System.out.println(dragon2);
      System.out.println(dragon3);
      System.out.println(dragon4);
      System.out.println(dragon5);
      System.out.println(dragon6);
   } // end main
} // end clas+