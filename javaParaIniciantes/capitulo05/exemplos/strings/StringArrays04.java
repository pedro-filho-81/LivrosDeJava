package javaParaIniciantes.capitulo05.exemplos.strings;
/*
 * Demonstra array de strings
 */
public class StringArrays04 {
   public static void main(String[] args) {
      
      // cria um vetor
      System.out.println("Declarando, criando e inicializando array de strings.");
      String[] strs = {"this", "is", "a", "test."};
      System.out.println("String[] strs = {\"this\", \"is\", \"a\", \"test.\"};");

      // cabeçalho
      System.out.print("\nOriginal array: ");
      // loop para exibir array
      for (String s : strs) {
         // exibe os valores de strs
         System.out.print(s + " ");
      } // end for s

      System.out.println();

      // alterando valores no array
      System.out.println("\nAlterando os elementos do array.");
      strs[1] = "was"; // altera o elemento na posição 1 do array
      System.out.println("strs[1] = \"was\";");
      
      strs[3] = "test, too!"; // altera o elemento na posição 3 do array
      System.out.println("strs[3] = \"test, too!\";");
      
      // cabeçalho
      System.out.print("\nModifed array: ");
      // loop para exibir array
      for (String s : strs) {
         // exibe os valores de strs
         System.out.print(s + " ");
      } // end for s

      System.out.println();
   } // end main
} // end class