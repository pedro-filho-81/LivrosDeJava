/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe5_11;

/**
 *  5.11 (Localize o menor valor) Escreva um aplicativo que localiza o menor de vários números inteiros. 
 * Suponha que o primeiro valor lido especifica o número de valores a serem inseridos pelo usuário
 * @author Pedro Filho, 19/01/2022
 */
import java.util.Scanner;

public class Exe5_11 {

    public static void main(String[] args) {
        // TODO code application logic here

        // objeto Scanner
        Scanner entrada = new Scanner(System.in);
        
        // variáveis
        int quantidade;
        int menor = 0;
        int num = 0;
        
        // entrada de dados
        System.out.print("Deseja cadastrar quantos inteiros? ");
        quantidade = entrada.nextInt();
        
        // loop for para cadastrar os inteiros
        for( int i = 1; i <= quantidade; i++ ) {
            
            // entrada dos números inteiros
            System.out.printf("%dº inteiro: ", i );
            num = entrada.nextInt();
            
            if( i == 1 ) // se i igual a 1
                menor = num; // maior recebe num
            
            if( num < menor )
                menor = num;
            
        } // fim for
        
        // imprime o resultado
        System.out.printf("O menor valor é %d%n ", menor );
    } // fim main    
} // fim classe
