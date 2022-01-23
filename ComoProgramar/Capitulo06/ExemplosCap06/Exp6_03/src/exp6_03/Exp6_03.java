/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp6_03;

/**
 * Rolando dados 6000.000 vezes
 * @author 23/01/2022
 */

import java.security.SecureRandom;

public class Exp6_03 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o objeto para a classe SecureRandom
        SecureRandom numeroAleatorio = new SecureRandom();
        
        int frequencia1 = 0; // contagem para o lado 1
        int frequencia2 = 0; // contagem para o lado 2
        int frequencia3 = 0; // contagem para o lado 3
        int frequencia4 = 0; // contagem para o lado 4
        int frequencia5 = 0; // contagem para o lado 5
        int frequencia6 = 0; // contagem para o lado 6        
        
        // loop para contar 6000000 vezes
        for( int contar = 1; contar <= 6000000; contar++ ) {
            
            int face = 1 + numeroAleatorio.nextInt(6);
        
            switch( face ) { 
                
                case 1:
                    frequencia1++;
                    break;
                
                case 2:
                    frequencia2++;
                    break;
                    
                case 3:
                    frequencia3++;
                    break;
                
                case 4:
                    frequencia4++;
                    break;
                    
                case 5:
                    frequencia5++;
                    break;
                    
                case 6:
                    frequencia6++;
                    break;                    
            } // fim switch           
        } // fim for
        
        // imprime resultado
        System.out.println("Face\tFrequência");
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", frequencia1,
                                        frequencia2, frequencia3, frequencia4, frequencia5, frequencia6 );
        
    } // fim main    
} // fim classe
