package Exemplos1_3;

import java.util.Scanner;

public class ApostarGanharPerder14 {
    public static void main(String[] args) {

        // cria o objeto input da classe Scanner e inicializa
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print( "Informe o valor da aposta R$ " );
        int valorInicial  = input.nextInt();
        System.out.print("Informe as jogadas: ");
        int jogadas = input.nextInt();
        System.out.print("Informe quanto deseja ganhar: ");
        int objetivo = input.nextInt();

        int apostas = 0;       
        int vitorias = 0;      

        // repeat trials times
        for (int t = 0; t < objetivo; t++) {

            int dinheiro = valorInicial;
            while (dinheiro > 0 && dinheiro < jogadas) {

                apostas++;

                if (Math.random() < 0.5)
                    dinheiro++;     // win $1
                else                     
                    dinheiro--;     // lose $1
            } // fim while

            if (dinheiro == jogadas) 
                vitorias++;                // did gambler go achieve desired goal?
        } // fim for

        // print results
        System.out.println(vitorias + " vitorias of " + objetivo);
        System.out.println("Percentual de jogadas = " + 100.0 * vitorias / objetivo);
        System.out.println("Apostas          = " + 1.0 * apostas / objetivo);
    } // fim main    
} // fim classe
