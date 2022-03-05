/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodedados2;

/**
 *  7.17 (Jogo de dados) Escreva um aplicativo para simular o lançamento de dois dados. 
 * O aplicativo deve utilizar um objeto de classe Random, uma vez para lançar o primeiro dado 
 * e novamente para lançar o segundo dado. A soma dos dois valores deve então ser calculada. 
 * Cada dado pode mostrar um valor inteiro de 1 a 6, portanto a soma dos valores irá variar de 
 * 2 a 12, com 7 sendo a soma mais frequente e 2 e 12, as somas menos frequentes. 
 * A Figura 7.28 mostra as 36 possíveis combinações de dois dados. Seu aplicativo deve lançar 
 * o dado 36.000.000 vezes. Utilize um array unidimensional para contar o número de vezes que 
 * cada possível soma aparece. Exiba os resultados em formato tabular.
 * @author Pedro, 05/03/2022
 */
import java.security.SecureRandom;

public class JogoDeDados2 {

    public static void main(String[] args) {
        // TODO code application logic here

        // cria o objeto SecureRandom
        SecureRandom numAleatorio = new SecureRandom();
        
        final int LINHA = 6000;
        final int COLUNA = 6000;
        
        // cria matriz
        int[][] matriz = new int[ LINHA ][ COLUNA ];        
        
        adicionarValor(matriz, LINHA, COLUNA);
        frequencia(matriz, LINHA, COLUNA);
        
    } // fim main
    
    public static void adicionarValor( int[][] matriz, int linha, int coluna ) {
        SecureRandom numAleatorio = new SecureRandom();
        for( int i = 0; i < linha; i++ ) {
            for( int j = 0; j < coluna; j++ ) {
                int dado1 = 1 + numAleatorio.nextInt(6);
                int dado2 = 1 + numAleatorio.nextInt(6);
                matriz[i][j] = dado1 + dado2;
            } // fim for coluna
        } // fim for
    } // fim adicionar valor
    
// método adicionar
    public static void frequencia( int[][] matriz, int linha, int coluna) {
        
        // cria vetor
        int[] frequencia = new int[13];
        
        for( int lin = 0; lin < linha; lin++ ) {
            for( int col = 0; col < coluna; col++ ) {
                ++frequencia[ matriz[lin][col] ];
            } // fim for aprimorado
        } // fim for linha
        System.out.printf("%s%12s%n", "Índice", "Frequência");
        for( int i = 0; i < frequencia.length; i++ ) {
            if( i >= 2 )
                System.out.printf("%3d%13d%n", i, frequencia[ i ]);
        } // fim for i
    } // fim adicionar
} // fim classe
