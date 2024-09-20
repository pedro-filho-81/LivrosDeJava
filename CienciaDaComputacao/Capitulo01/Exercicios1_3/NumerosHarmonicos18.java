package Exercicios1_3;

public class NumerosHarmonicos18 {
    /**
     * 1.3.18 Ao contrário dos números harmônicos, a soma 1/12 + 1/22 
     * + ... + 1/n2 converge para uma constante quando n cresce até o infinito. 
     * (Na verdade, a constante é π2/6, então esta fórmula pode ser usada para 
     * estimar o valor de π.) Qual dos seguintes laços for calcula essa soma? 
     * Suponha que n seja uma variável int inicializada em 1.000.000 e sum seja 
     * uma variável double inicializada em 0,0. uma.
     * for (int i = 1; i <= n; i++) soma += 1 / (i*i); b.
     * for (int i = 1; i <= n; i++) soma += 1,0 / i*i; c.
     * for (int i = 1; i <= n; i++) soma += 1,0 / (i*i); d.
     * for (int i = 1; i <= n; i++) soma += 1 / (1,0*i*i);
     * Sedgewick, Robert; Wayne, Kevin. Ciência da Computação (pág. 83). 
     * Pearson Educação. Edição do Kindle.
     * @param args
     */
    public static void main(String[] args) {
        
        int n = 1000000;
        double soma = 0.0;

        for (int i = 1; i <= n; i++) 
            soma += 1.0 / (i*i);
        
        System.out.printf("Soma1 = %f%n", soma);
        soma = 0.0;

        for (int i = 1; i <= n; i++) 
            soma += 1.0 / i*i;
        
        System.out.printf("Soma2 = %f%n", soma);
        soma = 0.0;

        for (int i = 1; i <= n; i++) 
            soma += 1.0 / (i*i);
        
        System.out.printf("Soma3 = %f%n", soma);
        soma = 0.0;

        for (int i = 1; i <= n; i++) 
            soma += 1.0 / (1.0*i*i);
    
        System.out.printf("Soma4 = %f%n", soma);
        soma = 0.0;
    
    } // fim main
} // fim classe