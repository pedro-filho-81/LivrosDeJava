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
 * @author Pedro, 14/03/2022
 */

import java.util.Scanner;

public class Exercicio7_9 {

    public static void main(String[] args) {
        // TODO code application logic here

        // 7.9 Considere um array de inteiros dois por três t.
        System.out.println("Declara e cria uma matriz 2x3.");
        // a) Escreva uma instrução que declara e cria t.
        int[][] matrizT = { { 1, 2, 3 }, { 4, 5, 6 } };

        System.out.println("int[][] matrizT = new int[2][3];");
        // b) Quantas linhas tem t?
        System.out.println("A matrizT tem 2 linhas.");
        // c) Quantas colunas tem t?
        System.out.println("Tem 3 colunas.");

        // d) Quantos elementos tem t?
        System.out.println("Tem 6 elementos.");

        // e) Escreva expressões e acesso para todos os elementos na linha 1 de t.
        System.out.println("Elementos da linha 1:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%3d", matrizT[0][i]);
        } // fim for
        System.out.println();

        // f) Escreva expressões de acesso para todos os elementos na coluna 2 de t.
        System.out.println("Elementos da linha 2:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%3d", matrizT[1][i]);
        } // fim for
        System.out.println();

        // g) Escreva uma única instrução que configura o elemento de t na linha 0 e na
        // coluna 1 como zero.
        matrizT[0][1] = 0;

        // h) Escreva instruções individuais para inicializar cada elemento de t para
        // zero.
        matrizT[0][0] = 0;
        matrizT[0][1] = 0;
        matrizT[0][2] = 0;
        matrizT[1][0] = 0;
        matrizT[1][1] = 0;
        matrizT[1][2] = 0;

        // i) Escreva uma instrução for aninhada que inicializa cada elemento de t como
        // zero.
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++)
                matrizT[i][j] = 0;
        }

        // j) Escreva uma instrução for aninhada que insere os valores para os elementos
        // de t a partir do usuário.
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Informe um valor: ");
                int valor = entrada.nextInt();
                matrizT[i][j] = valor;
            }
        }

        // k) Escreva uma série de instruções que determina e exibe o valor menor em t.
        int menorValor = matrizT[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (menorValor > matrizT[i][j])
                    menorValor = matrizT[i][j];
            }
        }
        System.out.printf("O menor valor é %d%n", menorValor);

        // l) Escreva uma única instrução printf que exibe os elementos da primeira
        // linha de t.
        System.out.printf("Valores da primeira linha: %2d%2d%2d%n", matrizT[0][0], matrizT[0][1], matrizT[0][2]);

        // m) Escreva uma instrução que soma os elementos da terceira coluna de t. Não
        // utilize repetição.
        System.out.printf("A soma da terceira coluna é %2d%n", matrizT[0][2] + matrizT[1][2]);

        // n) Escreva uma série de instruções que exibe o conteúdo de t no formato
        // tabular.
        // liste os índices de linha à esquerda de cada linha.
        System.out.print("             "); // espaço em branco
        for (int titulo = 0; titulo < 3; titulo++) {
            System.out.printf("[%d]", titulo + 1);
        }

        System.out.println();

        for (int linha = 0; linha < 2; linha++) {
            // e liste os índices de coluna como títulos na parte superior
            System.out.printf("%dª linha -> ", linha + 1);
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.printf("%3d", matrizT[linha][coluna]);
            }
            System.out.println();
        }

    } // fim main
} // fim classe
