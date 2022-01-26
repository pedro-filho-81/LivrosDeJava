/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe6_06;

/**
 *  6.6 Declare o método sphereVolume para calcular e retornar o volume da esfera. 
 * Utilize a seguinte instrução para calcular o volume:
 * double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3) 
 * Escreva um aplicativo Java que solicita ao usuário o raio do tipo double de uma esfera, 
 * chama sphereVolume para calcular o volume e exibe o resulta
 * @author Pedro, 26/01/2022
 */
import java.util.Scanner;

public class Exe6_06 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o objeto scanner
        Scanner input = new Scanner(System.in);
        
        // variável
        double raio = 0.0;
        
        // entrada de dados
        System.out.print("Informe o raio da esfera: ");
        raio = input.nextDouble();
        
        double resultado = volumeDaEsfera(raio);
        
        System.out.printf("O volume da esfere é %.2f%n", resultado);
        
    } // fim main
    
    // cria o método voluma da esfrea
    static double volumeDaEsfera( double raio ) {
        // calcular o vlouma da esfrea
        double volume = (4.0 / 3.0 ) * Math.PI * Math.pow(raio, 3);
        
        return volume;
    } // fim método
    
} // fim classe