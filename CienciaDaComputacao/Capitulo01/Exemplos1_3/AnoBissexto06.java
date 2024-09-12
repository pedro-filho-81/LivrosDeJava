package Exemplos1_3;

import java.util.Scanner;

public class AnoBissexto06 { 
    public static void main(String[] args) { 

        try (
        
            // cria e inicializa o objeto input da classe Scanner
            Scanner input = new Scanner(System.in)) {
            
           // entrada de dados
            System.out.print( "Digite um ano: ");
            int ano = input.nextInt();
            boolean anoBissexto;

            // verifica se ano é divisíval por 4
            anoBissexto = (ano % 4 == 0); // tem que ser true

            // se ano divisível por 4 (true)
            // e não divisível por 100 (true)
            // aqui tem que ser true também
            anoBissexto = anoBissexto && (ano % 100 != 0);

            // verifica se ano é divisível por 4 (true)
            // e não divisível por 100 (true)
            // e divisível por 400 (true) também
            // se algum acima ou ambos forem (false)
            anoBissexto = anoBissexto || (ano % 400 == 0); // aqui um ou ambos tem que ser (true)

            // imprime resultado true
            System.out.println( ano + " é um ano bissexto? " + anoBissexto );
        }

    } // fim main
} // fim classe
