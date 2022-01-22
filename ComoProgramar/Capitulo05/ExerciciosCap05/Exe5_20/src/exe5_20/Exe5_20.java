/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe5_20;

/**
 *5.20 (Calculando o valor de S) Calcule o valor de S a partir de uma série infinita
Imprima uma tabela que mostre o valor aproximado de S calculando os 200.000 
* primeiros termos dessa série. Quantos termos você tem de 
utilizar antes de primeiro obter um valor que começa com 3,14159?
 * @author Pedro, 20/01/2022
 */
public class Exe5_20 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // variáveis
        double pi = 0;
        int contar = 1;
        
        for( int i = 1; i <= 300000; i += 2) {
                
                if( contar == 1 ){
                    pi += 4 / (double) i; // aqui igua a 4 / 1
                } // fim if 1
                
                else if( contar >= 2 && contar % 2 != 0 ) {
                    pi += 4 / (double) i;                  
                } // fim else if
                
                else {
                    pi -= 4 / (double) i;
                } // fim else
                
                contar++;
                
                // mostra resultado
                System.out.printf("%11.6f ", pi);

                if( i % 11 == 0 )
                    System.out.println();
                
        } // fim for
    } // fim main    
} // fim classe
