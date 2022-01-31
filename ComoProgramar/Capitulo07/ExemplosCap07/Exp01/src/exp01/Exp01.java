/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp01;

/**
 *Este programa imprime os comprimentos relativos das subdivisões em uma régua. 
 * A enésima linha de saída são os comprimentos relativos das marcas em uma régua subdividida 
 * em intervalos de 1/2n de polegada. Por exemplo, a quarta linha de saída fornece os comprimentos 
 * relativos das marcas que indicam intervalos de um décimo sexto de polegada em uma régua.
Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 20). Pearson Educação. Edição do Kindle.
 * 30/01/2022
 */
public class Exp01 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria variáveis
        String ruler1 = " 1 ";
        String ruler2 = ruler1 + "2" + ruler1;
        String ruler3 = ruler2 + "3" + ruler2;
        String ruler4 = ruler3 + "4" + ruler3;
        String ruler5 = ruler4 + "5" + ruler4;

        // mostra o resultado
        System.out.println(ruler1);
        System.out.println(ruler2);
        System.out.println(ruler3);
        System.out.println(ruler4);
        System.out.println(ruler5);
    } // fim main    
} // fim classe