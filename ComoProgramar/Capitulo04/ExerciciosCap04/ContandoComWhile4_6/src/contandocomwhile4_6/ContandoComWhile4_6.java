/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contandocomwhile4_6;

/**
 *  4.6 Combine as instruções escritas no Exercício 4.5 em um aplicativo Java que calcula 
 * e imprime a soma dos inteiros de 1 a 10. Utilize a instrução while.  
 * @author Pedro Filho, 22/12/2021
 */

public class ContandoComWhile4_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // variáveis
        int contar = 1;
        int soma = 0;
        
        while( contar < 11 ) {
            // imprime
            System.out.print( contar + " " );
            soma += contar;
            contar++; // incremento
        } // fim while
        
        // resultado
        System.out.println("\nA soma é " + soma);
    } // fim main
    
} // fim classe
