package Exercicios1_3;

public class Condicao5_PulaLinha09 {
    /*
        1.3.9 Escreva um programa que, usando um loop for e uma instrução if, 
        imprima os inteiros de 1.000 a 2.000 com cinco inteiros por linha. 
        Dica: use a operação%.
        Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pp. 81-82). 
        Pearson Education. Edição do Kindle.
        Pedro Filho, 02/11/2021
    */
    public static void main(String[] args) {

        // variáveis CONSTANTES
        int INICIO = 1000;
        int FIM = 2000;
        int PULA_LINHA = 5;

        // loop for
        for (int i = INICIO; i <= FIM; i++) {
            // imprime
            System.out.print(i + " ");

            // se multiplo de 5 pula uma linha
            if ((i + 1) % PULA_LINHA == 0)
                System.out.println();
        } // fim for

        System.out.println(); // pula linha

    } // fim main
} // fim classe
