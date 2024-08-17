import java.util.Scanner;
/*
 * Calcular a média das notas informadas pelo usuário
 * atribuindo as notas a 8 variáveis diferentes
 */
public class MediaGeralV1 {
   public static void main(String[] args) {
      // variável MM
      float md1, md2, md3, md4, md5, md6, md7, md8;
      float media;

      // objeto Scanner
      Scanner input = new Scanner(System.in);

      // entrada de dados
      System.out.println("Informe a nota de 8 alunos: ");
      md1 = input.nextFloat();
      md2 = input.nextFloat();
      md3 = input.nextFloat();
      md4 = input.nextFloat();
      md5 = input.nextFloat();
      md6 = input.nextFloat();
      md7 = input.nextFloat();
      md8 = input.nextFloat();

      // calcular
      media = (md1 + md2 + md3 + md4 + md5 + md6 + md7 + md8) / 8;

      // exibe o resultado
      System.out.printf("A média é: %.1f%n", media);
   } // end main
} // end class
