package javaParaIniciantes.capitulo05.exemplos.strings;
/*
 * Exibe todas as informações de linha de comando
 */
public class CLDeo07 {
   public static void main(String[] args) {
      System.out.println("There are " + args.length + " command-line arguments.");

      System.out.println("They are: ");
      for(int i = 0; i < args.length; i++) {
         System.out.println("args[" + i + "]: " + args[i]);
      }
   }
}
