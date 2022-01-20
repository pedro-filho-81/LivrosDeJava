/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe5_19;

/**
 * 5.19 Suponha que i = 1, j = 2, k = 3 e m = 2. O que cada uma das seguintes instruções imprime?
a) System.out.println(i == 1);
b) System.out.println(j == 3);
c) System.out.println((i >= 1) && (j < 4));
d) System.out.println((m <= 99) & (k < m));
e) System.out.println((j >= i) || (k == m));
f) System.out.println((k + m < j) | (3 - j >= k));
g) System.out.println(!(k > m));
 * @author 20/01/2022
 */
public class Exe5_19 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // variáveis
        int i = 1, j = 2, k = 3, m = 5;
        
        System.out.println("int i = 1, j = 2, k = 3, m = 5;");        
        System.out.printf("i == 1 %b%n", i == 1 );       
        System.out.printf("j == 3 %b%n", j == 3);
        System.out.printf("(i >= 1) && (j < 4) %b%n",  (i >= 1) && (j < 4));
        System.out.printf("(m <= 99) & (k < m) %b%n", (m <= 99) & (k < m));
        System.out.printf( "(j >= i) || (k == m) %b%n", (j >= i) || (k == m));
        System.out.printf( "(k + m < j) | (3 - j >= k) %b%n", (k + m < j) | (3 - j >= k));
        System.out.printf( "!(k > m) %b%n", !(k > m));                
                
    } // fim main    
} // fim classe
