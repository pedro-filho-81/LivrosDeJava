package Capitulo08.Exemplos;
import java.security.SecureRandom;

public class MatrizRecebeValores03 {
   public static void main(String[] args) {
      // MM

      // constante tamanho da matriz
      final int linha = 3;
      final int coluna = 3;

      // matriz
      int[][] matriz = new int[linha][coluna];

      // adiciona valores
      adicionar(matriz, linha, coluna);
      exibir(matriz, linha, coluna);

   } // end main

   public static void adicionar(int[][] matriz, int linha, int coluna) {

      // objeto
      SecureRandom alea = new SecureRandom();

      int item = 0;
      int numAlea = 0;
      int k = 0;

      for(int i = 0; i < linha; i++) {
         for(int j = 0; j < coluna; j++) {
            do {
               
               numAlea = 1 + alea.nextInt(50);
               matriz[i][j] = numAlea;
               item = 0;

               if (matriz[i][j] == numAlea) {
                  item = 1;
               }
               
               if (item == 0) {
                  k++;
               } // end if else
               // faça enquanto k < j
            } while (k < j && k > i);
         
         } // end for coluna
         
      } // end for linha

   } // end adicionar

   public static void exibir(int[][] matriz, int linha, int coluna) {

      System.out.println("matriz:");
      for(int i = 0; i < linha; i++) {
         System.out.print("{");
         for(int j = 0; j < coluna; j++) {
            // exibe
            System.out.printf("%5d", matriz[i][j]);
         } // end for coluna
         System.out.println("  };"); // pula linha
      } // end for linha
      
   } // end adicionar

} // end class
