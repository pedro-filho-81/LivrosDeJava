public class ListaDeArgumentos14 {
    public static double media(double... numeros) {

        // variável
        double total = 0.0;

        for(double valor : numeros) {
            total += valor;
        } // fim for

        // retorne o total
        return total / numeros.length;
    } // fim media

    public static void main(String[] args) {
        
        double d1 = 10.00;
        double d2 = 20.00;
        double d3 = 30.00;
        double d4 = 40.00;
        double d5 = 50.00;

        System.out.printf("d1 = %.1f%nd2 = %.1f%nd3 = %.1f%nd4 = %.1f%nd5 = %.1f%n",
                            d1, d2, d3, d4, d5);
        System.out.printf("A media de d1 e d2 = %.1f%n", media(d1, d2));
        System.out.printf("A media de d1, d2 e d3 = %.1f%n", media(d1, d2, d3));
        System.out.printf("A media de d1, d2, d3 e d4 = %.1f%n", media(d1, d2, d3, d4));
        System.out.printf("A media de d1, d2, d3, d4 e d5 = %.1f%n", media(d1, d2, d3, d4, d5));


    }
    
}
