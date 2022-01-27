/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp7_03;

/**
 * cria uma constante para ser o tamanho do vetor
 * @author 27/01/2022
 */
public class Exp7_03 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria a constante tamanho
        final int TAMANHO = 10;
        
        // cria o vetor
        int[] vetor = new int[ TAMANHO ];
        
        // LOOP PARA ATRIBUIR VALOR AO VETOR
        for( int i = 0; i < TAMANHO; i++ ) {
            vetor[ i ] = 2 + 2 *  i; 
        } // fim for
        
        System.out.printf("%s%8s%n", "Ìndice", "Valor");
        
        // loop para mostrar os valores do vetor
        for( int j = 0; j < TAMANHO; j++ ) {
            System.out.printf("%3d%8d%n", j, vetor[ j ] );
        } // fim for
    } // fim main    
} // fim classe
