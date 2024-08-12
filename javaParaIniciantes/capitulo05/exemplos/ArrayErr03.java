package javaParaIniciantes.capitulo05.exemplos;

// Demonstra um array unidimencional com erro
public class ArrayErr03 {
   public static void main(String[] args) {
      // declara e cria o vetor para 10 elementos
      int sample[] = new int[10];
      // declara variável para loop for
      int i;

      // loop para adicionar valores ao vetor
      // que excede a capacidade do array
      // array para 10 elementos recebe 100
      for(i = 0; i < 100; i = i + 1) {
         // vetor recebe os valores de i
         sample[i] = i;
      } // end for

      /*
       * ERRO AO PREENCHER O ARRAY AVISO DO COmPILADOR
       * Exception in thread "main" java.lang.
       * ArrayIndexOutOfBoundsException: 
       * Index 10 out of bounds for length 10
       */

      // loop para exibir os valores do vetor
      for(i = 0; i < 10; i = i + 1)
         // exibi os valores de sample
         System.out.println("This is sample[" + i + "]; " + sample[i]);
   } // end main
} // end class
