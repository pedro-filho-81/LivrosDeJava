/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe5_14;

/**
 *5.14 (Programa de juros compostos modificado) Modifique o aplicativo de juros compostos da 
 * Figura 5.6 para repetir os passos para taxas de juros de 5%, 6%, 7%, 8%, 9% e 10%. 
 * Utilize um loop for para variar a taxa de juros.
 * @author Pedro, 19/01/2022
 */
public class Exe5_14 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // variáveis
        double principal = 1000.00;
        double taxa;
        int tempo = 10; // tempo de 10 anos
        double montante;
        
        // loop for  para variar a taxa de juros
        for( int j = 5; j <= 10; j++ ) {
            taxa = (double) j / 100; // calcula a taxa de juros
            // calcula o montante
            montante = principal * Math.pow(1 + taxa, tempo); 
            
            // imprime o resultado
            System.out.printf("Valor da aplicação R$ %.2f%nTempo %d anos.", principal, tempo);
            System.out.printf("%nTaxa = %.2f%%%nMontante = %.2f%n%n", taxa, montante);
            
        } // fim for     
    } // fim main   
} //  fim classe
