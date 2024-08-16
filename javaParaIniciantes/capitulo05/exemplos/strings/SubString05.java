package javaParaIniciantes.capitulo05.exemplos.strings;
/*
 * Usando substring()
 */
public class SubString05 {
   public static void main(String[] args) {
      
      // variável
      String originalString = "Java make the move web.";
      System.out.println("O método substring() informa para mostrar da posição x até a posição y");
      System.out.println("String subStrint = originalString.substring(5, 18);");
      String subStrint = originalString.substring(5, 18);

      System.out.println("String original: " + originalString);

      System.out.println("SubString: " + subStrint);
   } // end main
} // end class
