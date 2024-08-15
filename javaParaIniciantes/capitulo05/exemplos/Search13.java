package javaParaIniciantes.capitulo05.exemplos;
/*
 * Pesquisa um array usando o laço for each  
 */
public class Search13 {
   public static void main(String[] args) {
      
      // vetor
      int[] nums = {6, 8, 3, 7, 5, 6, 1, 4};
      // variável recebe valor a ser pesquisado
      int val = 5;
      int count = 0; // posição do valor
      // encontrado recebe falso
      boolean found = false;

      // laço forEach para encontrar um valor
      for (int x : nums) {
         count++; // contar loops
         // se o valor for encontrado
         if (val == x) {

            // es encontrado recebe verdadeiro e
            found = true;
            break; // saia do laço forEach
         } // end if val         
      } // end for each x

      // se valor encontrado
      if (found) { // se verdadeiro
         // imprima a mensagem
         System.out.println("Value found! na posição: " + count);
      } // end if found
   } // end main
} // end class
