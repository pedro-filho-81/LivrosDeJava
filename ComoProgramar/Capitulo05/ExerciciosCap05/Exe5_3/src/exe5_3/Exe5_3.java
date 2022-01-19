/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe5_3;

/**
 *5.3 Escreva uma instrução Java ou um conjunto de instruções Java para realizar cada uma das seguintes tarefas:
a) Some os inteiros ímpares entre 1 e 99 utilizando uma instrução for. Assuma que as variáveis de inteiro sum e count foram declaradas.
b) Calcule o valor de 2.5 elevado à potência de 3, utilizando o método pow.
c) Imprima os inteiros de 1 a 20, utilizando um loop while e a variável contadora i. Assuma que a variável i foi declarada, mas não foi 
inicializada. Imprima apenas cinco inteiros por linha. [Dica: utilize o cálculo i % 5. Quando o valor dessa expressão for 0, imprima 
um caractere de nova linha; caso contrário, imprima um caractere de tabulação. Assuma que esse código é um aplicativo. Utilize o 
método System.out.println () para imprimir o caractere de nova linha, e utilize o método System.out.print ('\t') para 
imprimir o caractere de tabulação.]
d) Repita a parte (c) utilizando uma instrução for.
 * @author Pedro Filho,18/01/2022
 */
public class Exe5_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // a) Some os inteiros ímpares entre 1 e 99 utilizando uma instrução for.
        //Assuma que as variáveis de inteiro sum e count foram declaradas.
        int soma = 0;
        int contar ;
        
        System.out.println("\nA) Some os inteiros ímpares entre 1 e 99 utilizando uma instrução for.\n"); // cabeçalho
        
        // loop for para contar ate 99
        for( contar = 1; contar <= 99; contar++ ) {                        
            // se contar porcento 2 diferente de zero (for ímpar)
            if( contar % 2 != 0 ) {
                
                if( contar == 55 ) // se contar igual a 55
                    System.out.println(); // pule uma linha
                
                System.out.printf("%d ", contar ); // imprima
                soma += contar; // soma contar                
            } // fim if
        } // fom for        
        //imprime resultado
        System.out.printf("%nSoma = %d%n", soma );
                
        // b) Calcule o valor de 2.5 elevado à potência de 3, utilizando o método pow.
        
        System.out.println("\nB) Calcule o valor de 2.5 elevado à potência de 3, utilizando o método pow."); // cabeçalho
        
        System.out.printf("%n2,5 elevado a potência de 3 é %.2f%n%n", Math.pow(2.5, 3 ) );
        
        /*
            c) Imprima os inteiros de 1 a 20, utilizando um loop while e a variável contadora i. Assuma que a variável i foi declarada, mas não foi 
                inicializada. Imprima apenas cinco inteiros por linha. [Dica: utilize o cálculo i % 5. Quando o valor dessa expressão for 0, imprima 
                um caractere de nova linha; caso contrário, imprima um caractere de tabulação. Assuma que esse código é um aplicativo. Utilize o 
                método System.out.println () para imprimir o caractere de nova linha, e utilize o método System.out.print ('\t') para 
                imprimir o caractere de tabulação.]
        */
        
        System.out.println("\nC) Imprima os inteiros de 1 a 20, utilizando um loop while e a variável contadora i."); // cabeçalho
        
        int i;
        i = 1; // atribui 1 a i;
        while( i <= 20 ) {
            // imprime
            System.out.printf("%d", i );
            // se i multiplo de cinco
            if( i % 5 == 0 ) {
                System.out.println(); // pula linha
            } // fim if
            else {
                System.out.print("\t");
            }
            i++; // incrementa i em 1            
        } // fim while
        
        //d) Repita a parte (c) utilizando uma instrução for.
        
        System.out.println("\nD) Repita a parte (c) utilizando uma instrução for."); // cabeçalho
        
        // loop for
        for( i = 1; i <= 20; i++ ) {
            System.out.printf("%d", i );
            // se i multiplo de cinco
            if( i % 5 == 0 ) {
                System.out.println(); // pula linha
            } // fim if
            else {
                System.out.print("\t");
            } // fim else
        } // fim for
        
    } // fim main    
} // fim classe
