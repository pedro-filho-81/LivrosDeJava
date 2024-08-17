import java.util.Scanner;

public class MediaGeralV3 {
   public static void main(String[] args) {

      // vetor para 8 elementos
      double[] notas = new double[8];
      // variáveis MM
      double media, soma = 0;

      // objeto Scanner
      Scanner input = new Scanner(System.in);

      // loop para adicionar as notas
      for(int i = 0; i < 8; i++) {
         // entrada de dados
         System.out.printf("Digite a %dª nota: ", i + 1);
         // entrada do usuário
         notas[i] = input.nextDouble();
      } // end for entrada

      // loop for para exibir e somar os valores do vetor
      // cabeçalho
      System.out.print("notas = { ");
      for(int i = 0; i < 8; i++) {
         // exibe o vetor
         System.out.print(notas[i] + " ");
         // soma as notas do vetor
         soma += notas[i];
      } // end for
      System.out.println("};");

      // calcular
      media = soma / 8;

      // exibe o resultado
      System.out.printf("A média é: %.1f%n", media);
   } // end main
} // end class