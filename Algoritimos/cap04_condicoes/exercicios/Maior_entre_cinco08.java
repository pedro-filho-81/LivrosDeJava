package cap04_condicoes.exercicios;
/**
 * i)Ler cinco valores numéricos inteiros 
 * (variáveis A, B, C, D e E), identificar 
 * e apresentar o maior e o menor valores 
 * informados. Não execute a ordenação dos 
 * valores como no exercício “f”.
 * JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE 
 * OLIVEIRA. Algoritmos (Portuguese Edition) (p. 221). 
 * Editora Saraiva. Edição do Kindle. 
 * Pedro, 14/09/2024
 */
import java.util.Scanner;

public class Maior_entre_cinco08 {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);

      // variáveis
      int a, b, c, d, e, f;
      int maior;
      String msg = "";

      // entrada de dados
      System.out.println("Entrada dos dados");
      System.out.print("Digite  o valor de A: ");
      a = input.nextInt();
      System.out.print("Digite o valor de B: ");
      b = input.nextInt();
      System.out.print("Digite o valor de C: ");
      c = input.nextInt();
      System.out.print("Digite o valor de D: ");
      d = input.nextInt();
      System.out.print("Digite o valor de E: ");
      e = input.nextInt();
  
      maior = e; // o maior é (e)

      // CONDIÇÕES
      if(a > b && a > c && a > e) {
         maior = a;
         msg = a + " é o maior";   
      } else if(b > a && b > c && b > e) {
         maior = b;
         msg = b + " é o maior";
      } else if(c > b && c > a && c > e) {
         maior = c;
         msg = c + " é o maior";
      } else if(d > b && d > c && d > e) {
         maior = d;
         msg = d + " é o maior";
      } else if(e > b && e > c && e > d) {
         maior = e;
         msg = e + " é o maior";
      } // end else

      // exibe resultado
      System.out.println("\nRESULTADO: ");
      System.out.printf("%s%n%n", msg);

      input.close(); // end input

   } // end main      
}
