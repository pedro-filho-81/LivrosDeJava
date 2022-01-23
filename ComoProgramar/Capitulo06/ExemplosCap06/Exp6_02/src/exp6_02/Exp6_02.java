/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp6_02;

/**
 * número aleatório
 * @author 23/01/2022
 */
import java.security.SecureRandom;

public class Exp6_02 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o objeto para SecureRandom
        SecureRandom numeroaleatorio = new SecureRandom();
        
        // loop para repetir 20 vezes
        for( int i = 1; i <= 20; i++ ) {
            
            // inteiro aleatótio entre 1 e 6
            int face = 1 + numeroaleatorio.nextInt(6);
            
            System.out.printf("%d ", face ); // imprime os números aleatórios
            
            if(i % 5 == 0 ) // se i multiplo de cinco
                // pule uma linha
                System.out.println();
            
        } // fim for
    } // fim main    
} // fim classe