/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicializandoarraylinhacomando;

import java.util.Scanner;

public class InicializandoArrayLinhaComando {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o objeto da classe Scanner
        Scanner entrada = new Scanner(System.in);
        
        if( args.length != 0 )
            System.out.println("Erro: por favor re-entre com o comando, incluindo:\n" +
                                            "o tamanho do array, o valor inicial, e o incremento.");
        else 
        {
            System.out.print("Tamanho do array: ");
            int tamanhoArray = entrada.nextInt(); // entrada do usuário
            int[] array =  new int[ tamanhoArray ]; // cria e define o aray  com o tamanho definido pelo usuário
            
            System.out.print("Valor inicial: ");
            int valorInicial = entrada.nextInt(); // usuário informa o valor inicial do array
            
            System.out.print("Valor do incremento: ");
            int incremento = entrada.nextInt(); // usuário informa o incremento do vetor
            
            // calcula o valor de cada elemento do array
            for( int contar = 0; contar < array.length; contar++ ) {
                array[ contar ] = valorInicial + incremento * contar; // vetor recebe os valores
            } // fim for
            
            // mostra cabeçalho da tabela
            System.out.printf("%s%8s%n", "Índice", "Valor" );
            
            // loop para mostrar o índice e os valoes do vetor
            for( int contar = 0; contar < array.length; contar++ )
                System.out.printf("%5d%8d%n", contar, array[ contar ] );            
        } // fim else
        
    }  // fim main  
} // fim classe