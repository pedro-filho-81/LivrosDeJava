package Exercicios1_2; 
import java.util.Scanner;

public class DiaDaSemana29 {
    public static void main(String[] args) {

        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Informe o dia(d): ");
        int d = input.nextInt(); // dia
        System.out.print("Informe o mês(m): ");
        int m = input.nextInt(); // mês
        System.out.print("Informe o ano(aaaa): ");
        int a = input.nextInt(); // ano

        // calculo
        int a0 = a - (14 - m) / 12; // ano
        int x = a0 + a0/4 - a0/100 + a0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2; // mês
        int d0 = (d + x + (31* m0)/12) % 7; // dia


        // mostra resultado
        System.out.println("\nDIAS DA SEMANA");
        System.out.println("1 = Domingo");
        System.out.println("2 = Segunda-feira");
        System.out.println("3 = Terça-feira");
        System.out.println("4 = Quarta-feira");
        System.out.println("5 = Quinta-feira");
        System.out.println("6 = Sexta-feira");
        System.out.println("7 = Sábado");
        System.out.printf("Dia da semana: %d%n", d0 + 1);
    } // fim main
} // fim class