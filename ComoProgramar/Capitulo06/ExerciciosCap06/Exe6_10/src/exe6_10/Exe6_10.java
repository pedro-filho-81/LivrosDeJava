/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe6_10;

/**
 *    6.10 (Arredondando números) Para arredondar números em casas decimais específicas, utilize uma instrução como 
 * y = Math.floor(x * 10 + 0.5) / 10; 
 * que arredonda x para a casa decimal (isto é, a primeira posição à direita do ponto de fração decimal), ou
 * y = Math.floor(x * 100 + 0.5) / 100;
 * que arredonda x para a casa centesimal (isto é, a segunda posição à direita do ponto de fração decimal). 
 * Escreva um aplicativo que defina quatro métodos para arredondar um número x de várias maneiras:
 * a) roundToInteger(number)
 * b) roundToTenths(number)
 * c) roundToHundredths(number)
 * d) roundToThousandths(number)
 * Para cada leitura de valor, seu programa deve exibir o valor original, o número arredondado para o inteiro mais próximo, 
 * o número arredondado para o décimo mais próximo, o número arredondado para o centésimo mais próximo e o número 
 * arredondado para o milésimo mais próximo.
 * @author Pedro, 26/01/2022
 */

import java.util.Scanner;

public class Exe6_10 {

    public static void main(String[] args) {
        // TODO code application logic here

        // cria o objeto scammer
        Scanner imput = new Scanner(System.in);
        
        // entrada de dados
        System.out.print("Digite um número (-1 para sair): ");
        double numero = imput.nextDouble();
        
        // enquanto número diferente de -1
        while( numero != -1 ) {
        
            double resultado = arredondaParaInteiro(numero );
            double decimo = arredondaParaDecimal(numero);
            double centesimo  = arredondaParaCentesimo(numero);
            double milesimo  = arredondaParaMilesimo(numero);
        
            System.out.printf("%nO número digitado foi %f%nO número arredondado é %.0f%n",
                                            numero, resultado );

            System.out.printf("O número arredondado para decimo é %.2f%n",
                                            decimo );

            System.out.printf("O número arredondado para centésimo é %.3f%n",
                                            centesimo );

            System.out.printf("O número arredondado para milésimo é %.4f%n",
                                            milesimo );

            // entrada de dados
            System.out.print("Digite um número (-1 para sair): ");
            numero = imput.nextDouble();
        
        } // fim while
        
    }// fim main    
    
    static double arredondaParaInteiro( double num ) {
        
        double arredonda =  Math.floor( num + 0.5 );
        
        return arredonda;
    } // fim método
    
    
    static double arredondaParaDecimal( double num ) {
        
        double arredonda =  Math.floor( num * 10 + 0.5 ) / 10;
        
        return arredonda;
    } // fim método
    
    static double arredondaParaCentesimo( double num ) {
        
        double arredonda =  Math.floor( num * 100 + 0.5 ) / 100;
        
        return arredonda;
    } // fim método
    
    static double arredondaParaMilesimo( double num ) {
        
        double arredonda =  Math.floor( num * 1000 + 0.5 ) / 1000;
        
        return arredonda;
    } // fim método
} // fim classe