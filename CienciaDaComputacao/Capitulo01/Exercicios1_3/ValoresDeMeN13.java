public class ValoresDeMeN13 {
    /**
     * 1.3.13 Quais são os valores de m e n após executar 
     * o código a seguir? 
     * int n = 123456789;
     * intm = 0;
     * enquanto (n != 0)
     * {
     * m = (10 * m) + (n % 10);
     * n = n/10;
     * }
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 82). 
     * Pearson Educação. Edição do Kindle.
     * @autor Pedro 19/03/2022
     */
    public static void main(String[] args) {
        // vriáveis
        int n = 123456789;
        int m = 0;

        // cabeçalho
        System.out.printf("%10s%10s%n", "M", "N");

        // loop enquanto n diferente de 0
        while (n != 0)
        {
            m = (10 * m) + (n % 10);
            n = n / 10;
            System.out.printf("%10d%10d%n", m, n);
        } // fim while
    } // fim main    
} // fim classe