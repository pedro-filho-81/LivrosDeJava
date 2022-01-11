/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_31;

/**
 * 4.31 (Imprimindo o equivalente decimal de um número binário) Escreva um aplicativo que insere um número inteiro que 
 * contém somente 0s e 1s (isto é, um número inteiro binário) e imprime seu equivalente decimal. [Dica: utilize os operadores 
 * de resto e divisão para pegar os dígitos do número binário um de cada vez da direita para a esquerda. No sistema de números 
 * decimais, o dígito mais à direita tem um valor posicional de 1 e o próximo dígito à esquerda um valor posicional de 10, depois 100, 
 * depois 1.000 e assim por diante. O número decimal 234 pode ser interpretado como 4 * 1 + 3 * 10 + 2 * 100. No sistema de número 
 * binário, o dígito mais à direita tem um valor posicional de 1, o próximo dígito à esquerda um valor posicional de 2, depois 4, depois 
 * 8 e assim por diante. O equivalente decimal do binário 1.101 é 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8 ou 1 + 0 + 4 + 8 ou 13.]
 * @author Pedro, 11/01/2022
 */
import java.util.Scanner;

public class Exercicio4_31 {

    public static void main(String[] args) {
        // TODO code application logic here
        // cria o objeto para Scaner
        Scanner entrada = new Scanner(System.in);
         
        // variável
        int binario = 0;
        double n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
        
        // entrada de dados
        System.out.print("Digite um número binário: ");
        binario = entrada.nextInt();
        
        // calcular separando digitos 1 2 3 4 5 6 7 8 9
        n1 = binario / 1000000000 % 1000000000;
        n2 = binario % 1000000000 / 100000000;
        n3 = binario % 100000000 / 10000000;
        n4 = binario % 10000000 / 1000000;
        n5 = binario % 1000000 / 100000;
        n6 = binario % 100000 / 10000;
        n7 = binario % 10000 / 1000;
        n8 = binario % 1000 / 100;
        n9 = binario % 100 / 10;
        n10 = binario %10 / 1;
        
        // mostra digitos separados
        System.out.printf("%.0f %.0f %.0f %.0f %.0f %.0f %.0f %.0f %.0f %.0f %n", n1, n2, n3, n4, n5, n6, n7, n8, n9, n10);

        // calcular transformando binário em decimal
        if( n10 == 1)
            n10 = Math.pow( 2, 0); System.out.println(n10);
        if( n9 == 1 )
            n9 = Math.pow( 2, 1); System.out.println(n9);
        if( n8 == 1 )
            n8 = Math.pow( 2, 2); System.out.println(n8);
        if( n7 == 1)
            n7 = Math.pow( 2, 3); System.out.println(n7);
        if( n6 == 1 )
            n6 = Math.pow( 2, 4); System.out.println(n6);
        if( n5 == 1 )
            n5 = Math.pow( 2, 5); System.out.println(n5);
        if( n4 == 1 )
            n4 = Math.pow( 2, 6); System.out.println(n4);
        if( n3 == 1 )
            n3 = Math.pow( 2, 7); System.out.println(n3);
        if( n2 == 1 )
            n2 = Math.pow( 2, 8); System.out.println(n2);
        if( n1 == 1 )
             n1 = Math.pow( 2, 9); System.out.println(n1);
        
        // vrriável decimal
        double decimal = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
        
        // mostra o valo rdecimal
        System.out.printf("decimal = %.0f %n", decimal);
        
    } // fim main
} // fim classe
