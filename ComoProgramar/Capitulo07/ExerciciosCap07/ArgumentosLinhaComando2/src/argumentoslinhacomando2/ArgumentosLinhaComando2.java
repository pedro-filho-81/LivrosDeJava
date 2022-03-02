
package argumentoslinhacomando2;

/**
 * 2º) 7.15 (Argumentos de linha de comando) Reescreva a Figura 7.2 para que o tamanho do array 
 * seja especificado pelo primeiro argumento de linha de comando. Se nenhum argumento de linha de 
 * comando for fornecido, utilize 10 como o tamanho padrão do array.
 * @author Pedro, 28/02/2022
 */

import java.util.Scanner;

public class ArgumentosLinhaComando2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria objeto Scanner
        Scanner entrada = new Scanner(System.in);

        // entrada de dados
        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = entrada.nextInt(); // tamanho recebe o valor do usuário
        
        // se tamanho igual a zero
        if( tamanho == 0 )
            tamanho = 10; // tamanho recebe 
        
        // cria vetor com o tamanho atribuido pelo usuário
        int[] vetor = new int[tamanho];
        
        // método mostrar valoro
        mostrarValor(vetor);
    
    } // fim main    
    
    // método mostrar valor
    public static void mostrarValor( int[] vetor ) {
        
        System.out.printf("%s%8s%n", "Indice", "Valor");
        
        for( int mostrar = 0; mostrar < vetor.length; mostrar++ ) {
            System.out.printf("%3d%8d%n", mostrar, vetor[mostrar]);
        } // fim for mostrar        
    
    } // fim método mostrar valor
    
} // fim classe
