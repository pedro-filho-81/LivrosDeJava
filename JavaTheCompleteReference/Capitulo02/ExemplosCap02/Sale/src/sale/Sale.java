/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sale;

/**
 *  7.13 Rotule os elementos do array bidimensional três por cinco sales para indicar 
 * a ordem em que eles são configurados como zero pelo seguinte segmento de programa:
for (int row = 0; row < sales.length; row++) 
{ 
 for (int col = 0; col < sales[row].length; col++) 
 { 
 sales[row][col] = 0; 
 } 
}
 * @author Pedro, 23/02/2022
 */
public class Sale {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] sales = new int[ 3 ][ 5 ]; // declara um vetor
        
        // loop para a linha
        for (int row = 0; row < 3; row++) 
        { 
            // loop para coluna
             for (int col = 0; col < 5; col++) 
             { 
                 // adiciona o valor zero
                 sales[row][col] = 0;
                 
            } // fim for col
        } // fim for linha

        mostraValores(sales);
        
        System.out.println(); // pula linha
        
    } // fim main

    // mostra valores
    public static void mostraValores( int[][] matriz ) {
        
        System.out.print("vetor = { ");
        for( int linha = 0; linha < 3; linha++ ) {

            for( int coluna = 0; coluna < 5; coluna++ ) {

                System.out.printf("%d ", matriz [linha][coluna]);
            } // fim for coluna

        } // fim for linha 
        
        System.out.println(" };");

    } // fim método mostra valor

} // fim classe sale
