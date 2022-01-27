package Exemplos;

public class SomaValoresDoVetor04 {
    public static void main(String[] args) {
        
        // cria vetor
        int[] vetor = { 10, 25, 35, 65, 66, 41, 87, 91, 17, 76 };

        // cria variável
        int soma = 0;

        // loop para somar os valores do vetor
        for( int contar = 0; contar < vetor.length; contar++ ) {
            soma += vetor[ contar ]; // somando os valores do vetor
        } // fim for

        System.out.printf("O valor total do vetor é %d%n", soma );

    } // fim main   
} // fim classe
