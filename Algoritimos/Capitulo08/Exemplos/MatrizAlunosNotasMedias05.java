package Capitulo08.Exemplos;
import java.util.Scanner;

public class MatrizAlunosNotasMedias05 {
   /**
    * Desenvolver um programa que leia os nomes de oito 
    alunos e também suas quatro notas bimestrais. Ao final, 
    deve apresentar o nome de cada aluno classificado em 
    ordem alfabética, bem como suas médias e a média geral 
    dos oito alunos. 
    JOSÉ AUGUSTO N. G. MANZANO, JAYR FIGUEIREDO DE OLIVEIRA. 
    Algoritmos (Portuguese Edition) (p. 397). 
    Editora Saraiva. Edição do Kindle. 
    01/09/2024
    */
   public static void main(String[] args) {
      
      // índices
      final int LINHAS = 2;
      final int COLUNAS = 4;

      // vetores
      String[] alunos = new String[LINHAS];
      double[] medias = new double[LINHAS];

      // matriz
      double[][] notas = new double[LINHAS][COLUNAS];

      addAlunos(alunos);
      addNotas(alunos, notas, LINHAS, COLUNAS, medias);
      exibirNotas(alunos, notas, LINHAS, COLUNAS, medias);

   } // end Main

   // adiciona nomes
   public static void addAlunos(String[] alunos) {
      
      // objeto 
      Scanner input = new Scanner(System.in);

      // cabeçalho
      System.out.println("Cadastro de Alunos:");
      // loop para adicionar nomes dos alunos
      for(int i = 0; i < alunos.length; i++) {
      
         // entrada de dados
         System.out.printf("Digite o nome do %dº aluno: ", i + 1);
         // entrada dos nomes pelo usuário
         alunos[i] = input.nextLine();

      } // end for nome

      System.out.println(); // pula linha

      // input.close(); // fecha a entrada de dados do usuário

   } // end adicionar nomes

   // adicionar médias
   public static void addNotas(String[] aluno, double[][] notas, int linha, int coluna, double[] medias) {

      // cria o objeto Scanner
      Scanner input = new Scanner(System.in);

      // variável
      double somaNotas = 0.0;
      
      System.out.println("Cadastro das notas:");
      for(int i = 0; i < linha; i++) {
         // exibe o nome do aluno
         System.out.println("Aluno: " + aluno[i]);
         for(int j = 0; j < coluna; j++) {

            // entrada de notas
            System.out.printf("%dª nota: ", j + 1);
            // recebe as notas dos alunos
            notas[i][j] = input.nextDouble(); // entrada do usuário

            // soma as notas do aluno
            somaNotas += notas[i][j];

         } // end for j

         // calcula a média dos alunos
         medias[i] = somaNotas / coluna;

         // limpa a variável somaNotas
         somaNotas = 0; // para as próximas notas

         System.out.println(); // pula linha
      } // end for i

      input.close(); // fecha o objeto Scanner
   
   } // end adicionar notas

   // exibir notas
   public static void exibirNotas(String[] alunos, double[][] notas, int linha, int coluna, double[] medias) {

      // CABEÇALHO DA TABELA
      System.out.println("\n\tRELATÓRIO DAS NOTAS");
      System.out.println("***************************************");
      System.out.print("Notas =>       N1");

      for(int k = 1; k < coluna; k++) {
         System.out.printf("%4s%d", "N", k + 1);
      } // end for k

      System.out.printf("%8s", "médias");
      System.out.println();
      System.out.println("--------------------------------------");
      
      // loop for para linhas
      for(int i = 0; i < linha; i++) {
         System.out.printf("%-10s: ", alunos[i]);
         // loop for para colunas
         for(int j = 0; j < coluna; j++) {
            System.out.printf("%5.1f", notas[i][j]);
         } // end for colunas
         System.out.printf("%7.1f%n", medias[i]);
      } // end for linhas
      System.out.println("***************************************");

   } // end exibir notas

} // end class 
