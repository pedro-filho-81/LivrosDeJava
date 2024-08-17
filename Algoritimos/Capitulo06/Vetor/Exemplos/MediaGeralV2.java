public class MediaGeralV2 {
   public static void main(String[] args) {

      // vetor
      double[] notas = {8.9, 9.7, 7.8, 6.5, 5.7, 9.2, 6.3, 8.4};
      // variável MM
      double media, soma = 0;

      // loop for para somar os valores do vetor
      System.out.print("notas = { ");
      for(int i = 0; i < 8; i++) {
         System.out.print(notas[i] + " ");
         soma += notas[i];
      } // end for
      System.out.println("};");

      // calcular
      media = soma / 8;

      // exibe o resultado
      System.out.printf("A média é: %.1f%n", media);
   } // end main
} // end class