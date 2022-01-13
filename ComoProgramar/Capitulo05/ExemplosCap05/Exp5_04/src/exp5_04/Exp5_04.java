/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp5_04;

/**
 * Cálculo de juros compostos com for
 * @author 13/01/2022
 */
public class Exp5_04 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // variáveis
        double montante; // valor total da aplicação
        double principal = 1000.0; // valor aplicado
        double taxa = 0.05; // taxa de juros 
        
        // cabeçalho
        System.out.printf("%s%15s%n", "Ano", "Saldo Toral");
        
        // loop para calcular a quantidade de depósito para cada um dos dez anos
        for( int ano = 1; ano <= 10; ano++ ) 
        {
            
            // calcula o saldo total de cada ano
            montante = principal * Math.pow(1 + taxa, ano );
            
            // imprime os valores
            System.out.printf("%2d%15.2f%n", ano, montante );
        } // fim for        
    } // fim main    
} // fim classe
