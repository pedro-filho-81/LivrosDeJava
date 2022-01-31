/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp2;

/**
 *A aritmética para números inteiros é construída em Java. 
 * A maior parte desse código é dedicada à tarefa de inserir e retirar os valores; 
 * a aritmética real está nas instruções simples no meio do programa que atribuem valores a p, q e r.
Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 23). Pearson Educação. Edição do Kindle.
 *30/01/2022
 */

import java.util.Scanner;

public class Exp2 {

    public static void main(String[] args) {
        // TODO code application logic here

        // cria o objeto da classe Scanner
        Scanner input = new Scanner(System.in);
        
        // cria variáveis
        System.out.print("Entre com um inteiro: ");
        int a = input.nextInt();
        System.out.print("Outro inteiro: ");
        int b = input.nextInt();
        int sum  = a + b; // soma
        int prod = a * b; // produto
        int quot = a / b; // dividão
        int rem  = a % b; // resto da divisão

        // mostra resultado
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b + " = " + prod);
        System.out.println(a + " / " + b + " = " + quot);
        System.out.println(a + " % " + b + " = " + rem);
        System.out.println(a + " = " + quot + " * " + b + " + " + rem);
    } // fim main    
} // fim classe