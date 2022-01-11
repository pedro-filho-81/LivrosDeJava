package exercicio4_30;

/**
 *  4.30 (Palíndromos) Um palíndromo é uma sequência de caracteres que é lida da esquerda para a direita ou da 
 * direita para a esquerda. Por exemplo, cada um dos seguintes inteiros de cinco dígitos é um palíndromo: 
 * 12321, 55555, 45554 e 11611. Escreva um aplicativo que lê em um inteiro de cinco dígitos e determina se ele é ou não 
 * um palíndromo. Se o número não for de cinco dígitos, exiba uma mensagem de erro e permita que o usuário insira um novo valor.
 * @author Pedro, 11/01/2022
 */
import java.util.Scanner;

public class Exercicio4_30 {

    public static void main(String[] args) {
        // TODO code application logic here

        // objeto para Scanner
        Scanner entrada = new Scanner(System.in);
       
        // variável
        int numero = 9999;
        int n1, n2, n3, n4, n5;
        
        // enquanto número menor que 10000 faça
        while( numero < 10000) {

            // entrada de dados
            System.out.print("Digite um inteiro de 5 digitos: ");
            numero = entrada.nextInt();

            if( numero >= 10000 ) {
                
                // calcular
                n1 = numero / 10000 % 10000;
                n2 = numero % 10000 / 1000;
                n3 = numero % 1000 / 100;
                n4 = numero % 100 / 10;
                n5 = numero % 10 / 1;
                
                if( n1 == n5 ) {
                    if( n2 == n4 ) {
                        System.out.printf("%d %d %d %d %d É um Paíindromo%n", n1, n2, n3, n4, n5);
                    } // fim if                
                } // fim if    
                else
                    System.out.printf("%d %d %d %d %d NÃO É um Paíindromo%n", n1, n2, n3, n4, n5);
            } // fim if            
        } // fimwhile entrada de dados
        
    } // fim main    
} // fim classe
