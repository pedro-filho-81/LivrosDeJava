package javaParaIniciantes.capitulo05.exemplos;

// Demonstra um array unidimencional
public class ArrayDemo01 {
   public static void main(String[] args) {
      // declara e cria o vetor para 10 elementos
      int sample[] = new int[10];
      // declara variável para loop for
      int i;

      // loop para adicionar valores ao vetor
      for(i = 0; i < 10; i = i + 1) {
         // vetor recebe os valores de i
         sample[i] = i;
      } // end for

      // loop para exibir os valores do vetor
      for(i = 0; i < 10; i = i + 1)
         // exibi os valores de sample
         System.out.println("This is sample[" + i + "]; " + sample[i]);
   } // end main
} // end class
