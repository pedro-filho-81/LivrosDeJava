package javaParaIniciantes.capitulo05.exemplos.strings;
/*
 * Introduzindo strings
 */
public class StringDemo01 {
   public static void main(String[] args) {
      // criando o objeto string
      String str1 = new String("Java strings are objects");
      String str2 = "They are constructed various weys.";
      // str3 exibe o conteúdo do objeto str2
      String str3 = new String(str2);

      // exebe conteúdo dos objetos strings
      System.out.printf("\"%s\" tem %d caracteres.%n", str1, str1.length());
      System.out.printf("\"%s\"%nEssa string tem %d caracteres.\n", str2, str2.length());
      System.out.println(str3);
   } // end main
} // end class
