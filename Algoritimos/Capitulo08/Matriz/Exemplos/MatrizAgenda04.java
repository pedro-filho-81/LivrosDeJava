import java.util.Scanner;

public class MatrizAgenda04 {
   public static void main(String[] args) {
      // MM
      Scanner input = new Scanner(System.in);

      // constante
      final int LINHA = 2;
      final int COLUNA = 3;

      // matriz
      String[][] agenda = new String[LINHA][COLUNA];

      adicionar(agenda, LINHA, COLUNA);

   } // end Main

   // adicionar nomes
   public static void adicionar(String[][] matriz, int linha, int coluna) {

      Scanner input = new Scanner(System.in);

      System.out.printf("%12s\n", "AGENDA");
      System.out.println("*******************");
      for(int i = 0; i < linha; i++) {
         for(int j = 0; j < coluna; j++) {
            System.out.print("Nome:"); 
            matriz[i][0] = input.nextLine();
            System.out.print("Sobrenome: ");
            matriz[i][1] = input.nextLine();
            System.out.print("Telefone: ");
            matriz[i][2] = input.nextLine();
            System.out.println("*******************");
         } // end for j
      } // end for i
   } // end adicionar
   
} // end class
