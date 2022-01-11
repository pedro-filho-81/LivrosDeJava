/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_33;

/**
 *4.33 (Múltiplos de 2 com um loop infinito) Escreva um aplicativo que continue exibindo na 
 * janela de comando os múltiplos do inteiro 2 — a saber, 2, 4, 8, 16, 32, 64 e assim por diante. 
 * Seu loop não deve terminar (isto é, deve criar um loop infinito). O que acontece quando 
você executa esse programa?
 * @author samsung
 */
public class Exercicio4_33 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int contador = 1; // variável
        
        // enquanto contador diferente de zero faça
        while( contador != 0 ) {
        
            // mostra multiplos de 2
            System.out.printf( "%d * %d = %d %n", contador, 2, contador * 2);
            
            contador += 2; // contador recebe 2
        
        } // fim while
    } // fim main    
} // fim classe
