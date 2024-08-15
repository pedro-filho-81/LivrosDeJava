package javaParaIniciantes.capitulo05.exemplos.QDemo11;

public class QDemo11 {
   public static void main(String[] args) {
      Queue11 bigQ = new Queue11(100);
      Queue11 smallQ = new Queue11(4);
      char ch;
      int i;

      System.out.println("Using bigQ to store the alphabet.");
      // insere alguns valores em bigQ 
      for(i = 0; i < 26; i++)
         bigQ.put((char) ('A' + i));

      // recupera e exibe elementos de bigQ
      System.out.print("Contents of bigQ: ");
      for(i = 0; i < 26; i++) {
         ch = bigQ.get();
         if (ch != (char) 0) {
            System.out.print(ch + " ");
         } // end if

         // System.out.println();

         System.out.println("Using smallQ to generate errors.");  
         // Agora, usa smallQ para gerar alguns erros  
         for(i = 0; i < 5; i++) {  
            System.out.print("Attempting to store " +  (char) ('Z' - i)); 
            
            smallQ.put((char) ('Z' - i));  
            
            System.out.println();  
         } // end for erro
         
         System.out.println();

         // mais erros em smallQ  
         System.out.print("Contents of smallQ:");  
         for(i=0; i < 5; i++) {  
            ch = smallQ.get();  
            if(ch != (char) 0) 
               System.out.print(ch); 
         } // end for
      } // end for geral
      
      System.out.println("\nUsing gihQ");

   } // end main
} // end class
