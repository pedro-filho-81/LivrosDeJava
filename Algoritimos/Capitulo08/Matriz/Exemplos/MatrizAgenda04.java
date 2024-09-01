import java.util.Scanner;

public class MatrizAgenda04 {
   /**
    * Desenvolver um programa que simule uma agenda de 
    cadastro pessoal com nome, endereço, código postal, bairro 
    e telefone de dez pessoas. Ao final, o programa deve 
    apresentar seus elementos dispostos em ordem alfabética 
    ascendente a partir do elemento (campo) nome.
    JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE OLIVEIRA. 
    Algoritmos (Portuguese Edition) (p. 390). 
    Editora Saraiva. Edição do Kindle. 
    * @param args
    31/08/2024
    */
   public static void main(String[] args) {
      // MM
      // Scanner input = new Scanner(System.in);

      // constante índice da matriz 
      final int LINHA = 3; // exibe 3 linhas
      final int COLUNA = 3; // exibe 3 colunas

      // matriz
      String[][] agenda = new String[LINHA][COLUNA];
      
      // adiciona valores a matriz
      adicionar(agenda, LINHA, COLUNA);
      
      // exibe a matriz original
      System.out.println("Original:");
      exibir(agenda, LINHA, COLUNA);

      // matriz organizada pelo tamanho das palavras
      organizar(agenda, LINHA, COLUNA);
      System.out.println("Organizada");
      exibir(agenda, LINHA, COLUNA);

      // input.close(); // FECHA O OBJETO INPUT

   } // end Main

   // adicionar nomes
   public static void adicionar(String[][] matriz, int linha, int coluna) {

      Scanner input = new Scanner(System.in);

      System.out.printf("%12s\n", "AGENDA");
      System.out.println("*******************");
      for(int i = 0; i < linha; i++) {
      
         System.out.print("Nome:"); 
         matriz[i][0] = input.nextLine();
         System.out.print("Sobrenome: ");
         matriz[i][1] = input.nextLine();
         System.out.print("Telefone: ");
         matriz[i][2] = input.nextLine();
         System.out.println("*******************");

      } // end for i
      
      input.close(); // end input
   
   } // end adicionar
   
   // organizar
   public static void organizar(String[][] matriz, int linha, int coluna) {
      for(int i = 0; i < linha; i++) {
         for(int j = 0; j < coluna; j++) {
            if (matriz[i][0].length() < matriz[j][0].length()) {
               
               // campo nome
               String temp = matriz[i][0];
               matriz[i][0] = matriz[j][0];
               matriz[j][0] = temp;

               // campo sobrenome
               String temp1 = matriz[i][1];
               matriz[i][1] = matriz[j][1];
               matriz[j][1] = temp1;
               
               // campo telefone
               String temp2 = matriz[i][2];
               matriz[i][2] = matriz[j][2];
               matriz[j][2] = temp2;

            } // end if
            
         } // end for j
      } // end for i
   } // end organizar

   // exibir
   public static void exibir(String[][] matriz, int linha, int coluna) {

      System.out.printf("%18s\n", "AGENDA");
      System.out.printf("%7s%15s%15s%n", "Nome", "Sobrenome", "Telefone");
      for(int i = 0; i < linha; i++) {
         for(int j = 0; j < coluna; j++) {
            
            // exibe
            System.out.printf("%-15s", matriz[i][j]);

         } // end for coluna
         System.out.println();
      } // end for linha
      
   } // end exibir
   
} // end class
