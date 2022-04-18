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
        int dividendo = Integer.parseInt(args[1]);
        int divisor = Integer.parseInt(args[2]);
        int divisao = 1;
        
        // declara e cria uma matriz boleana
//        boolean[][] matriz = new boolean[num + 1][num + 1];

        //for (int controle = 0; controle < 5; controle++) {
/*
            // Adiciona valores a matriz
            // loop linha
            for (int i = 1; i <= num; i++) {
                // loop para a coluna
                for (int j = 1; j <= num; j++) {
                    matriz[i][j] = false;
                } // fim for
            } // fim for
*/
                    
        while (divisor != 0) {
                    
            System.out.println("dividendo = " + dividendo);
            System.out.println("divisor = " + divisor);

            divisao = dividendo / divisor;
            System.out.printf("%d / %d = %d%n", dividendo, divisor, divisao);
                  
            int resto = dividendo % divisor;
               
            System.out.println("Resto = " + resto);
               
            dividendo = divisor;
        
            divisor = resto;
               
        } // fim while

        // imprime
        System.out.printf("Quando o resto for 0\ndividendo recebe o valor do divisor = %d%n", dividendo);
        System.out.println("Que e o valor do MDC.");
        // se número 1 igual a 1
        if (dividendo == 1) {
            System.out.printf("MDC = %3d Sao primos entre si.%n", dividendo);
        } // fim if
        else {
            System.out.printf("MDC = %3d Nao sao primos entre si.%n", dividendo);
        } // fim else
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