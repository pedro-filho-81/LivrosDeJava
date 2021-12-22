/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_18;

/**
 *4.18 (Calculador de limite de crédito) Desenvolva um aplicativo Java que determina se um 
 * cliente de uma loja de departamentos excedeu o limite de crédito em uma conta-corrente. 
 * Para cada cliente, os seguintes dados estão disponíveis:
        a) Número de conta.
        b) Saldo no início do mês.
        c) Total de todos os itens cobrados desse cliente no mês.
        d) Total de créditos aplicados ao cliente no mês.
        e) Limite de crédito autorizado.
        O programa deve inserir todos esses dados como inteiros, calcular o novo saldo 
        * (= saldo inicial + despesas – créditos), exibir o novo saldo e determinar se o novo 
        * saldo excede ao limite de crédito do cliente. Para aqueles clientes cujo limite de 
        * crédito foi excedido, o programa deve exibir a mensagem "Limite de crédito excedido".
 * @author Pedro Filho, 22/12/2021
 */

import java.util.Scanner;

public class Exercicio4_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // cria o objeto entrada da classe Scanner
        Scanner entrada = new Scanner(System.in);
        
      // entrada de dados do usuário
      System.out.print("Informe o número da conta ( -1 para sair ) ");
      // a) Número de conta.
      int numDaConta = entrada.nextInt();
      
      while( numDaConta !=  -1 ) {

            System.out.print("Saldo devedor R$ ");
          // b) Saldo no início do mês.
          int saldoDevedor = entrada.nextInt();

            System.out.print("Informe o valor da taxa cobrada R$ ");
          // c) Total de todos os itens cobrados desse cliente no mês.
          int taxaCobrada = entrada.nextInt();

            System.out.print("Crédito mensal R$ ");
          // d) Total de créditos aplicados ao cliente no mês.
          int totalDeCredito = entrada.nextInt();

            System.out.print("Limite de crédito R$ ");
          // e) Limite de crédito autorizado.
          int limiteDeCredito = entrada.nextInt();

            System.out.println("\nEXTRADO CARYÃO DE CRÉDITO");

          // calcular o novo saldo devedor
          int novoSaldo = (saldoDevedor + taxaCobrada - totalDeCredito);
          System.out.println("Conta: " + numDaConta);
          System.out.printf("Saldo devedor R$ %d\n",  novoSaldo);
          System.out.printf("Limite de crédito R$ %d%n", limiteDeCredito);        

          // condição
          // se novo saldo maior que limite de crédito faça
          if(novoSaldo >= limiteDeCredito )
              // imprime
                System.out.printf("Não Autorizado!\nSaldo devedor é maior ou igual ao limite.%n");
          else
              // imprime
                System.out.printf("Valor autorizado R$ %d%n", novoSaldo);

            // entrada de dados do usuário
            System.out.print("\nInforme o número da conta ( -1 para sair ) ");
            // a) Número de conta.
            numDaConta = entrada.nextInt();

      } // fim wjile
      
    } // fim main
    
} // fim classe
