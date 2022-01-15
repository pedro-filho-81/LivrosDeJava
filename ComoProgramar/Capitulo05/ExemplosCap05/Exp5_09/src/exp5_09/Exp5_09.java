/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp5_09;

/**
 *  Usando o comando continue para pular a contagem for quando o valor do contador for 5
 * @author 15/01/2022
 */
public class Exp5_09 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // variável contador
        int contador;
        
        // loop for 
        for( contador = 1; contador <= 10; contador++ ) {
            
            // se contador igual a 5
            if( contador == 5 ) {
                
                continue; // pula o valor 5 e continua até 10
            } // fim if
            
            // imprime os valores do contador
            System.out.printf("%d ", contador );
        } // fim for
        
        // imprime 
        System.out.printf("%nImprime os valores do contador menos o valor 5%n" );
    } // fim main    
} // fim classe
