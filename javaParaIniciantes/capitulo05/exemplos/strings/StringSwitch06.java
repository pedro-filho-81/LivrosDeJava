package javaParaIniciantes.capitulo05.exemplos.strings;
/*
 * Usa uma string para controlar a instrução switch
 */
public class StringSwitch06 {
   public static void main(String[] args) {
      
      // variável
      String command = "cancel";

      switch (command) {
         case "connect":
            System.out.println("Connecting");
            break;

         case "cancel":
            System.out.println("Canceling");
            break;

         case "disconnect":
            System.out.println("Disconnecting");
            break;
      
         default:
            System.out.println("Command Erro!");
            break;
      } // end switch
   } // end main
} // end class
