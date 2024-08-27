import java.security.SecureRandom;

public class MelhorandoAddValores01 {
   public static void main(String[] args) {
      
      // constente índice do vetor
      final int SIZE = 10; // tamanho do vetor
      // vetor
      int[] vetor = new int[SIZE];
      
      System.out.println("Vetor:");
      // adiciona valores ao vetor
      adicionar(vetor);
      exibir(vetor);

   } // end Main

   // Método adicionar, não repete valores
   public static void adicionar(int[] vetor) {

      // objeto
      SecureRandom alea = new SecureRandom();

      // variáveis
      int item = 0;
      int i = 0;
      int j = 0;

      do {
         // variável recebe alea
         int valorAlea = 1 + alea.nextInt(50);
         item = 1; // indica que o valor aleatório existe

         vetor[i] = valorAlea;
         item = 0; // indica que o valor aleatória não existe

         // loop for para pesquisar valores iguais 
         for(j = 0; j < i; j++) {
            // verifica se os valores dos vetores são iguais
            if (vetor[j] == vetor[i]) {
               // item recebe 1 e o loop do while se repete sem a incrementação
               item = 1;
            } // end if
         } // end for

         // verifica se o item existe ou não exixte no vetor,
         // ou seja se item = 1, exixte o valor
         // se o item = 0, não existe o valor
         if (item == 0) {
            // incrementa o contador i em 1
            i++;
         } // end if

         // loop executa enquanto i for menor que o tamanho do vetor
      } while (i < vetor.length);

   } // end adicionar

   // método exibir
   public static void exibir(int[] vetor) {
      System.out.print("{");
      // loop for
      for(int i = 0; i < vetor.length; i++) {
         System.out.printf("%3d", vetor[i]);
      } // end for
      System.out.println(" };");
   } // end exibir
   
} // end class
