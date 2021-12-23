/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_19;

/**
 *  4.19 (Calculador de comissão de vendas) Uma grande empresa paga seu pessoal de vendas com base em comissões. 
 *             O pessoal de vendas recebe R$ 200 por semana mais 9% de suas vendas brutas durante esse período. 
 *             Por exemplo, um vendedor que realiza um total de vendas 0jhtp.indb 114 07/07/2016 15:18:30 Capítulo 4 Instruções 
 *             de controle: parte 1; operadores de atribuição ++ e -- 115 de mercadorias de R$ 5.000 em uma semana recebe 
 *             R$ 200 mais 9% de R$ 5.000, um total de R$ 650. Foi-lhe fornecida uma lista dos itens vendidos por cada vendedor. 
 *             Os valores desses itens são como segue:
 *         Item Value 
                1 239.99 
                2 129.75 
                3 99.95 
                4 350.89
                Desenvolva um aplicativo Java que recebe entrada de itens vendidos por um vendedor durante a última semana 
                * e calcula e exibe os rendimentos do vendedor. Não existe nenhum limite para o número de itens que pode ser vendido
 * @author Pedro Filho, 23/12/2021 
 */

import java.util.Scanner;

public class Exercicio4_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o objeto para classe Scanner
        Scanner entrada = new Scanner(System.in);
        
        // constante
        float SALARIO = 200.00f; // salário
        float comissao = 0.0f; // calcula comissão
        float vendasBrutas = 0.0f;
        float pagamento = 0.0f;

        // entrada de dados
        System.out.print("Digite o valor das vendas ( -1 para sair ): ");
        vendasBrutas = entrada.nextFloat(); // usuário

        // enquento vendas brutas diferente de -1 faça
        while( vendasBrutas != -1 ) {

            // calcular comissão
            comissao = vendasBrutas *  9 / 100;
            pagamento = SALARIO + comissao;

            // imprime pagamento
            System.out.printf("Salário R$ %.2f%n", pagamento);
            
            // entrada de dados
            System.out.print("\nDigite o valor das vendas ( -1 para sair ): ");
            vendasBrutas = entrada.nextFloat(); // usuário
            
            if( vendasBrutas == -1 )
                break; // sair
        } // fim while
        
    } // fim main
    
} // fim classe
