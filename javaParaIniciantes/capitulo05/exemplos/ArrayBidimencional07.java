package javaParaIniciantes.capitulo05.exemplos;

public class ArrayBidimencional07 {
   public static void main(String[] args) {
      
      // declara, cria e inicializa array bidimencional
      int matriz[][] = {
            {1, 1},
            {2, 4},
            {3, 9},
            {4, 16},
            {5, 25},
            {6, 36},
            {7, 49},
            {8, 64},
            {9, 81},
            {10, 100}
      }; // end matriz

      // variáveis
      int i, j;

      // exibe os valores do array
      for(i = 0; i < 10; i++) {
         for(j = 0; j < 2; j++) {
            System.out.print(matriz[i][j] + "\t");
         }
         System.out.println();
      } // end for

      System.out.println(); // pula linha
   } // end main
} // end class
