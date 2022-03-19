public class FuncaoCrescimento12 {
    /**
     * 1.3.12 Escreva um programa FunctionGrowth que imprima uma 
     * tabela dos valores log n, n, n loge n, n2, n3 e 2n 
     * para n = 16, 32, 64, ... , 2.048. 
     * Use tabulações (caracteres \t) para alinhar as colunas.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 82). 
     * Pearson Educação. Edição do Kindle.
     */
    public static void main(String[] args) {
        
        // cabeçalho
        System.out.println("\nlog n \tn \tn log n\tn^2 \tn^3");
        
        for (long i = 2; i <= 2048; i *= 2) {
            System.out.print((int) Math.log(i));
            System.out.print('\t'); // tab character
            System.out.print(i);
            System.out.print('\t');             
            System.out.print((int) (i * Math.log(i)));
            System.out.print('\t');             
            System.out.print(i * i);
            System.out.print('\t');             
            System.out.print(i * i * i);
            System.out.println();
        }
    } // fim main
} // fim classe