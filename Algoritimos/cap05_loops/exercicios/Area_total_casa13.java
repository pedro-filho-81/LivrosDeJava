package cap05_loops.exercicios;
/**
 * q)Escrever um programa que possibilite calcular a área 
 * total em metros de uma residência com os cômodos sala, 
 * cozinha, banheiro, dois quartos, área de serviço, 
 * quintal, garagem, entre outros que podem ser fornecidos 
 * ao programa. O programa deve solicitar a entrada do 
 * nome, da largura e do comprimento de um determinado 
 * cômodo. Em seguida, deve apresentar a área do cômodo 
 * lido e também uma mensagem solicitando ao usuário a 
 * confirmação de continuar calculando novos cômodos. Caso 
 * o usuário responda “NÃO”, o programa deve apresentar o 
 * valor total acumulado da área residencial.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) (p. 286). 
 * Editora Saraiva. Edição do Kindle. 
 * Pedro, 17/09/2024
 */

import java.util.Scanner;

public class Area_total_casa13 {
   public static void main(String[] args) {
      
      // objeto Scanner
      Scanner input = new Scanner(System.in);

      // variáveis
      String nomeDoComodo;
      double largura = 0.0f;
      double compri = 0.0f;
      double areaTotal = 0.0f;
      int resp = 1;

      while (resp == 1) {

         // entrada de dados
         System.out.print("\nÁrea de uma residência\n(casa, apartamento, etc): ");
         System.out.println("\nEntrada dos dados:");
         System.out.print("Digite o nome do cômodo: ");
         nomeDoComodo = input.nextLine();
         System.out.print("Digite a largura: ");
         largura = input.nextDouble();
         System.out.print("Digite o comprimento: ");
         compri = input.nextDouble();

         // calcular
         areaTotal = largura * compri; 

         // exibe resultado
         System.out.println("\nRelatório do(s) Cômodo(s):");
         System.out.println("Còmodo: " + nomeDoComodo);
         System.out.println("Largura: " + largura + "m");
         System.out.println("comprimento: " + compri + "m");
         System.out.printf("Área total: %.2fm²\n", areaTotal);

         // pergunta
         System.out.print("\nDeseja continuar (1 = sim/ -1 = não): ");
         resp = input.nextInt(); // resposta do usuário
         nomeDoComodo = input.nextLine(); // recebe a tecla enter
         System.out.println();
      } // end while

      input.close(); // fecha o objeto

   } // end main 
} // end class
