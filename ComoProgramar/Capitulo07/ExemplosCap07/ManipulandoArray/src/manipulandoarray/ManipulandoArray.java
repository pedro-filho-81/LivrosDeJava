/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandoarray;

import java.util.Arrays;

/**
 * Métodos da classe Array e System.arraycopy
 * 03/02/2022
 */
public class ManipulandoArray {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria e inicializa um array
        double[] array = { 8.9, 5.6, 2.8, 9.1, 5.9, 4.7 };
        
        displayArrayDouble(array,"Array original: "); // mostra os elementos
        
        // organiza array em ordem crescente
        Arrays.sort(array);
        
        displayArrayDouble(array, "Array organizado: "); // mostra os elementos
        
        // cria o arraySete para 10 elementos
        int[] arraySete = new int[ 10 ];
        
        // preenche o arraySete de 10 elementos com o número 7
        Arrays.fill(arraySete, 7 );
        
        displayArrayInt( arraySete, "Arrays.fill(arraySete, 7 ); "); // mostra os elementos
        
        // cria um arrayOriginal
        int[] arrayOriginal = { 1, 2, 3, 4, 5, 6, };
        
        displayArrayInt(arrayOriginal, "arrayOriginal com os valores que serão\ncopiados para o arrayCopia: ");
        
        // cria o arrayCopia com o índice o tamanho do arrayOriginal
        int[] arrayCopia = new int[ arrayOriginal.length ]; 
        
        // usa o System.arraycopy para copiar o array original para o arrayCopia
        System.arraycopy(arrayOriginal, 0, arrayCopia, 0, arrayOriginal.length );
        
        displayArrayInt(arrayCopia, "arrayCopia com valores copiados do arrayOriginal: "); // mostra o array cópia
        
        System.out.println("\nCOMPARANDO ARRAYs");
        
        // verifica a igualdade de arrayOriginal e arrayCopia
        boolean b = Arrays.equals( arrayOriginal, arrayCopia );
        System.out.printf( "arrayOriginal %s arrayCopia%n", ( b ? "==" : "!=" ) );
        
        // verifica a igualdade de arrayOriginal e arrayCopia
        b = Arrays.equals( arrayOriginal, arraySete );
        System.out.printf( "arrayOriginal %s arraySete%n", ( b ? "==" : "!=" ) );       
 
        // pesquisando valor no array
        System.out.println("\nPESQUISANDO UM ELEMENTO NO ARRAY");
        
        // pesquisa se o número 5 é um elemento do arrayOriginal
        int localizacao = Arrays.binarySearch(arrayOriginal, 5 );
        
        if( localizacao >= 0 )
            System.out.printf("O valor 5 foi encontrado no arrayOriginal%n");
        else
            System.out.printf("O valor 5 NÃO foi encontrado no arrayOriginal%n");
        
        // pesquisa se o número 5 é um elemento do arrayOriginal
        localizacao = Arrays.binarySearch(arrayOriginal, 8745 );
        
        if( localizacao >= 0 )
            System.out.printf("O valor 8745 foi encontrado no arrayOriginal%n");
        else
            System.out.printf("O valor 8745 NÃO foi encontrado no arrayOriginal%n");
        
        
        
    } // fim main
    
    // cria método displayArray
    public static void displayArrayDouble( double[] array, String descricao ) {
   
        System.out.printf("%n%s", descricao );
        
        // loop para mostrar o array original
        for( double valor : array )
            System.out.printf("%.1f ", valor);
        System.out.println(); // pula linha
                
    } // fim display    
    
    // cria método displayArray
    public static void displayArrayInt( int[] array, String descricao ) {
   
        System.out.printf("%n%s", descricao );
        
        // loop para mostrar o array original
        for( int valor : array )
            System.out.printf("%d ", valor);
        System.out.println(); // pula linha
                
    } // fim display
} // fim classe