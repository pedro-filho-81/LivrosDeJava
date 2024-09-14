import java.util.Scanner;

public class NotasDosAlunos02 {
    /**
     * Desenvolver um programa que leia os nomes de oito alunos
     * e também suas quatro notas bimestrais. Ao final, deve apresentar
     * o nome de cada aluno classificado em ordem alfabética,
     * bem como suas médias e a média geral dos oito alunos.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 397).
     * Editora Saraiva. Edição do Kindle.
     * 29/04/2022
     */
    public static void main(String[] args) {

        // constantes
        final int LINHA = 8;
        final int COLUNA = 4;

        // matrizes
        String[] alunos = new String[LINHA];
        double[][] notas = new double[LINHA][COLUNA];
        double[] medias = new double[LINHA];

        // chamar adicionar nomes
        adicionarNomes(alunos);
        adicionarNotas(notas, medias);

        System.out.printf("\n%s%18s%22s\n", "Alunos", "Notas", "Médias");
        System.out.println("***********************************************");
        mostrarTudo(alunos, notas, medias);

    } // fim main

    public static void adicionarNomes(String[] vetor) {

        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        for (int i = 0; i < 8; i++) {
            System.out.printf("Infore o nome do %d aluno: ", i + 1);
            String nome = input.nextLine();
            vetor[i] = nome;
        } // fim for
    } // fim adicionar nomes

    // adicionar notas
    public static void adicionarNotas(double[][] matriz, double[] vetor) {

        Scanner input = new Scanner(System.in);

        // variáveis
        double somaNotas = 0.0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.printf("Digita a nota da linha %d coluna %d: ", i, j);
                double nota = input.nextDouble();
                matriz[i][j] = nota;
                somaNotas += matriz[i][j];

            } // fim for j

            vetor[i] = somaNotas / 4;

            somaNotas = 0.0;

            System.out.println();

        } // fim for i
    } // 0 fim adicionar notas

    // mostrar tudo
    public static void mostrarTudo(String[] nomes, double[][] notas, double[] medias) {

        double somaMedia = 0.0;

        for (int i = 0; i < 8; i++) {

            System.out.printf("%-8s  ", nomes[i]);

            for (int j = 0; j < 4; j++) {
                System.out.printf("%7.1f", notas[i][j]);
            } // fim for j

            System.out.printf("%7.1f%n", medias[i]);
            somaMedia += medias[i];
        } // fim for i

        System.out.println("***********************************************");

        double totalDaMedia = somaMedia / 8;

        System.out.printf("Media geral: %5.1f\n", totalDaMedia);

    } // fim mostrar tudo

} // fim class