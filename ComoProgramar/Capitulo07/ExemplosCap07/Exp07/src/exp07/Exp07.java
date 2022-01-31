/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp07;

/**
 * Passando array e um elemento do array para um método e modificando seus valores
 * 31/01/2022
 */
public class Exp07 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // Array
        int[] vetor = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Mostra os elementos do vetor SEM alteração");
        
        // loop para mostrar os valores do array
        for( int mostrarValores : vetor) {
            System.out.printf("     %d", mostrarValores ); // mostra os valores do vetor
        } // fim for mostra valores
        
        // chama o método modificar valores ( passagem por referência
        modificarValores(vetor);
        System.out.printf("\nAntes do método modificarElemento( vetor[ 2 ] );\no elemento tem o valor " + vetor[ 2 ] );
        
        // chama o método midificar elemento
        modificarElemento( vetor[ 2 ] );
        
        System.out.printf("Depois do método modificarElemento( vetor[ 2 ] );\no elemento volta a ser %d%n", vetor[ 2 ] );
        
    } // fim main

    // cria o método modificar valores
    public static void modificarValores( int[] modificaValor ) {
        
        System.out.println("\nMostra os elementos do vetor COM alteração." );
        
        // loop para modificar os valores do vetor
        for( int i = 0; i < modificaValor.length; i++ ) {
            modificaValor[ i ] *= 2;
            System.out.printf("     %d", modificaValor[ i ] );
        } // fim for modificar
        System.out.println(); // pula linha
        
    } // fim método modificar valores
        
    // cria o método modificar valores
    public static void modificarElemento( int elemento ) {
        
        elemento *= 2; // modifica o valor do elemento
        
        // mostra o valor do elemento modificado
        System.out.printf("%nDENTRO do método modificarElemento( vetor[ 2 ] ); \no elemento passa para o valor %d%n", elemento );
    
    } // fim método modificar
    
} // fim classe
