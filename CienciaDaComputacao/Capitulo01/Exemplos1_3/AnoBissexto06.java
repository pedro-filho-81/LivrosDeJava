import java.util.Scanner;

public class AnoBissexto06 { 
    public static void main(String[] args) { 

        // cria e inicializa o objeto input da classe Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print( "Digite um ano: ");
        int ano = input.nextInt();
        boolean anoBissexto;

        // divisíval por 4
        anoBissexto = (ano % 4 == 0);

        // divisível por 4 e não por 100
        anoBissexto = anoBissexto && (ano % 100 != 0);

        // divisível por 4 e não por 100 e divisível por 400
        anoBissexto = anoBissexto || (ano % 400 == 0);

        // imprime resultado
        System.out.println( ano + " é um ano bissexto? " + anoBissexto );

    } // fim main
} // fim classe
