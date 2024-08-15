package javaParaIniciantes.capitulo05.exemplos.strings;
/*
 * Algumas operações com Strings
 */
public class StrOps02 {
   public static void main(String[] args) {
      String str1 = "When is comes to Web programming, Java is #1.";
      String str2 = new String(str1);
      String str3 = "Java strings are powerful.";
      int result, idx;
      char ch;

      // tamanho de str1
      System.out.printf("str1 = \"%s\"\n", str1);
      System.out.printf("str1 tem %d caracteres.\n", str1.length());

      System.out.println("\nExibe os caracteres da string.");
      // exibe um caractere de cada vez de str1
      for(int i = 0; i < str1.length(); i++)
         // método charAt(i) exibe cada caractere do testo
         System.out.print(str1.charAt(i) + " ");

      System.out.println();

      System.out.printf("\nstr2 = \"%s\"\n", str2);
      // verifica igualdade entre str1 e str2
      // se str1 igual a str2
      if (str1.equals(str2)) { // se verdade
         // imprime
         System.out.println("str1 equals str2");
      } else { // se falso
         // imprima
         System.out.println("str1 does not equqls str2");
      } // end if else equals

      // verifica se str1 é igual a str3
      System.out.printf("\nstr3 = \"%s\"\n", str3);
      // verifica igualdade entre str1 e str2
      // se str1 igual a str2
      if (str1.equals(str3)) { // se verdade
         // imprime
         System.out.println("str1 equals str3");
      } else { // se falso
         // imprima
         System.out.println("str1 does not equqls str3");
      } // end if else equals

      // compara str1 com str3
      result = str1.compareTo(str3);
      // if resul equals 0
      if(result == 0) {
         // imprima
         System.out.println("str1 and str3 are equals");
      } else if (result < 0) { // se result menor que 0
         // imprima isso
         System.out.println("str1 is less then str3");
      } else { // se não
         // imprima isso
         System.out.println("str1 greater then str3");
      } // end if else if else

      // atribui uma nova string a str2
      str2 = "One Two Three One";
      
      idx = str2.indexOf("One");
      System.out.println("Index of first occorrence of One: " + idx);

      idx = str2.lastIndexOf("One");
      System.out.println("Index of last occorrence of One: " + idx);

   } // end main
} // end class
