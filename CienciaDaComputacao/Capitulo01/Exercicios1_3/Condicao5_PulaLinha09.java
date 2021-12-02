package Exercicios1_3;

public class Condicao5_PulaLinha09 {
    /*
     * 1.3.9 Escreva um programa que, usando um loop for e uma instrução if,
     * imprima os inteiros de 1.000 a 2.000 com cinco inteiros por linha.
     * Dica: use a operação%.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pp. 81-82).
     * Pearson Education. Edição do Kindle.
     * Pedro Filho, 02/11/2021
     */
    public static void main(String[] args) {

        // variáveis CONSTANTES
        // CONSTANTES devem ser escritas em MAIÚSCULAS
        int INICIO = 1000;
        int FIM = 2000;
        int PULA_LINHA = 10;

        // loop for limitado por CONSTANTES ( INICIO / FIM )
        for (int i = INICIO; i <= FIM; i++) {
            // imprime
            System.out.print(i + " ");

            // se multiplo do valor da constante PULA_LINHA
            if ((i + 1) % PULA_LINHA == 0)
                // pule uma linha dentro do loop
                System.out.println();

        } // fim for

        System.out.println(); // pula linha fora do loop

    } // fim main
} // fim classe
