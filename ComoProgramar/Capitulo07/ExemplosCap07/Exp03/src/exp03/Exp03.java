/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp03;

/**
 * Aritmética com números reais (double)
 * 30/01/2022
 */
import java.util.Scanner;

public class Exp03 {

    public static void main(String[] args) {
        // TODO code application logic here

        // cria o objeto para Scanner
        Scanner input = new Scanner(System.in);
        
        // entrada de dados
        System.out.print("Digite um número: ");
        double a = input.nextDouble();
        System.out.print("Digite outro número: ");
        double b = input.nextDouble();
        // variáveis
        double sum  = a + b; // somar
        double prod = a * b; // multiplicar
        double quot = a / b; // dividir
        double rem  = a % b; // resto da divisão

        // mostra resultado
        System.out.println(a + " + " + b + " = " + sum);
        System.out.println(a + " * " + b + " = " + prod);
        System.out.println(a + " / " + b + " = " + quot);
        System.out.println(a + " % " + b + " = " + rem);

        System.out.println(); // pula linha
        System.out.println("sin(pi/2) = " + Math.sin(Math.PI/2));
        System.out.println("log(e)    = " + Math.log(Math.E));
    }
    
}
