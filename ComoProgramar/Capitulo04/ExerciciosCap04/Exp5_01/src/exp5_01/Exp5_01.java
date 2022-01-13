/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp5_01;

/**
 *  Repetição controlada por contador com a instrução while
 * @author 13/01/2022
 */
public class Exp5_01 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // variável
        int contador = 1; // contador inicializa com 1
        
        while( contador <= 10 ) { // enquanto contador menor ou igual a 10 faça
            
            System.out.printf("%d ", contador ); // imprime o valor do contador
            
            contador++; // incrementa contador em 1
        } // fim while
        System.out.println(); // pula linha
        
    } // fim main    
} // fim classe
