/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_32;

/**
 *4.32 (Padrão de tabuleiro de damas de asteriscos) Escreva um aplicativo que utiliza apenas as instruções de saída
System.out.print("* "); 
System.out.print(" "); 
System.out.println();
para exibir o padrão de tabuleiro de damas a seguir. Uma chamada de método System.out.println sem argumentos 
* faz com que o programa gere saída de um único caractere de nova linha. [Dica: as instruções de repeti
 * @author Pedro, 11/01/2022
 */
public class Exercicio4_32 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // variáavel
        int contador = 0;
        
        while( contador < 10 ) {
            
            int contador2 = 0;
            
            // loop para montar o tabeleiro de damas
            while( contador2 < 10 ) {
            
                System.out.print("* "); // imprime asterisco
                
                contador2++; // incrementa em 1
            } // fim while
            
            System.out.println(); // pula linha
            
            if( contador % 2 == 0 ) {
                System.out.print("  ");
            } // fim if
            
            contador++; // incrementa o contador em 1
            
        } // fim while externo
    } // fim main    
} // fim classe
