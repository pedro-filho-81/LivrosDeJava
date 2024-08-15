package javaParaIniciantes.capitulo05.exemplos.strings;

public class ConcatenaStrings03 {
   public static void main(String[] args) {
      // variáves strings
      String str1 = "One ";
      System.out.println("String str1 = \"One\";");
      
      String str2 = "Two ";
      System.out.println("String str2 = \"Two \";");
      
      String str3 = "Three ";
      System.out.println("String str3 = \"Three \";");

      // o sinal de + aqui serve para concatenar as strings
      String str4 = str1 + str2 + str3;
      System.out.println("str4 Exibe os valores das variáveis str1, 2 e 3:");
      System.out.println("String str4 = str1 + str2 + str3;");

      // imprim o resultado
      System.out.println("str4 = " + str4);
   } // end main
} // end class
