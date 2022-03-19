public class Fibonacci14 {
    /**
     * 1.3.14 O que o fragmento de código a seguir imprime?
     * int f = 0, g = 1;
     * for (int i = 0; i <= 15; i++)
     * {
     * System.out.println(f);
     * f = f + g;
     * g = f - g;
     * }
     * Solução. Até mesmo um programador experiente lhe dirá que 
     * a única maneira de entender um programa como esse é rastreá-lo. 
     * Ao fazer isso, você verá que ele imprime os valores 
     * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 134, 233, 377 e 610. 
     * Esses números são os primeiros dezesseis da famosa sequência de 
     * Fibonacci, que são definidas pelas seguintes fórmulas: 
     * F0 = 0, F1 = 1 e Fn = Fn-1 + Fn-2 para n > 1.
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 82). 
     * Pearson Educação. Edição do Kindle.
     * @param args
     */
    public static void main(String[] args) {
        
        // variáveis
        int f = 0, g = 1;
        
        // loop para mostrar 16 números
        for (int i = 0; i <= 30; i++)
        {
            // mostra o valor de f
            System.out.println(f);

            f += g; // soma o valor de g a f
            
            g = f - g; // g recebe o valor de f menos g
        }  // fim for
    } // fim main
} // fim classe