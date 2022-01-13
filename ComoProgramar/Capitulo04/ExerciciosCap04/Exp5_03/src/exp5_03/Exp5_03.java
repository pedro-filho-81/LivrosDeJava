/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp5_03;

/**
 * soma os valores de for
 * @author 13/01/2022
 */
public class Exp5_03 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // variável
        int soma = 0;
        
        // loop for conta os valores pares de 2 a 30
        for( int contador = 2; contador <= 20; contador += 2 ) {
            System.out.printf("%d ",  contador );
            
            soma += contador; 
        } // fim for contador
        
        System.out.printf("%nA soma é = %d%n", soma );
    } // fim main    
} // fim classe
