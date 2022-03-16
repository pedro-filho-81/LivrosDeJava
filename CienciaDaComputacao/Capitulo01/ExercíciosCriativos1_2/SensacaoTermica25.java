import java.util.Scanner;

public class SensacaoTermica25 {
    public static void main(String[] args) {
        // objeto Scanner
        Scanner input = new Scanner(System.in);
        
        // entrada de dados
        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperatura = input.nextDouble();

        System.out.print("Digite a velocidade dos ventos em Km/h: ");
        double velociVentos = input.nextDouble();

        // calcula a sensação termica
        double sensacao = 33 + (10 * Math.sqrt(velociVentos) + 
                        10.45 - velociVentos) * (temperatura - 33 ) / 22;
        
        // mostra resultado
        System.out.println("\nSENSAÇÃO TÉRMICA");
        System.out.printf("Com uma temperatura de %.1fºC %n", temperatura);
        System.out.printf("Velocidade dos ventos em %.1fKm/h%n", velociVentos );
        System.out.printf("Temos a sensação térmica de %.1fºC%n", sensacao);
    }
    
}
