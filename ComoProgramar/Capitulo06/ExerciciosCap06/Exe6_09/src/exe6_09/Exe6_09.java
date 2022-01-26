/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe6_09;

/**
 *6.9 (Arredondando números) Math.floor pode ser utilizado para arredondar valores ao número inteiro mais próximo — 
 * por exemplo, y = Math.floor(x + 0.5);
 * arredondará o número x para o inteiro mais próximo e atribuirá o resultado a y. Escreva um aplicativo 
 * que lê valores double e utiliza a instrução anterior para arredondar cada um dos números para o inteiro mais próximo. 
 * Para cada número processado, exiba ambos os números, o original e o arredondado.
 * @author Pedro, 26/01/2022
 */

import java.util.Scanner;

public class Exe6_09 {

    public static void main(String[] args) {
        // TODO code application logic here

        // cria o objeto scammer
        Scanner imput = new Scanner(System.in);
        
        // entrada de dados
        System.out.print("Digite um número (-1 para sair): ");
        double numero = imput.nextDouble();
        
        // enquanto número diferente de -1
        while( numero != -1 ) {
        
            double resultado = arredondar(numero );
        
            System.out.printf("%nO número digitado foi %.2f%nO número arredondado é %.2f%n",
                                            numero, resultado );

            // entrada de dados
            System.out.print("Digite um número (-1 para sair): ");
            numero = imput.nextDouble();
        
        } // fim while
        
    }// fim main    
    
    static double arredondar( double num ) {
        
        double arredonda =  Math.floor( num + .5 );
        
        return arredonda;
    } // fim método
} // fim classe