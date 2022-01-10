/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_23;

import java.util.Scanner;

/**
 *  4.23 (Encontre os dois números maiores) Utilizando uma abordagem semelhante àquela do Exercício 4.21, 
 * encontre os dois maiores valores entre os 10 valores inseridos. 
 * [Observação: você só pode inserir cada número uma vez.]
 * @author Pedro Filho,24/12/2021
 */
public class Exercicio4_23 {

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
        int segundoMaior = 0;
        
        // enquanto contador menor que 10 aça
        while( contador < 10 ) {
            
            // entrada de dados
            System.out.printf("Digite o %dº  número inteiro: ", contador + 1);
            int numero = entrada.nextInt(); // entrada do usuário
       
            // se o contador for igual a zero 
            if( contador == 0) {
                maior = numero; // maior recebe o númreo
                segundoMaior = numero; // segundoMaior recebe o númreo
            }  // fim if
            
            // verifica se o número digitado é o maior valor
            if( numero > maior  ) { // se verdade
                segundoMaior = maior; // segundo maior recebe o valor maior
                maior = numero; // maior recebe o número
            } // fim if
            
            // se maior igual a segundo maior
            if( maior == segundoMaior ){
                if(numero < maior ) { // e se o número menor que maior
                    segundoMaior = numero; // segundo maior recebe o número
                } // fim if
            } // fim if externo
            
            // se o número menor que maior
            if( numero < maior)
                // se o número maior que o segundo maior
                if( numero > segundoMaior) {
                    segundoMaior = numero; // segundo maior recebe o número
                } // fim if
            
            ++contador; // incrementa o contador
        } // fim while
        
        // imprime o resultado
        System.out.printf("O maior valor é %d%n", maior );
        System.out.printf("Segundo maior é %d%n", segundoMaior);
    }    // fim main
} // fim classe
