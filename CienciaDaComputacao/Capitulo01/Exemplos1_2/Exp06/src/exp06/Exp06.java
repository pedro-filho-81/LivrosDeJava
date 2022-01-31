/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp06;

/**
 *  Usando o for aprimorado para somar os valores de um array
 * @author 31/01/2022
 */
public class Exp06 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria e inicializa um array
        int[] vetor = { 12, 15, 35, 87, 98, 25, 69, 74, 49, 52, 39, 55 };
        int total = 0; // soma os valores do vetor
        
        // loop para  mostrar e somar os valores do vetor
        for( int contar : vetor ) {
            System.out.printf("%d ", contar ); // mostra elementos do vetor
            
            total += contar;
        } // fim for
        System.out.println("\nTotal do valores do vetor = " + total ); // pula linha
    } // fim main    
} // fim classe