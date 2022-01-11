/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_34;

/**
 * 4.34 (O que há de errado com esse código?) O que há de errado com a seguinte instrução? 
 * Forneça a instrução correta para adicionar 1 à soma de x e y.
        System.out.println(++(x + y));
 * @author Pedro, 11/01/2022
 */

public class Exercicio4_34 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int x = 2;
        int y = 5;
        
        System.out.println( 1 + (x + y));        
        
    } // fim main    
} // fim classe
