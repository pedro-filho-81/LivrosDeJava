package Exemplos1_2;
/*
 * Este programa imprime os comprimentos relativos das subdivisões em uma régua. 
 * A enésima linha de saída são os comprimentos relativos das marcas em uma régua 
 * subdivididas em intervalos de 1/2n de uma polegada. Por exemplo, a quarta linha 
 * de saída fornece os comprimentos relativos das marcas que indicam intervalos de 
 * um dezesseis avos de uma polegada em uma régua.
 * Sedgewick, Robert; Wayne, Kevin. Computer Science: An Interdisciplinary Approach 
 * (p. 20). Pearson Education. Edição do Kindle.
 */
public class Ruler { 
    public static void main(String[] args) 
    {
        // variáveis
        String ruler1 = " 1 ";
        String ruler2 = ruler1 + "2" + ruler1;
        String ruler3 = ruler2 + "3" + ruler2;
        String ruler4 = ruler3 + "4" + ruler3;
        String ruler5 = ruler4 + "5" + ruler4;

        // imprime resultado
        System.out.println(ruler1);
        System.out.println(ruler2);
        System.out.println(ruler3);
        System.out.println(ruler4);
        System.out.println(ruler5);
    } // fim main
} // fim class
