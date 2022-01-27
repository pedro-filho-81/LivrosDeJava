/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp7_01;

/**
 * inicializando um array ( vetor ) simples
 * @author samsung
 */
public class Exp7_01 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria um vetor para 10 elementos
        int[] vetor = new int[10]; 
        
        // cria o cabeçalho
        System.out.printf("%s%8s%n", "Índice", "Valor");
        
        // loop para atribuir valor ao vetor
        for( int i = 0; i < 10; i++ ) {
            System.out.printf("%3d%8d%n", i, vetor[ i ] );
        } // fim for
    } // fim main    
} // fim classe