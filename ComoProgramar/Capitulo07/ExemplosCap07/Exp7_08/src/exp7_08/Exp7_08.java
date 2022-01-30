/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp7_08;

/**
 *Embaralhando e distribuindo cartas
 * @author 30/01/2022
 */
public class Exp7_08 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        BaralhoDeCartas meuBaralhoDeCartas = new BaralhoDeCartas();
        meuBaralhoDeCartas.embaralha();
        
        // loop para imprimir todas as 52 cartas
        for( int i = 1; i <= 52; i++ ) {
            System.out.printf("%-19s", meuBaralhoDeCartas.cartoesDeOfertas() );
            
            if( i % 4 == 0 ) {
                System.out.println();
            } // fim if
        } // fim for            
    } // fim main    
} // fim classe