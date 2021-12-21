package sensacaotermica25;

/*
* 1.2.25 Sensação térmica. Dada a temperatura T (em graus Fahrenheit) e a velocidade 
* do vento v (em milhas por hora), o Serviço Meteorológico Nacional define a temperatura 
* efetiva (sensação térmica) da seguinte forma:
* 
* w = 35,74 + 0,6215 T + (0,4275 T - 35,75) v0,16
*
* Escreva um programa que receba dois argumentos de linha de comando duplos, temperatura e velocidade,
* e imprima a sensação térmica. Use Math.pow (a, b) para calcular ab. Observação: a fórmula não é válida 
* se T for maior que 50 em valor absoluto ou se v for maior que 120 ou menor que 3 (você pode assumir 
* que os valores obtidos estão nessa faixa).
* Sedgewick, Robert; Wayne, Kevin. Ciência da computação (p. 47). Pearson Education. Edição do Kindle.
* @author Pedro Filho,20/12/2021
 */

import java.util.Scanner;

public class SensacaoTermica25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria o objeto Scanner
        Scanner input = new Scanner(System.in);
        
        // entrada de dados
        System.out.print("Digite a temperatura: ");
        double temperatura = input.nextDouble();
        System.out.print("Digite a velocidade do vento: ");
        double velocidadeDoVento = input.nextDouble();
        
        
        // calcular w = 35,74 + 0,6215 T + (0,4275 Ttemperatura - 35,75) v * 0,16
        double sensacao = 35.74 + 0.6215 * temperatura + (0.4275 * temperatura - 35.75) * velocidadeDoVento * 0.16;
        
        // mostra resultado
        System.out.println("Temperatura = " + temperatura + "º" );
        System.out.println("Velocidade do vento = " + velocidadeDoVento );
        System.out.printf("Sensação térmica:: %.2f%n", sensacao );
        
    } // fim main    
} // fim classe
