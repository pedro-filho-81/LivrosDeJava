/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_17;

/**
 *  4.17 (Quilometragem de combustível) Os motoristas se preocupam com a quilometragem obtida por seus automóveis. 
 * Um motorista monitorou várias viagens registrando a quilometragem dirigida e a quantidade de combustível em litros utilizados 
 * para cada tanque cheio. Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os litros de gasolina 
 * consumidos (ambos como inteiros) para cada viagem. O programa deve calcular e exibir o consumo em quilômetros/litro para 
 * cada viagem e imprimir a quilometragem total e a soma total de litros de combustível consumidos até esse ponto para todas as viagens. 
 * Todos os cálculos de média devem produzir resultados de ponto flutuante. Utilize classe Scanner e repetição controlada por sentinela 
 * para obter os dados do usuário. 
 * @author Pedro Filho, 22/12/2021
 */

import java.util.Scanner;

public class Exercicio4_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // objeto Scanner para entrada dos dados
        Scanner entrada = new Scanner(System.in);
    
        // variável
        int kmDirigidos = 0; // quilometros dirigidos
        int somaKm = 0; // total de quilômetros dirigidos
        int qtdGasolina = 0; // abastecimento
        int somaCombustivel = 0; // total de abastecimentos
        float consumo = 0.0f; // média consumo km/litros
        float consumoTotal = 0.0f; // média total km / litros
        
        // entrada de dados
        System.out.print("Digite a quilometragem dirigida (-1 = sair):: ");
        kmDirigidos = entrada.nextInt(); // entreda de valores do usuário
        
        // enquanto kmDigitados diferente de menos um faça
        while( kmDirigidos != -1 ) {
            
            somaKm += kmDirigidos; // soma os quilometros dirigidos
            
            // entrada de dados
            System.out.print("Infrome a quantidade de litros abastecidos: ");
            qtdGasolina = entrada.nextInt(); // entreda do usuário
            somaCombustivel += qtdGasolina; // soma quantidade de abastecimentos
            
            // calcular o consumo
            consumo =  kmDirigidos / qtdGasolina;
            consumoTotal =  somaKm / somaCombustivel; // média do consumo da viagem
            
            // imprime resultado
            System.out.println("\nCONSUMO DE CONBUSTÍVEL NESSA VIAGEM");
            System.out.printf("Km dirigidos: %d%n", kmDirigidos);
            System.out.printf("Quantidade de combustível %d litros%n", qtdGasolina);
            System.out.printf("O carro fez nessa viagem %.2f Km/litros.%n", consumo);

            // entrada de dados
            System.out.print("\nDigite a quilometragem dirigida (-1 = sair):: ");
            kmDirigidos = entrada.nextInt();
            
            if( kmDirigidos == -1 ) // se kmDigitados igual a menos um
                break; // sair do loop while
            
        } // fim while
        
        // imprime o total do resultado
        System.out.println("\nTOTAL DO CONSUMO DE CONBUSTÍVEL EM TODAS AS VIAGENS");
        System.out.printf("Total de Km dirigidos: %d%n", somaKm);
        System.out.printf("Total dos abastecimentos %d litros%n", somaCombustivel);
        System.out.printf("A média de consumo nessa viagem foi de %.2f Km/litros.%n", consumoTotal);
        
    } // fim main
    
}// fim classe

