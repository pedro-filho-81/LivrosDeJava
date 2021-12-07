package Exemplos;

public class CalculandoValoresVetor03 {
    public static void main(String[] args) {
        
        // cria CONSTANTE para o tamanho do vetor
        final int ARRAY_LENGTH = 10;

        // cria o vetor para 10 elementos
        int[] vetor = new int[ ARRAY_LENGTH ];

        // loop para atribuir valores ao vetor
        for(int contar = 0; contar < vetor.length; contar++ ) {
            // vetor recebe o valor da expressão
            vetor[ contar ] = 2 + 2 * contar;
        } // fim for

        // titulo
        System.out.printf("%s%8s%n", "Indice", "Valor" );

        // loop para mostrar os valores do vetor
        for(int contar = 0; contar < vetor.length; contar++ ) {
            // mostra
            System.out.printf("%5d%8d%n", contar, vetor[ contar ] );
        } // fim for
    } // fim main
} // fim classe
