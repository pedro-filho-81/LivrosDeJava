import java.security.SecureRandom;

public class OrdenaVetores02 {
   
   public static void main(String[] args) {
      
      // constente índice do vetor
      final int SIZE = 10; // tamanho do vetor
      // vetor
      int[] vetor = new int[SIZE];
      
      System.out.println("Vetor original:");
      // adiciona valores ao vetor
      adicionar(vetor);
      exibir(vetor);
      
      System.out.println("Vetor em ordem crescente:");
      // adiciona valores ao vetor
      ordenar(vetor);
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
      int conta = 0; // conta loop do while

      do {
         // variável recebe alea
         int valorAlea = 1 + alea.nextInt(50);
         item = 1; // indica que o valor aleatório existe

         // vetor recebe o valoe aleatório
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

         // conta repetição do loop
         conta++;

         // loop executa enquanto i for menor que o tamanho do vetor
      } while (i < vetor.length);

      System.out.println("Total de repetição para adicionar valores no vetor: " + conta + " vezes.");
   } // end adicionar

   // método ordenar
   public static void ordenar(int[] vetor) {

      // loop for para ordenar o vetor
      for(int i = 0; i < vetor.length; i++) {
         for(int j = 0; j < vetor.length; j++) {
            if (vetor[j] > vetor[i]) {
               int temp = vetor[j];
               vetor[j] = vetor[i];
               vetor[i] = temp;
            } // end if
         } // end for j
      } // end for i
   } // end ordenar

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
