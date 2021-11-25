package Exemplos1_2;

import java.util.Scanner;

public class InteiroRandomico06 {
    public static void main(String[] args) {

        // cria e inicializa o objeto input da classe Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um inteiro: ");
        // um inteiro positivo
        int num = input.nextInt();

        // gera um valor entre 0.0 e 1.0
        double alea = Math.random();

        // valor recebe um valor inteiro do produto entre num e alea 
        int valor = (int) (alea * num);

        System.out.println("O valor é " + valor);
    } // fim man
} // fim classe
