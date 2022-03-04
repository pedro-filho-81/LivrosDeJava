/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodedados;

/**
 *  7.17 (Jogo de dados) Escreva um aplicativo para simular o lançamento de dois dados. 
 * O aplicativo deve utilizar um objeto de classe Random, uma vez para lançar o primeiro dado 
 * e novamente para lançar o segundo dado. A soma dos dois valores deve então ser calculada. 
 * Cada dado pode mostrar um valor inteiro de 1 a 6, portanto a soma dos valores irá variar de 
 * 2 a 12, com 7 sendo a soma mais frequente e 2 e 12, as somas menos frequentes. 
 * A Figura 7.28 mostra as 36 possíveis combinações de dois dados. Seu aplicativo deve lançar 
 * o dado 36.000.000 vezes. Utilize um array unidimensional para contar o número de vezes que 
 * cada possível soma aparece. Exiba os resultados em formato tabular
 * @author Pedro, 03/03/2022
 */

import java.security.SecureRandom;

public class JogoDeDados {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o objeto SecureRandom
        SecureRandom numeroAleatorio = new SecureRandom();
        
        // cria as constantes
        final int LINHA = 6;
        final int COLUNA = 6;
        
        // declara e cria o vetor
        int[][] somaDosDados = new int[ LINHA ][ COLUNA ];
        
        adicionarValor(somaDosDados, LINHA, COLUNA);
        
        mostrarValor(somaDosDados, LINHA, COLUNA);
        
        somarColuna(somaDosDados, LINHA, COLUNA);
        
    } // fim main
    
    
    // cria mostrarValor
    public static void mostrarValor( int[][] somaDosDados, int linha, int coluna) {
        
        int somarLinha = 0;
        int somarColuna = 0;
        double mediaLinha = 0;
        
        // imprime espaços em branco
        System.out.print("    ");
        
        // loop paa cabeçalho das colunas
        for( int i = 0; i < coluna; i++ ) {
            // imprime os cabeçalhos das colunas
            System.out.printf("%4d", i + 1);
        } // fim for cabeçalho
        
        System.out.printf("%6s%9s", "Soma", "Média" );
        
        // pula uma linha
        System.out.println();
        System.out.println("       ************************************");
        // loop para a linha
        for( int lin = 0; lin < linha; lin++ ) {
            
            // impime o número das linhas
            System.out.printf("%d -> ", lin + 1);
            
            // loop para a coluna
            for( int col = 0; col < coluna;  col++ ) {
                // imprime o valor das colunas
                System.out.printf("%3d ", somaDosDados[lin ][col ]);
                // somar os valores da linha
                somarLinha += somaDosDados[lin][col];
                
            } // fim 0coluna
            
            // média
            mediaLinha = ( double) somarLinha / coluna;
            
            // imprime somarLinha e mediaLinha
            System.out.printf("%5d%9.2f", somarLinha, mediaLinha );
            somarLinha = 0;  // zera somarLinha
            
            // pula uma linha
            System.out.println();
        } // fim linha
        System.out.println("      **********************-=-=-=-=-=-=-=-");
    } // fim mostrar valor
    
    // cria método adicionar valor
    public static void adicionarValor( int [][] matriz, int linha, int coluna ) {
        
        // cria o objeto SecureRandom
        SecureRandom numeroAleatorio = new SecureRandom();
        // loop for linha
        for( int lin = 0; lin < linha; lin++ ) {
            // loop for coluna
            for( int col = 0; col < coluna; col++ ) {
                // dado recebe um valor aleatório
                int dado1 = 1 + numeroAleatorio.nextInt(6);
                // dado2 recebeum valor aleatório
                int dado2 = 1 + numeroAleatorio.nextInt(6);
                // matriz recebe a soma de dado1 e dado2
                matriz[lin][col] = dado1 + dado2;
            } // fim for coluna
        } // fim for linha         
    
    } // fim adicionar valor    
    
    // método somar coluna
    public static void somarColuna( int[][] matriz, int linha, int coluna ) {
        // variável
        int somar = 0;
        // imprime
        System.out.print("Soma");
        
        // loop para linha
        for( int lin = 0; lin < linha; lin++ ) {
            // loop para coluna
            for( int col = 0; col < linha; col++ ) {
                // soma os valores das colunas da matriz
                somar += matriz[col][lin];
            } // fim for coluna            
            // imprime o resultado da soma
            System.out.printf("%4d", somar );
            // zera a soma para um novo valor
            somar = 0;
        } // fim for linha
        // pula uma linha
        System.out.println(); // pula linha
    } // fim método somar coluna
} // fim classe
