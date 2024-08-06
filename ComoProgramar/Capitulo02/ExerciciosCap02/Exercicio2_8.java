/*
 * 2.8 Escreva instruções Java que realizem cada uma das seguintes tarefas:
 * a) Exibir a mensagem “Enter an integer: “, deixando o cursor na mesma linha.
 * b) Atribuir o produto de variáveis b e c para a variável a.
 * c) Utilizar um comentário para afirmar que um programa executa um cálculo de exemplo de folha de pagamento
 */
public class Exercicio2_8 {
   public static void main(String[] args) {
      //a) Exibir a mensagem “Enter an integer: “, deixando o cursor na mesma linha.
      System.out.print("Enter an integer:\n");

      //b) Atribuir o produto de variáveis b e c para a variável a.
      int b = 10;
      int c = 20;
      int a = b + c;

      // exibe resultado
      System.out.println("int b = 10;\nint c = 20;\nint a = b + c;");
      System.out.println(b + " + " + c + " = " + (b + c));
      System.out.println("int a = " + (b + c));
   } // end main
} // end class