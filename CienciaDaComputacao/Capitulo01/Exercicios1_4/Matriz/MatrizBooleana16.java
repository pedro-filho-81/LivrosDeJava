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
        int dividendo = 0;
        int divisor = 0;
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

        System.out.println("Matriz original:");
        // chama o método mostrar
        mostrar(matriz);

        for (int i = 2; i <= num; i++) {
            dividendo = i;
            for (int j = 1; j <= num; j++) {
                divisor = j;
                while (divisor != 0) {

                    //System.out.println("dividendo = " + dividendo);
                    //System.out.println("divisor = " + divisor);

                    divisao = dividendo / divisor;
                    //System.out.printf("%d / %d = %d%n", dividendo, divisor, divisao);

                    int resto = dividendo % divisor;

                    //System.out.println("Resto = " + resto);

                    dividendo = divisor;

                    divisor = resto;

                } // fim while

                // imprime
                //System.out.printf("Quando o resto for 0\ndividendo recebe o valor do divisor = %d%n", dividendo);
                //System.out.println("Que e o valor do MDC = " + dividendo);
                // se número 1 igual a 1
                if (dividendo == 1) {
                    //System.out.printf("Indica que %d e %d sao primos entre si.%n", i, j);
                    matriz[i][j] = true;
                } // fim if
                else {
                    //System.out.printf("Indica que %d e %d Nao sao primos entre si.%n", i, j);
                    matriz[i][j] = false;
                } // fim else

                dividendo = i;

//                System.out.println();

            } // fim for j

        } // fim for i

        System.out.println("Matriz modificada");
        // chama método mostrar
        mostrar(matriz);

    } // fim main

    // método mostrar
    public static void mostrar(boolean[][] matriz) {

        // loop linha
        for (int i = 1; i < matriz.length; i++) {
            // loop para a coluna
            for (int j = 1; j < matriz.length; j++) {
                System.out.printf("%8b", matriz[i][j]);
            } // fim for
            System.out.println();
        } // fim for

    } // fim mostrar

} // fim classe