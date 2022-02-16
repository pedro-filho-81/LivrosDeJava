/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criaumamatriz;

import java.util.Scanner;

/**
 *  7.9 Considere um array de inteiros dois por três t.
a) Escreva uma instrução que declara e cria t.
b) Quantas linhas tem t?
c) Quantas colunas tem t?
d) Quantos elementos tem t?
e) Escreva expressões de acesso para todos os elementos na linha 1 de t.
f) Escreva expressões de acesso para todos os elementos na coluna 2 de t.
g) Escreva uma única instrução que configura o elemento de t na linha 0 e na coluna 1 como zero.
h) Escreva instruções individuais para inicializar cada elemento de t para zero.
i) Escreva uma instrução for aninhada que inicializa cada elemento de t como zero.
j) Escreva uma instrução for aninhada que insere os valores para os elementos de t a partir do usuário.
k) Escreva uma série de instruções que determina e exibe o valor menor em t.
l) Escreva uma única instrução printf que exibe os elementos da primeira linha de t.
m) Escreva uma instrução que soma os elementos da terceira coluna de t. Não utilize repetição.
n) Escreva uma série de instruções que exibe o conteúdo de t no formato tabular. Liste os índices de coluna como títulos na parte superior 
e liste os índices de linha à esquerda de cada linha
 * @author Pedro, 16/02/2022
 */
public class CriaUmaMatriz {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // 7.9 Considere um array de inteiros dois por três t.
        // a) Escreva uma instrução que declara e cria t.
        int[][] t = new int[2][3];        
        
        System.out.println("Declara e cria a matriz t ( 2 x 3 ):\nint[][] t = new int[2][3];");
        
        // b) Quantas linhas tem t?
        System.out.println("O array t tem 2 linhas.");
        
        // c) Quantas colunas tem t?
        System.out.println("O array t tem três colunas");
        
        // d) Quantos elementos tem t?
        System.out.println("O array t tem 6 elementos.");
        
        // e) Escreva expressões de acesso para todos os elementos na linha 1 de t.
        for(int coluna = 0; coluna < 3; coluna++ )
            System.out.printf("t[1][%d] = %d ", coluna, t[1][coluna]);
        System.out.println();
        
        // f) Escreva expressões de acesso para todos os elementos na coluna 2 de t.
        for( int linha = 0; linha < 2; linha++ )
            System.out.printf("t[%d][2] = %d ", linha, t[linha][2] );
        System.out.println();
        
        // g) Escreva uma única instrução que configur a o elemento de t na linha 0 e na coluna 1 como zero.
        t[0][1] = 0;
        
        // h) Escreva instruções individuais para inicializar cada elemento de t para zero.
        t[0][0] = 0;
        t[0][1] = 0;
        t[0][2] = 0;
        t[1][0] = 0;
        t[1][1] = 0;
        t[1][2] = 0;
        
        // i) Escreva uma instrução for aninhada que inicializa cada elemento de t como zero.
        for( int linha = 0; linha < 2; linha++)
            for( int coluna = 0; coluna < 3; coluna++ )
                t[linha][coluna] = 0;
        
        // j) Escreva uma instrução for aninhada que insere os valores para os elementos de t a partir do usuário.

        // cria o objeto scanner
        Scanner entrada = new Scanner(System.in);
        
        // loop para adicionar valor
        for( int linha = 0; linha < 2; linha++) {
            for( int coluna = 0; coluna < 3; coluna++ ) {
                
                // entrada de dados
                System.out.println("Digite um inteiro: ");
                int inteiro = entrada.nextInt(); // recebe valor do usuário
                t[linha][coluna] = inteiro; // atribui o valor a matriz t
                
            } // fim for coluna
        } // fim for linha
        
        // k) Escreva uma série de instruções que determina e exibe o valor menor em t.
        int menorValor = t[0][0]; // menor valor recebe o valor do primeiro elemento da matriz t
        
        for( int linha = 0; linha < 2; linha++ ) {
            for( int coluna = 0; coluna < 3; coluna++ ) {
                if( t[linha][coluna] < menorValor )
                    menorValor = t[linha][coluna];
            } // fim for coluna
        } // fim for linha
        
        // l) Escreva uma única instrução printf que exibe os elementos da primeira linha de t.
        System.out.println("\nA primeira linha do array t tem:");
        System.out.printf("t[0][0] = %d\nt[0][1] = %d\nt[0][2] = %d\n", t[0][0], t[0][1], t[0][2] );
        
        // m) Escreva uma instrução que soma os elementos da terceira coluna de t. Não utilize repetição.
        int soma = t[0][2] + t[1][2];
        System.out.printf("\nt[0][2] = %d\nt[1][2] = %d\n", t[0][2], t[1][2]);
        System.out.println("A soma dos elementos da terceira coluna de t é " + soma );
        
        /* n) Escreva uma série de instruções que exibe o conteúdo de t no formato tabular. 
            Liste os índices de coluna como títulos na parte superior 
            e liste os índices de linha à esquerda de cada linha */
        
    } // fim main    
} // fim classe
