public class Tarefa11 {
    /**
     * 7.11 Escreva instruções que realizam as seguintes operações 
     * de um array unidimensional: 
     * a) Configure os 10 elementos do array de inteiros counts como zeros.
     * b) Adicione um a cada um dos 15 elementos do array de inteiros bonus.
     * c) Exiba os cinco valores de array de inteiros bestScores em formato de coluna.
     * Pedro, 22/06/2022
     */
    public static void main(String[] args) {
     
        //* a) Configure os 10 elementos do array de inteiros counts como zeros.
        int[] counts = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        
        //b) Adicione um a cada um dos 15 elementos do array de inteiros bonus.
        int[] bonus = new int[15];
        // loop para dicionar valores ao vetor
        for(int i = 0; i < bonus.length; i++) { 
            bonus[i] = i; // adiciona valores ao vetor
            bonus[i] += 1; // soma 1 aos valores do vetor
        } // fi for i
        
        //c) Exiba os cinco valores de array de inteiros bestScores em formato de coluna.
        int[] bestScores = new int[15];
        // adiciona valores ao vetor
        for(int i = 0; i < bestScores.length; i++) {
            bestScores[i] = i * 2;
        } // fim for i
        // mostrar valores do vetor
        // loop para mostrar os 5 primmeiros valores de bestScores
        for(int j = 0; j < 5; j++) {
            // imprime
            System.out.println(bestScores[j]);
        } // fimm for j
     
    } // fim main
} // fim classe