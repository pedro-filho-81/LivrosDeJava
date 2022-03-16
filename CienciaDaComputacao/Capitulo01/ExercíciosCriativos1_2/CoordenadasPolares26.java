import java.util.Scanner;

public class CoordenadasPolares26 {
    public static void main(String[] args) {
        
        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite o valor de x: ");
        double x = input.nextDouble();
        System.out.print("Digite o valor de Y: ");
        double y = input.nextDouble();

        // calcular
        double raio = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);

        // mostra o resultado
        System.out.printf("Raio = %.2f%n", raio);
        System.out.printf("Theta = %f%n", theta);        
    } // fim main    
} // fim classe
