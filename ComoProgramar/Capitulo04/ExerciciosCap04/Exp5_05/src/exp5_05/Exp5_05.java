/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp5_05;

/** 
 *  Repetição com do while
 * @author 13/01/2022
 */
public class Exp5_05 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // variável
        int contador = 1;
        
        // faça
        do {
            
            // imprime o valor do coantador
            System.out.printf("%d ", contador );
            contador++; // incrementa em 1
        } while( contador <= 10 ); // enquanto contador menor ou igual a dez
        System.out.println(); // pula linha
    } // fim main   
} // fim classe
