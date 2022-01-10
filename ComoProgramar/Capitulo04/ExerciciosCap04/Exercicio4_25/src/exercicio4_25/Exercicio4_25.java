/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_25;

/**
 *
 * @author Pedro Fiho, 10/01/2022
 */
public class Exercicio4_25 {

    public static void main(String[] args) {
        // TODO code application logic here
        // variável
        int contador = 1;
        
        // enquanto conatador menor ou igual a 10 faça
        while( contador <= 10 ) { 
            // se contador for ímpar imprima **** se não imprima ++++++++
            System.out.println(contador % 2 == 1 ? "1****" : "2++++++++");
            
            // incrementa o contador
            contador++;
            
        } // fim while
    } // fim main
} // fim classe
