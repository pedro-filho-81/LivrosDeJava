/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7_9;

/**
 *  7.9 Considere um array de inteiros dois por três t.
 * a) Escreva uma instrução que declara e cria t.
 * b) Quantas linhas tem t?
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
e liste os índices de linha à esquerda de cada linha.
 * @author samsung
 */

import java.util.Scanner;

public class Exercicio7_9 {

    public static void main(String[] args) {
        // TODO code application logic here

        //7.9 Considere um array de inteiros dois por três t.
        System.out.println("Declara e cria uma matriz 2x3.");
        // a) Escreva uma instrução que declara e cria t.
        int[][] matrizT = { {1,2,3}, {4,5,6} };
        
        System.out.println("int[][] matrizT = new int[2][3];");
       //b) Quantas linhas tem t?
        System.out.println("A matrizT tem 2 linhas.");
        //c) Quantas colunas tem t?
        System.out.println("Tem 3 colunas.");
        
        //d) Quantos elementos tem t?
        System.out.println("Tem 6 elementos.");
        
        //e) Escreva expressões e acesso para todos os elementos na linha 1 de t.
        System.out.println("Elementos da linha 1:");
        for( int i = 0; i < 3; i++ ) {
            System.out.printf("%3d", matrizT[0][i]);
        } // fim for
        System.out.println();       
        
        //f) Escreva expressões de acesso para todos os elementos na coluna 2 de t.
        System.out.println("Elementos da linha 2:");
        for( int i = 0; i < 3; i++ ) {
            System.out.printf("%3d", matrizT[1][i]);
        } // fim for
        System.out.println();       
        
        //g) Escreva uma única instrução que configura o elemento de t na linha 0 e na coluna 1 como zero.
        matrizT[0][1] = 0;
        
        // h) Escreva instruções individuais para inicializar cada elemento de t para zero.
        matrizT[0][0] = 0;
        matrizT[0][1] = 0;
        matrizT[0][2] = 0;
        matrizT[1][0] = 0;
        matrizT[1][1] = 0;
        matrizT[1][2] = 0;
        
        //i) Escreva uma instrução for aninhada que inicializa cada elemento de t como zero.
        for(int i = 0; i < 2; i++ )
            for( int j = 0; j < 3; j++ )
                matrizT[i][j] = 0;
        
        //j) Escreva uma instrução for aninhada que insere os valores para os elementos de t a partir do usuário.
        Scanner entrada = new Scanner(System.in);
        for(int i = 0; i < 2; i++ ) {
            for( int j = 0; j < 3; j++ ) {
                int valor = entrada.nextInt();
                matrizT[i][j] = valor;
            }
        }
        
       // k) Escreva uma série de instruções que determina e exibe o valor menor em t.
        
       /*l) Escreva uma única instrução printf que exibe os elementos da primeira linha de t.
        m) Escreva uma instrução que soma os elementos da terceira coluna de t. Não utilize repetição.
        n) Escreva uma série de instruções que exibe o conteúdo de t no formato tabular. Liste os índices de coluna como títulos na parte superior 
        e liste os índices de linha à esquerda de cada linha.
*/
    } // fim main    
} // fim classe
