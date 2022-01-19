/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe5_13;

/**
 *  5.13 (Fatoriais) Fatoriais costumam ser utilizados em problemas de probabilidade. 
 * O fatorial de um inteiro positivo n (escrito como n! e pronunciado como “fatorial de n”) 
 * é igual ao produto dos números inteiros positivos de 1 a n. Escreva um aplicativo que calcula os fatoriais 
    de 1 a 20. Utilize o tipo long. Exiba os resultados em formato tabular.
   Que dificuldade poderia impedir você de calcular o fatorial de 100?
 * @author Pedro, 19/01/2022
 */
public class Exe5_13 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // variável
        long fat = 1;
        System.out.printf("%s%20s%n", "Número", "Fatorial");
        for( long i = 1; i <= 20; i++ ){
            for( long j = 1; j <= i; j++ ){
                fat *= j;
            } // fim for interno
            System.out.printf("%5d%21d%n", i, fat );
            fat = 1;
        } // fim for externo
    } // fim main   
} // fim classe
