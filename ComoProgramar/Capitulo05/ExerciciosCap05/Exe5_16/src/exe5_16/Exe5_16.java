/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe5_16;

/**
 *5.16 (Gráfico de barras do programa de impressão) Uma aplicação interessante dos computadores é exibir 
 * diagramas e gráficos de barras. Escreva um aplicativo que leia cinco números entre 1 e 30. Para cada número que 
 * é lido, seu programa deve exibir o mesmo número de asteriscos adjacentes. Por exemplo, se seu programa lê o número 
 * 7, ele deve exibir *******. Exiba as barras dos asteriscos depois de ler os cinco números.
 * @author Pedro, 19/01/2022
 */

import java.util.Scanner;

public class Exe5_16 {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        
        // variáveis
        int n1, n2, n3, n4, n5;
        int num;
        
        // entrada de dados
        System.out.println("digite 5 inteiros entre 1 e 30 inclusive: ");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        n3 = entrada.nextInt();
        n4 = entrada.nextInt();
        n5 = entrada.nextInt();
        
        System.out.println("\nGráficos de asterisco");
        
        // primeiro gráfico de asterisco
        System.out.printf("%d -> ", n1);
        for( int i = 1; i <= n1; i++ ) {
            System.out.print('*');
        } // fim for n1
        System.out.println();
        
        // segundo gráfico de asterisco
        System.out.printf("%d -> ", n2);
        for( int i = 1; i <= n2; i++ ) {
            System.out.print('*');
        } // fim for n1
        System.out.println();
        
        // terceiro gráfico de asterisco
        System.out.printf("%d -> ", n3);
        for( int i = 1; i <= n3; i++ ) {
            System.out.print('*');
        } // fim for n1
        System.out.println();
        
        // quarto gráfico de asterisco
        System.out.printf("%d -> ", n4);
        for( int i = 1; i <= n4; i++ ) {
            System.out.print('*');
        } // fim for n1
        System.out.println();
        
        // quinto gráfico de asterisco
        System.out.printf("%d -> ", n5);
        for( int i = 1; i <= n5; i++ ) {
            System.out.print('*');
        } // fim for n1
        System.out.println();       
        
    } // fim main    
} // fim classe
