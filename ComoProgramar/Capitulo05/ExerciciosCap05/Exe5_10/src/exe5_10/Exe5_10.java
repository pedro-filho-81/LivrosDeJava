/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe5_10;

/**
 * 
 * @author samsung
 */
public class Exe5_10 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        for( int i = 1; i <= 10; i++ ){ // conta até 10
            for( int j = 1; j <= 5; j++ ){ // conta até 5
                System.out.print('@');  // imprime 5 arrobas        
            } // fim for interno
            System.out.println(); // pula uma linha
        } // fim for externo
    } // fim main    
} // fim classe
