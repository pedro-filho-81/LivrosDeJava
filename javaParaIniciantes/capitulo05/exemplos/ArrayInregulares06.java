package javaParaIniciantes.capitulo05.exemplos;

// Aloca manualmente segundas dimensões de tamanhos diferentes

public class ArrayInregulares06 {
   public static void main(String[] args) {
      
      // array matriz
      int matriz[][] = new int[7][];

      // segundas dimensões para 10 elementos
      // colunas para 10 elementos
      matriz[0] = new int[10];
      matriz[1] = new int[10];
      matriz[2] = new int[10];
      matriz[3] = new int[10];
      matriz[4] = new int[10];

      // coluna de 2 elementos
      matriz[5] = new int[2];
      matriz[6] = new int[2];

      // variáveis
       int i, j;

       // forja alguns dados ficticios
       for(i = 0; i < 5; i++) {
         for(j = 0; j < 10; j++) {
            matriz[i][j] = i + j + 10;     
         }
       }
       
       //
       for(i = 0; i < 5; i++) {
         for(j = 0; j < 10; j++) {
            System.out.print(matriz[i][j] + " ");     
         }
         System.out.println();
       }

       System.out.println();

       for(i = 0; i < 7; i++) {
         for(j = 0; j < 2; j++) {
            matriz[i][j] = i + j + 10;     
         }
       }

       //
       for(i = 0; i < 7; i++) {
         for(j = 0; j < 2; j++) {
            System.out.print(matriz[i][j] + " ");     
         }
         System.out.println();
       }
   } // end main
} // end class
