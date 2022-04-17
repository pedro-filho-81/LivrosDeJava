package Matriz;

public class MatrizBooleana16 {
    /**
     * 1.4.16 Escreva um programa que receba um argumento de linha de comando
     * inteiro n e crie um array booleano n-por-n a[][] tal que a[i][j] seja
     * verdadeiro se i e j forem relativamente primos (têm nenhum fator comum)
     * e falso caso contrário. Use sua solução para o EXERCICIO 1.4.6 para imprimir
     * a matriz. Dica: Use peneira.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 120).
     * Pearson Educação. Edição do Kindle.
     * Pedro, 15/04/2022
     */
    public static void main(String[] args) {

        // variável para argumento de linha de comando
        int num = Integer.parseInt(args[0]);
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);
        int divisao = 1;

        // declara e cria uma matriz boleana
        boolean[][] matriz = new boolean[num + 1][num + 1];

        // Adiciona valores a matriz
        // loop linha
        for (int i = 1; i <= num; i++) {
            // loop para a coluna
            for (int j = 1; j <= num; j++) {
                matriz[i][j] = false;
            } // fim for
        } // fim for
        
        while (num2 != 0) {
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
            System.out.printf("%d / %d = %d%n", num1, num2, num1 / num2);
            divisao = num1 / num2;
            int resto = num1 % num2;
            System.out.println("Resto = " + resto);
            num1 = num2;
            num2 = resto;
        } // fim while

        // imprime 
        System.out.printf("num1 recebe o valor de num2 = %d%n", num1);
        // se número 1 igual a 1
        if(num1 == 1) System.out.printf("MDC = %3d Sao primos entre si.%n", num1);
        else          System.out.printf("MDC = %3d Nao sao primos entre si", num1);
        System.out.println();

    } // fim main

    // método mostrar
    public static void mostrar(boolean[][] matriz) {

        // loop linha
        for (int i = 2; i < matriz.length; i++) {
            // loop para a coluna
            for (int j = 2; j < matriz.length; j++) {
                System.out.printf("%8b", matriz[i][j]);
            } // fim for
            System.out.println();
        } // fim for

    } // fim mostrar

} // fim classe