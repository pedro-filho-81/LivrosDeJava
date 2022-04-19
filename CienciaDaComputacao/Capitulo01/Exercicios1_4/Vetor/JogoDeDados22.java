package Vetor;

public class JogoDeDados22 {
    /**
     * Exercícios criativos
     * 1.4.22 Simulação de dados.
     * O código a seguir calcula a distribuição de probabilidade exata 
     * para a soma de dois dados: Clique aqui para ver a imagem do código
     * int[] frequências = new int[13];
     * for (int i = 1; i <= 6; i++)
     *    for (int j = 1; j <= 6; j++)
     *      frequências[i+j]++;
     * probabilidades double[] = new double[13];
     * for (int k = 1; k <= 12; k++)
     * probabilidades[k] = frequências[k] / 36,0;
     * O valor probabilidades[k] é a probabilidade de que a soma dos dados seja k. 
     * Execute experimentos que validem esse cálculo simulando n lançamentos de 
     * dados, acompanhando as frequências de ocorrência de cada valor ao calcular 
     * a soma de dois números inteiros uniformemente aleatórios entre 1 e 6. 
     * Qual deve ser o tamanho de n antes que seus resultados empíricos correspondam 
     * aos resultados exatos com três casas decimais?
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 121). 
     * Pearson Educação. Edição do Kindle.
     * Pedro, 19/04/2022
     */
    public static void main(String[] args) {
        
        int[] frequencias = new int[13];
        for (int i = 1; i <= 6; i++)
            for (int j = 1; j <=6; j++)
                frequencias[i+j]++;
        mostrar(frequencias);
        
        System.out.println();
        
        double[] probabilidades  = new double[13];
        for (int k = 1; k <= 12; k++)
            probabilidades[k] = frequencias[k] / 36.0;
        
        mostrarDouble(probabilidades);

    } // fim main

        public static void mostrar(int[] vetor) {
            for(int i = 0; i < vetor.length; i++) {
                System.out.printf("%3d", vetor[i]);
            } // fim mostrar
        } // fim mostrar

    
        public static void mostrarDouble(double[] vetor) {
            for(int i = 0; i < vetor.length; i++) {
                System.out.printf("%5.1f", vetor[i]);
            } // fim mostrar
        } // fim mostrar double
    
} // fim classe