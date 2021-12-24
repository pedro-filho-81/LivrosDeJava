/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_22;

/**
 *  4.22 (Saída no formato de tabela) Escreva um aplicativo Java que utiliza um loop para imprimir a seguinte tabela de valores
 * @author Pedro, 24/12/2021
 */
public class Exercicio4_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // cabeçaloho
        System.out.printf("%2s%10s%10s%10s%n", "N", "10*N", "100*N", "1000*N");
        
        // contador
        int contador = 1;
        
        // enquanto contador menor ou igual a 10
        while( contador <= 10) {
            
            // imprima os valore tabulados
            System.out.printf("%2d%9d%10d%10d%n", contador, contador * 10, contador * 100, contador * 1000);
            
            contador++; // pós-incrementa
            
        } // fim while
    } // fim main    
} // fim classe
