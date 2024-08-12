package javaParaIniciantes.capitulo05.exemplos;

public class ArrayMulti05 {
   public static void main(String[] args) {
      
      // variáveis
      int t, i;
      // array Multidimensional
      int tabela[][] = new int[3][4];

      // adiciona valores na matriz
      // for para linha
      for(t = 0; t < 3; t++) {
         // for para coluna
         for(i = 0; i < 4; i++) {
            // atribui valores a matriz
            tabela[t][i] = (t * 4) + i + 1;
            // imprime os valores da matriz
            System.out.print(tabela[t][i] + "\t");
         } // end for i
         System.out.println(); // pula linha
      } // end for t
   } // end main
} // end class
