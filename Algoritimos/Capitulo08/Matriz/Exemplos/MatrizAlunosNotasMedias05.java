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
      final int LINHAS = 8;
      final int COLUNAS = 4;

      // vetores
      String[] alunos = new String[LINHAS];
      double[] medias = new double[LINHAS];

      // matriz
      double[][] notas = new double[LINHAS][COLUNAS];

      adicionarAlunos(alunos);
      adicionarNotas(notas, LINHAS, COLUNAS, medias);
   
   } // end Main

   // adiciona nomes
   public static void adicionarAlunos(String[] alunos) {
      
      // objeto 
      Scanner input = new Scanner(System.in);
      
      // loop para adicionar nomes dos alunos
      for(int i = 0; i < alunos.length; i++) {
      
         // entrada de dados
         System.out.printf("Digite o nome do %dº aluno: ", i + 1);
         // entrada dos nomes pelo usuário
         alunos[i] = input.nextLine();
      } // end for nome

      input.close(); // fecha a entrada de dados do usuário

   } // end adicionar nomes

   // adicionar médias
   public static void adicionarNotas(double[][] notas, int linha, int coluna, double[] medias) {

   } // end adicionar notas

} // end class 
