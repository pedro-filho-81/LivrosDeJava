/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe6_08;

/**
 *  6.8 (Taxas de estacionamento) Um estacionamento cobra uma tarifa mínima de R$ 2,00 para estacionar por até três horas. 
 * Um adicional de R$ 0,50 por hora não necessariamente inteira é cobrado após as três primeiras horas. A tarifa máxima para qualquer 
 * dado período de 24 horas é R$ 10,00. Suponha que nenhum carro fique estacionado por mais de 24 horas por vez. Escreva um 
 * aplicativo que calcule e exiba as tarifas de estacionamento para cada cliente que estacionou nessa garagem ontem. 
 * Você deve inserir as horas de estacionamento para cada cliente. O programa deve exibir a cobrança para o cliente atual e calcular 
 * e exibir o total dos recibos de ontem. Ele deve utilizar o método calculateCharges para determinar a tarifa para cada cliente.
 * @author Pedro, 26/01/2022
 */

import java.util.Scanner;

public class Exe6_08 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o objeto para Scanner
        Scanner input = new Scanner(System.in);
        
        double total = 0.0;
        int contaCarros = 0;
        
        // entrada de dados
        System.out.print("Digite o código do cliente (-1 para sair ): ");
        int codigoCliente = input.nextInt();
        
        // enquanto código do cliente diferente de -1
        while( codigoCliente != -1 ) {

            System.out.print("Informe o tempo em horas estacionado: ");
            int horasEstacionadas = input.nextInt();

            // recebe o valor da tarifa
            double resultdo = calcularEncargos(horasEstacionadas);
            total += resultdo;
            contaCarros++;
            
            // mostra resultado
            System.out.printf("Carro %d %nficou estacionado durante %d horas %nValor a pagar R$ %.2f%n", 
                                        codigoCliente, horasEstacionadas, resultdo);
        
        // entrada de dados
        System.out.print("Digite o código do cliente (-1 para sair ): ");
        codigoCliente = input.nextInt();
        
        } // fim while
        
        // mostra resultado total
        System.out.printf("%nTotal de carros estacionados %d%nTotal arrecadado R$ %.2f%n", contaCarros, total );
    } // fim main
    
    // cria o método
    static double calcularEncargos( double horas ) {
        
        // variável
        double tarifa = 0.0;
        
        // se horas menor ou igual a 3
        if( horas <= 3 ) {
            tarifa = 2.00;
        } // fimif
        else
            if( horas > 3 && horas < 24 ) {
                tarifa = ( ( horas - 3 ) * 0.50 ) + 2.00;
            } // fim else if
        else
            if( horas >= 24 ){
                tarifa = 10.00;
            } // fim else if
        
        return tarifa;
        
    } // fim método    
} // fim classe