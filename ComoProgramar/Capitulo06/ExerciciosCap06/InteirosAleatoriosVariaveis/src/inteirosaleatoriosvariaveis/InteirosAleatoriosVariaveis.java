/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inteirosaleatoriosvariaveis;

/**
 *  6.12 Escreva instruções que atribuem inteiros aleatórios à variável n nos seguintes intervalos:
 * a) 1 d n d 2.
 * b) 1 d n d 100.
 * c) 0 d n d 9.
 * d) 1000 d n d 1112.
 * e) –1 d n d 1.
 * f) –3 d n d 11.
 * @author Pedro, 23/02/2022
 */

import java.security.SecureRandom;

public class InteirosAleatoriosVariaveis {

    public static void main(String[] args) {
        // TODO code application logic here
      
        // intervalo da impressão
       System.out.println("a) n >= 1 && n <= 2.");
        inteirosAleatórios(1, 2);
        
       // intervalo da impressão
       System.out.println("b) n >= 1 && n <= 100");
        inteirosAleatórios(1, 101);
        
       // intervalo da impressão
       System.out.println("c) n >= 0 && n <= 9.");
        inteirosAleatórios(0, 10);
        
           // intervalo da impressão
       System.out.println("d) n >= 1000 && n <= 1112.");
        inteirosAleatórios(1000, 113);

        // intervalo da impressão
       System.out.println("e) n >= -1 && n <= 1.");
        inteirosAleatórios(-1, 3);
        
       // intervalo da impressão
       System.out.println("f) n >= -3 && n <= 11.");
        inteirosAleatórios(-3, 15);
        
    } // fim main    

    // método inteiro aleatório
    public static void inteirosAleatórios( int inicio, int fim ) 
    {        
        // cria o objeto secure random
        SecureRandom numeroAleatorio = new SecureRandom();
       
        // vetor
       System.out.printf("vetor = { ");
       
// loop para imprimir 10 valores
       for( int i = 0; i < 10; i++ ) {      

           // recebe os números aleatórios
           int aleatorio = inicio + numeroAleatorio.nextInt(fim);

           // imprime os numeros aleatórios
           System.out.printf("%d ", aleatorio );       

       } // fim for

       // imprime a fecha-chave e pula uma linha
       System.out.println(" };"); // pula linha
        
    } // fim método inteiros aleatórios

} // fim classe
