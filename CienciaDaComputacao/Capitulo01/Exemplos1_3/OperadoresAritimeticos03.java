package Exemplos1_3;

// biblioteca 
import java.util.Scanner; // para o objeto input

public class OperadoresAritimeticos03 {
    public static void main(String[] args) {

        // cria e inicializa o objeto input da classe Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um inteiro: ");
        int a = input.nextInt();
        System.out.print("Digite outro inteiro: ");
        int b = input.nextInt();

        // calcula
        int soma  = a + b;
        int produto = a * b;
        int divisao = a / b;
        int resto  = a % b;

        System.out.println("\nARITMÉTICA"); // CABEÇALHO
        // mostra o resultado
        System.out.println( "Soma => " + a + " + " + b + " = " + soma);
        System.out.println( "Produto => " + a + " * " + b + " = " + produto);
        System.out.println( "Divisão => " + a + " / " + b + " = " + divisao);
        System.out.println( "Resto => " + a + " % " + b + " = " + resto);
        System.out.println( "Cálculos => " + a + " = " + divisao + " * " + b + " + " + resto);
    } // fim main
} // fim classe
