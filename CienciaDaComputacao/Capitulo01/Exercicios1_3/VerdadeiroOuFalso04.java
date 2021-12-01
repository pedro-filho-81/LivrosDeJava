package Exercicios1_3;

import java.util.Scanner;

public class VerdadeiroOuFalso04 {
    public static void main(String[] args) {
        
        /*
            declara o objeto entrada para a classe Scanner e inicializa
            Scanner entrada; => declaração do objeto entrada da classe Scanner
            entrada = new Scanner(System.in); => inicializa o objeto da Classe
        */

        // na mesma linha Declara e inicializa o objeto entreda da classe Scanner
        Scanner entrada = new Scanner(System.in);

        // variáveis
        double x, y;

        // entrada de dados
        System.out.print("Digite os valores para x e y: ");
        x = entrada.nextDouble();
        y = entrada.nextDouble();

        System.out.print("\nVocê digitou para x = " + x + 
                    "\nE digitou para y = " + y + " então:\n\n");

        // se x igual a zero ou igual a 1
        if( x == 0.0 || x == 1.0 )
            // imprima
            System.out.println("Verdadeiro => x é igual a 0 ou 1") ;
        else
            // imprima
            System.out.println("Falso => x não é igual a 0 ou 1") ;

            // se x igual a zero ou igual a 1
            if( y == 0.0 || y == 1.0 )
                // imprima
                System.out.println("Verdadeiro => y é igual a 0 ou 1") ;
            else
                // imprima
                System.out.println("Falso => y não é igual a 0 ou 1") ;
    } // fim main    
} // fim classe
