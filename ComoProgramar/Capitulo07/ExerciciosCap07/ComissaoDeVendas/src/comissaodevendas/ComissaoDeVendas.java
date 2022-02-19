/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comissaodevendas;

/**
 * 7.10 (Comissões de vendas) Utilize um array unidimensional para resolver o seguinte problema: 
 * uma empresa paga seu pessoal de vendas por comissão. O pessoal de vendas recebe R$ 200 por semana 
 * mais 9% de suas vendas brutas durante essa semana. Por exemplo, um vendedor que vende R$ 5.000 brutos 
 * em uma semana recebe R$ 200 mais 9% de R$ 5.000 ou um total de R$ 650. Escreva um aplicativo (utilizando 
 * um array de contadores) que determina quanto o pessoal de vendas ganhou em cada um dos seguintes intervalos 
 * (suponha que o salário de cada vendedor foi truncado para uma quantia inteira):
* a) $200–299
    b) $300–399
    c) $400–499
    d) $500–599
    e) $600–699
    f) $700–799
    g) $800–899
    h) $900–999
    i) R$ 1.000 e acima
    Resuma os resultados em formato tabular
 * @author Pedro Filho, 18/02/2022
 */

import java.util.Scanner;

public class ComissaoDeVendas {

    public static void main(String[] args) {
        // TODO code application logic here

        // cria o objeto Scanner
        Scanner entrada = new Scanner(System.in);
        
        int[] salario = new int[10];
        
        final int FIXO = 200;
        
        String nomeDaLoja;
        int vendasBrutas;
        int contador = 0;
        int comissao;
            
        // entrada de dados
        System.out.print("Informe o nome da loja: ");
        nomeDaLoja = entrada.nextLine();            
        
        while( contador < 10 ) {

            System.out.printf("Vendedor %2d valor das vendas bruta R$ ", contador + 1 );
            vendasBrutas = entrada.nextInt();
            
            // se vendas brutas maior que zero
            if( vendasBrutas > 0 )
                // o vendedor recebe 9% de comissao mais 200 de fixo
                comissao = ( vendasBrutas * 9 ) / 100 + FIXO;
            // se não
            else
                // o vendedor recebe só o fixo
                comissao = FIXO;
        
            // e salário recebe o valor da comissão
            salario[ contador ] = comissao;
            
            contador++; // incrementa contador                   

        } // fim while
        
        // cria o objeto da classe Comissão
        Comissao vendedor = new Comissao(nomeDaLoja, salario);            
            
        vendedor.processoSalario();
            
    } // fim main    
} // fim classe
