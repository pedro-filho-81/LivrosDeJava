import java.util.Scanner;

public class Fatoracao001 {
    
    public static void main(String[] args) {

        // cria o objeto da classe Scanner e inicializa
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite um número: ");
        // command-line argument
        long n = input.nextInt();

        System.out.print("A fatoração de " + n + " é: ");

        // for each potential factor
        for (long factor = 2; factor <= n / factor; factor++) {
 
            // if factor is a factor of n, repeatedly divide it out
            while (n % factor == 0) {
                System.out.print(factor + " "); 
                n /= factor;
            } // fim while
             
        } // fim for

        // if biggest factor occurs only once, n > 1
        if (n > 1) System.out.println(n);
        else       System.out.println();

        input.close();
        
    } // fim main
} // fim classe