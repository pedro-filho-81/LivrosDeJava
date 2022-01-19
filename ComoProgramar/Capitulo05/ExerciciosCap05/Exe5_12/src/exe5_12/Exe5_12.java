/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe5_12;

/**
 *5.12 (Calculando o produto de números inteiros ímpares) Escreva um aplicativo que calcula 
 * o produto dos números inteiros ímpares de 1 a 15.
 * @author Pedro, 19/01/2022
 */
public class Exe5_12 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // varaveis
        int i, produto = 1;
        
        // loop for
        for( i = 1; i <= 15; i += 2 ) {
            System.out.printf("%d ", i );
            
            produto *= i;
        } // fim for
        
        // imprime esultado
        System.out.printf("%nO produto dos números ímpares é %d%n", produto );
    } // fim main    
} // fim classe
