package Vetor;

public class Quantos11 {
    public static void main(String[] args) {

        // número de argumentos de linha de comando
        int n = args.length;

        // mensagem de saída
        System.out.print("Você digitou " + n + " argumento de linha de comando");
        if (n == 1)
            System.out.println(".");
        else
            System.out.println("s.");

    } // fim main
} // fim classe