/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_20;

/**
 * 4.20 (Calculador de salários) Desenvolva um aplicativo Java que determina o salário bruto de cada um de três empregados. 
 * A empresa paga as horas normais pelas primeiras 40 horas trabalhadas por cada funcionário e 50% a mais por todas as horas 
 * trabalhadas além das 40 horas. Você recebe uma lista de empregados, o número de horas trabalhadas por eles na semana passada 
 * e o salário-hora de cada um. Seu programa deve aceitar a entrada dessas informações para cada empregado e, então, determinar 
 * e exibir o salário bruto do empregado. Utilize a classe Scanner para inserir os dados.
 * @author Pedro Filho, 23/12/2021
 */

import java.util.Scanner;

public class Exercicio4_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o objeto da classe Scanner
        Scanner entrada = new Scanner(System.in);
        
        // variável
        float salario = 0.0f;
        
        // entrada de dados
        System.out.print("Entre com as horas trabalhadas ( -1 para sair ): ");
        int horasTrabalhadas = entrada.nextInt(); // entrada do usuário
        
        //Enquanto horas trabalhadas diferente de -1 faça
        while( horasTrabalhadas != -1 ) {

            System.out.print("Entre com o valor das horas trabalhadas ( R$00,00 ): ");
            float valorDasHoras = entrada.nextFloat();

            if( horasTrabalhadas <= 40 ) {

                salario = horasTrabalhadas * valorDasHoras;            
            } // fim if
            else {
                float horasExtras = ( horasTrabalhadas - 40 ) * ( valorDasHoras * 50 / 100 );
                salario = horasExtras + ( horasTrabalhadas * valorDasHoras );
            } // fim else

            // imprime o salário
            System.out.printf("Salário R$ %.2f%n", salario );
        
            // entrada de dados
            System.out.print("\nEntre com as horas trabalhadas ( -1 para sair ): ");
            horasTrabalhadas = entrada.nextInt(); // entrada do usuário
            
            if( horasTrabalhadas == -1 )
                break; // sair do programa
        
        } // fim while
    } //  fim main
    
} // fim classe
