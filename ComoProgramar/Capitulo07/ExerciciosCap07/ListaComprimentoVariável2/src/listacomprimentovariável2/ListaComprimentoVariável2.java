/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacomprimentovariável2;

/**
 *  7.14 (Lista de argumento de comprimento variável) Escreva um aplicativo que calcula 
 * o produto de uma série de inteiros que são passados para método product utilizando uma 
 * lista de argumentos de comprimento variável. Teste seu método com várias chamadas, 
 * cada uma com um número diferente de argumentos.
 * @author Pedro, 04/03/2022
 */
public class ListaComprimentoVariável2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        double num1 = 10.79;
        double num2 = 15.94;
        double num3 = 13.59;
        double num4 = 12.49;
        double num5 = 17.92;
        double num6 = 21.39;
        
        System.out.printf("%.2f * %.2f  = %.2f%n", num1, num2, produto(num1, num2) );
        System.out.printf("%.2f * %.2f  * %.2f = %.2f%n", num1, num2, num3, produto(num1, num2, num3) );
        System.out.printf("%.2f * %.2f  * %.2f * %.2f = %.2f%n", num1, num2, num3, num4, produto(num1, num2, num3, num4) );
        System.out.printf("%.2f * %.2f  * %.2f * %.2f * %.2f = %.2f%n", 
                num1, num2, num3, num4, num5, produto(num1, num2, num3, num4, num5) );
        System.out.printf("%.2f * %.2f  * %.2f * %.2f * %.2f * %.2f = %.2f%n", 
                num1, num2, num3, num4, num5, num6, produto(num1, num2, num3, num4, num5, num6) );        
        
    } // fim main
    
    // método produto
    public static double produto(double... numeros) {
        
        double prod = 1;
        
        for( double numero : numeros ) {
            prod *= numero;
        } // fim for numero
        return prod;
    } // fim produto
    
} // fim classe
