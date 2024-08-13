package javaParaIniciantes.capitulo05.exemplos;

public class LengthDemo09 {
   public static void main(String[] args) {
      
      // vetores
      int list[] = new int[10];
      int nums[] = {1, 2, 3};

      // matriz
      int table[][] = { // uma tabela de tamanho variável
         {1, 2, 3},
         {4, 5},
         {6, 7, 8, 9}
      };
       // exibe o resultado
       System.out.println("Length of list is: " + list.length);
       System.out.println("Length of nums is: " + nums.length);
       System.out.println("Length of table is: " + table.length);
       System.out.println("Length of table[0] is: " + table[0].length);
       System.out.println("Length of table[1] is: " + table[1].length);
       System.out.println("Length of table[2] is: " + table[2].length);

       // length para controla o loop for
       for(int i = 0; i < list.length; i++) {
         list[i] = i * i;
       }

       System.out.print("Here is list: ");
       // usa length para exibir a lista
       for(int i = 0; i < list.length; i++) {
         System.out.print(list[i] + " ");
       }
       System.out.println();
       
   } // end main
} // end class
