package javaParaIniciantes.capitulo05.exemplos;

class AssingARef08 {
   public static void main(String[] args) {
      
      // variável
      int i;

      // vetores
      int[] n1 = new int[10];
      int[] n2 = new int[10];

      // loop para adicionar valor a n1
      for(i = 0; i < 10; i++) {
         n1[i] = i;
      } // end for

      for(i = 0; i < 10; i++) {
         n2[i] = i;
      } // end for

      System.out.print("Here is n1: ");  
      for(i=0; i < 10; i++)      
         System.out.print(n1[i] + " ");  
      System.out.println();  
      
      System.out.print("Here is n2: ");  
      for(i=0; i < 10; i++)  
         System.out.print(n2[i] + " ");  
      System.out.println(); 

      n2 = n1;// agora n2 referencia n1  
      System.out.print("Here is n2 after assignment:");  
      for(i=0; i < 10; i++)  
         System.out.print(n2[i] + " ");  
      
      System.out.println();  // agora opera do array n1 ao n2  
      
      n2[3] = 99;  
      
      System.out.print("Here is n1 after change through n2: ");  
      for(i=0; i < 10; i++)  
         System.out.print(n1[i] + " ");  
      
      System.out.println(); 
 
   } // end main 
} // end class