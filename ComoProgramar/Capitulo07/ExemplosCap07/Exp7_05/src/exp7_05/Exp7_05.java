/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp7_05;

/**
 * Cria inicializa, e mostra grafico de barras
 * @author 28/01/2022
 */
public class Exp7_05 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // vetor
        int[] vetor = { 0, 0, 9, 0, 0, 1, 4, 3, 2, 5 };
        
        // cabeçalho
        System.out.printf("%s%10s%n", "Valor", "Barras");
        
        // loop paara mostrar valor
        for( int i = 0; i < vetor.length; i++) {
            
            if( i == 10) {
                System.out.printf("%5d: ", 100 );
            } // fim if
            else {
                System.out.printf("%02d-%02d%5s", i * 10, i * 10 + 9, " " );
            } // fim else
            
            // loop para mostrar barra de asterisco
            for( int j = 0; j < vetor[ i ]; j++ ) {
                
                // imprime asterisco
                System.out.print("*" );
            } // fim for interno
            
            // pula linha
            System.out.println();
        } // fim for externo        
    } // fim main    
} // fim classe
