/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_21;

/**
 *4.21 (Localize o maior número) O processo de localizar o maior valor é muito utilizado em aplicativos de computador. 
 * Por exemplo, um programa que determina o vencedor de uma competição de vendas inseriria o número de unidades vendidas 
 * por cada vendedor. O vendedor que vende mais unidades ganha a competição. Escreva um programa em pseudocódigo e, então, 
 * um aplicativo Java que aceita como entrada uma série de 10 inteiros e determina e imprime o maior dos inteiros. Seu programa 
 * deve utilizar pelo menos as três variáveis a seguir:
 * a) counter: um contador para contar até 10 (isto é, monitorar quantos números foram inseridos e determinar quando todos os 10 números foram processados).
    b) number: o inteiro mais recentemente inserido pelo usuário.
    c) largest: o maior número encontrado até agora
 * @author samsung
 */
 import java.util.Scanner;

public class Exercicio4_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // objeto scanner
        Scanner entrada = new Scanner(System.in);
        
        // variáveis
        int contador = 0; // para while
        int maior = 0; // para o maior valor
        
        // enquanto contador menor que 10 faça
        while( contador < 10 ) {
            
            // entrada de dados
            System.out.print("Digite um número inteiro: ");
            int numero = entrada.nextInt(); // entrada do usuário
            
            // verifica se o número digitado é o maior vaçpr
            if( numero > maior ) // se verdade
                maior = numero; // maior recebe o número
            
            ++contador; // incrementa o contador
        } // fim while
        
        // imprime o resultado
        System.out.printf("O maior valor é %d%n", maior );
        
    } // fim main
    
} // fim classe
