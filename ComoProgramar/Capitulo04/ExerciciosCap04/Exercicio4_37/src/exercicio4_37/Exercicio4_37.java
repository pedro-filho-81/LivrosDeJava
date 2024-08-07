/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_37;

/**
 *4.37 (Fatorial) O fatorial de um inteiro não negativo n é escrito como n! (pronuncia-se “n fatorial”) e é definido como segue:
                n! = n · (n – 1) · (n – 2) · ... · 1 (para valores de n maiores ou iguais a 1)
                e
                n! = 1 (para n = 0)
                Por exemplo, 5! = 5 · 4 · 3 · 2 · 1, o que dá 120.
 * @author Pedro, 13/01/2022
 */
import java.util.Scanner;

public class Exercicio4_37 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o objeto para Scanner
        Scanner entrada = new Scanner(System.in);
        
        // variável para while
        int num = 1;
        
        // enquanto num menor ou igual a 5 faça
        while( num <= 5 ) {
            
            // entrada de dados
            System.out.print("Digite um inteiro para ver seu fatorial: ");
            int contador = entrada.nextInt(); // entrada do usuário
            
            // se contador igual a zero 
            if( contador == 0 )
                contador = 1; // contador recebe 1
            
            int fat = 1; // para calcular o valor do fatorial
            
            // cabeçalho do fatorial
            System.out.printf("O Fatorial de %d! = ", contador );
            
            // enquanto contador diferente de 1 faça
            while( contador != 1) {
                
                // calcula o fatorial
                fat *= contador;
                
                // decrementa o contador
                contador--;
                
            } // fim while
            
            // imprime o valor do fatorial
            System.out.println( fat );
            
            num++; // incrementa em 1
            break;                    
        } // fim while externo   
        
        entrada.close();

    } // fim main    
} // fim classe
