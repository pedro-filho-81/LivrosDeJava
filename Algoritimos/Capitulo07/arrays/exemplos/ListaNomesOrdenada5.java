import java.util.Scanner;
/**
 * ListaNomesOrdenada5
 */
public class ListaNomesOrdenada5 {
   public static void main(String[] args) {
   
      // objeto
      Scanner input = new Scanner(System.in);
      // variáveis
      int i, j;
      String temp;
      // constante
      final int SIZE = 5;
      // matriz
      String[] nomes = new String[SIZE];

      for(i = 0; i < SIZE; i++) {
         System.out.print("Digite seu nome: ");
         nomes[i] = input.nextLine();
      } // end for nomes

      for(j = 0; j < SIZE; j++) {
         System.out.printf("%s ", nomes[j]);
      } // end for nom3w

      // ordenar
      for(i = 1; i < SIZE; i++) {
         for(j = i + 1; j < SIZE; j++) {
            if (nomes[i] > nomes[j]) {
               temp = nomes[i];
               nomes[i] = nomes[j];
               nomes[j] = temp; 
            } // end if
         } // end for
      } // end for i
      for(j = 0; j < SIZE; j++) {
         System.out.printf("%s ", nomes[j]);
      } // end for nom3w

   } // end main
} // end class