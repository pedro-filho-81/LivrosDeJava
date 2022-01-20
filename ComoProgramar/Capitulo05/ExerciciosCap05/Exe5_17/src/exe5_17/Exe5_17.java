/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe5_17;

/**
 *  5.17 (Calculando vendas) Um varejista on-line vende cinco produtos cujos preços no varejo são como a seguir: 
 * produto 1, US$ 2,98; produto 2, US$ 4,50; produto 3, US$ 9,98; produto 4, US$ 4,49 e produto 5, US$ 6,87. 
 * Escreva um aplicativo que leia uma série de pares de números como segue:
a) número de produto
b) quantidade vendida
Seu programa deve utilizar uma instrução switch para determinar o preço de varejo de cada produto. 
* Você deve calcular e exibir o valor de varejo total de todos os produtos vendidos. Utilize um loop controlado por sentinela 
* para determinar quando o programa deve parar o loop e exibir os resultados finais.
 * @author Pedro Filho, 20/01/2022
 */

import java.util.Scanner;

public class Exe5_17 {

    public static void main(String[] args) {
        // TODO code application logic here

        // cria o objeto Scanner
        Scanner entrada = new Scanner(System.in);
        
        //variáveis
        int qtdVendida = 0;
        int numProduto = 0;
        double totVendas1 = 0, totVendas2 = 0, totVendas3 = 0, totVendas4 = 0, totVendas5 = 0;
        
        System.out.println("  TABELA DE PREÇO");
        System.out.println("*******************");
        System.out.println("*produto 1 R$ 2,98*");
        System.out.println("*produto 2 R$ 4,50*");
        System.out.println("*produto 3 R$ 9,98*");
        System.out.println("*produto 4 R$ 4,49*");
        System.out.println("*produto 5 R$ 6,87*");
        System.out.println("*******************");
        
        // entrada de dados
        System.out.print("Digite o número do produto ( -1 para sair ): ");
        numProduto = entrada.nextInt();
            
        // enquanto numProduto diferente de -1 faça
        while( numProduto != -1 ) {

            // sum produto igual a -1 
            if( numProduto == -1 )
                break;
                
            System.out.print("Informe a quantidade vendida: ");
            qtdVendida = entrada.nextInt();

            //opções
            switch( numProduto ) {

                case 1:                  
                    totVendas1 += ( 2.98 * qtdVendida );
                    break;

                case 2: 
                    totVendas2 += 4.50 * qtdVendida;
                    break;

                case 3:
                    totVendas3 += 9.98 * qtdVendida;
                    break;

                case 4:
                    totVendas4 += 4.49 * qtdVendida;
                    break;

                case 5:
                    totVendas5 = 6.87 * qtdVendida;
                    break;

                default:
                    System.out.println("Codigo do produto indevido!");
                    break;                        
            } // fim switch
            
            // entrada de dados
            System.out.print("Digite o número do produto ( -1 para sair ): ");
            numProduto = entrada.nextInt();
            
        } // fim while
        
        System.out.println("\nRESUMO DAS VENDAS NO VAREJO.");
        // mostra resultado
        System.out.printf("Valor total das vendas do produto 1: R$%.2f%n", totVendas1); 
        System.out.printf("Valor total das vendas do produto 2: R$%.2f%n", totVendas2); 
        System.out.printf("Valor total das vendas do produto 3: R$%.2f%n", totVendas3); 
        System.out.printf("Valor total das vendas do produto 4: R$%.2f%n", totVendas4); 
        System.out.printf("Valor total das vendas do produto 5: R$%.2f%n", totVendas5); 
        System.out.printf("Total recebido das vendas no varejo R$ %.2f%n", totVendas1 + 
                                       totVendas2 + totVendas3 + totVendas4 + totVendas5);
    } // fim main    
} // fim classe
