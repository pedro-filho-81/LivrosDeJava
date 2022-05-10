package ExerciciosCriativos;

public class SiulacaoDeDados22 {
    /**
     * 1.4.22 Simulação de dados. 
     * O código a seguir calcula a distribuição de probabilidade 
     * exata para a soma de dois dados:
     * int[] frequências = new int[13];
     * for (int i = 1; i <= 6; i++)
     * for (int j = 1; j <= 6; j++)
     *      frequências[i+j]++;
     * probabilidades double[] = new double[13];
     * for (int k = 1; k <= 12; k++)
     *      probabilidades[k] = frequências[k] / 36,0;
     * O valor probabilidades[k] é a probabilidade de que a soma dos dados seja k. 
     * Execute experimentos que validem esse cálculo simulando n lançamentos de dados, 
     * acompanhando as frequências de ocorrência de cada valor ao calcular a soma de 
     * dois números inteiros uniformemente aleatórios entre 1 e 6. 
     * Qual deve ser o tamanho de n antes que seus resultados empíricos correspondam 
     * aos resultados exatos com três casas decimais?
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pp. 120-121). 
     * Pearson Educação. Edição do Kindle.
     * Pedro, 10/05/2022
     */
    public static void main(String[] args) {
        
        int[] frequências = new int[13];
        
        for (int i = 1; i <= 6; i++) { 
            for (int j = 1; j <= 6; j++) { 
                frequências[i+j]++;
            } // fim for j
        } // fim for i      

        for (int i = 1; i <= 6; i++) { 
            for (int j = 1; j <= 6; j++) { 
                System.out.printf("%5d", frequências[i+j]);       
            } // fim for j
            System.out.println();
        } // fim for i

        double[] probabilidades  = new double[13];

        for (int k = 1; k <= 12; k++)
            probabilidades[k] = frequências[k] / 36.0;

        for (int k = 1; k <= 12; k++)
            System.out.printf("%3d -> %9f%n", k, probabilidades[k]);

    } // fimm main    
} // fimm classe