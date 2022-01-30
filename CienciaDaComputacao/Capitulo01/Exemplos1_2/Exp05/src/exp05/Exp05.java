/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp05;

/**
 *Este programa testa se um número inteiro corresponde a um ano bissexto no calendário gregoriano. 
 * Um ano é bissexto se for divisível por 4 (2004), a menos que seja divisível por 100, caso em que não é (1900), 
 * a menos que seja divisível por 400, caso em que é (2000).
 * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 28). Pearson Educação. Edição do Kindle. 
 * 30/01/2022
 */

import java.util.Scanner;

public class Exp05 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o objeto para Scanner
        Scanner input = new Scanner(System.in);
        
        // entrada de dados
        System.out.print("Digite um ano para ver se é bissexto: ");
        int year = input.nextInt();
        
        boolean isLeapYear;

        // divisível por 4
        isLeapYear = (year % 4 == 0);

        // divisível por 4 e não divisível por cem
        isLeapYear = isLeapYear && (year % 100 != 0);

        // divisible by 4 and not 100 unless divisible by 400
        // divisível por 4, não divisível por 100, e divisível por 400
        isLeapYear = isLeapYear || (year % 400 == 0);

        // imprime o resultado
        System.out.printf("O ano de %d é um ano bissexto: %b%n", year, isLeapYear);  
    }    // fim main
} // fim classe