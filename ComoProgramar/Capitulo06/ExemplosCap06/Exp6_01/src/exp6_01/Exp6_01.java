/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp6_01;

/**
 *Método para encontrar o maior valor
 * @author 22/01/2022
 */
import java.util.Scanner;

public class Exp6_01 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o objeto Scanner
        Scanner input = new Scanner(System.in);
        
        // entrada de dados
        System.out.print("Digite três números de ponto-flutuante: ");
        double numero1 = input.nextDouble(); // primeiro número
        double numero2 = input.nextDouble(); // segundo número
        double numero3 = input.nextDouble(); // terceiro número
        
        // detremina o maior valor
        double resultado = maiorValor( numero1, numero2, numero3 );
        
        // imprime resultado
        System.out.printf("O maior valor é %.2f%n", resultado );
        
    } // fim main    
    
    // método maior valor
    public static double maiorValor( double number1, double number2, double number3 ) {
        
        // variável
        double maximumValue = number1;
        
        if( number2 > maximumValue)
            maximumValue = number2;
        
        if( number3 > maximumValue )
            maximumValue = number3;
        
        return maximumValue;
    } // fim método
} // fim classe