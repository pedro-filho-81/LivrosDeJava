import java.security.SecureRandom;
import java.util.Scanner;

public class PesquisaBinariaVtrC04 {
    /**
     * Elaborar um programa que leia uma matriz A com 15 elementos inteiros 
     * e uma matriz B com 35 elementos inteiros. Construir uma matriz C de 
     * mesmos tipo e dimensão que seja formada pela junção dos elementos das 
     * matrizes A e B de forma que possa armazenar 50 elementos. 
     * Montar o trecho de pesquisa binária para pesquisar os elementos existentes 
     * na matriz C.
     * JOSE AUGUSTO NAVARRO GARCIA MANZANO. Algoritmos (p. 369). 
     * Editora Saraiva. Edição do Kindle. 
     * 28/02/2022
     */
    public static void main(String[] args) {
        
        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // vetores
        int[] vetorA = new int[15];
        int[] vetorB = new int[35];
        int[] vetorC = new int[50];

        System.out.println("\nVetorA:");
        // adicionar valores aos vetores
        adicionar(vetorA);
        mostrar(vetorA);

        System.out.println("\nVetorB:");
        // adicionar valores aos vetores
        adicionar(vetorB);
        mostrar(vetorB);

        System.out.println("\nVetorC:");
        // adicionar valor ao vetorC
        adicionarNoVtrC(vetorA, vetorB, vetorC);
        // colocar em ordem o vetor C
        ordenar(vetorC);
        // mostrar o vetor C
        mostrar(vetorC);

        // entrada de dados
        System.out.print("\nDigite o valor inteiro a pesquisar: ");
        // entrada do usuário
        int valor = input.nextInt();
        // variável recebe o valor retornado do método pesquisa binária
        int elemento = pesquisaBinaria(vetorC, valor, 0, vetorC.length);
        // verifica se o elemento retornado pelo método é diferente de menos 1
        if(elemento != -1) { // se verdade
            // imprime a mensage
            System.out.printf("%n%3d encontrado na posição %3d\n", valor, elemento);
        } // fimm if
        // se não
        else {
            // imprime a mensagem
            System.out.printf("%n%3d não encontrado\n", valor);
        } // fim else
        
    } // fim main

    // método adicionar
    public static void adicionar(int[] vetor) {
        
        // cria objeto SecureRandom
        SecureRandom aleatorio = new SecureRandom();

        // loop para adicionar valores ao vetor
        for(int i = 0; i < vetor.length; i++) {
            // vetor recebe valor aleatório
            vetor[i] = 1 + aleatorio.nextInt(50);
        } // fimm for
    } // fimm adicionar

    // método para mmostrar valores do vetor
    public static void mostrar(int[] vetor) {

        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("%3d", vetor[i]);
        } // fim for
    } // fimm mostrar

    // método ordenar
    public static void ordenar(int[] vetor) {
        
        for(int i = 0; i < vetor.length; i++) {
            for(int j = 0; j < vetor.length; j++) {
                if(vetor[i] < vetor[j]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = temp;
                } // fimm if
            } // fim for j
        } // fi for i
    } // fim ordenar

    // método pesquisa binária
    public static int pesquisaBinaria(int[] vetor, int pesquisa, int inicio, int fim) {

        int meio = 0;

        while(inicio <= fim) {

            meio = (inicio + fim) / 2;

            if( vetor[meio] == pesquisa ) {
                return meio + 1;
            } // fim if
            else if(pesquisa < vetor[meio]) {
                fim = meio - 1;
            } // fim else if
            else {
                inicio = meio + 1;
            } // fim else
        } // fim while

        return -1;
        
    } // fim pesquisa binária

    // método adicionar valor no vetor C
    public static void adicionarNoVtrC(int[] vetorA, int[] vetorB, int[] vetorC) {
        for(int i = 0; i < vetorC.length; i++) {
            
            if(i < 15) {
                vetorC[i] = vetorA[i];
            } // fim if
            else {
                vetorC[i] = vetorB[i - 15];
            } // fim else

        } // fimm for
    } // fim mmétodo adicionar valor no vetor C

} // fim classe
