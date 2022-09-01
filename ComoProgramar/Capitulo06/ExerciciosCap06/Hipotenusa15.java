import java.util.Scanner;

public class Hipotenusa15 {
    /**
     * 6.15 (Cálculos de hipotenusa) Defina um método hypotenuse que 
     * calcula a hipotenusa de um triângulo retângulo quando são dados os 
     * comprimentos dos outros dois lados. O método deve tomar dois 
     * argumentos do tipo double e retornar a hipotenusa como um double. 
     * Incorpore esse método a um aplicativo que lê valores para side1 e 
     * side2 e realiza o cálculo com o método hypotenuse. Utilize os 
     * métodos Math pow e sqrt para determinar o tamanho da hipotenusa de 
     * cada um dos triângulos na Figura 6.15. [Observação: a classe 
     * Math também fornece o método hypot para realizar esse cálculo.] 
     * Pedro, 01/09/2022
     */
    public static void main(String[] args)     
    {
        Scanner input = new Scanner(System.in);
        
        // entrada de dados
        System.out.print("Digite o valor do lado A: ");
        double ladoA = input.nextDouble();

        System.out.print("Digite o valor do lado B: ");
        double ladoB = input.nextDouble();

        // resultado
        double resultado = hipotenusa(ladoA, ladoB);

        // exibe o resultado
        System.out.printf("O valor da hipotenusa = %.2f", resultado);

    } // final principal

    public static double hipotenusa(double ladoA, double ladoB)
    {
        double hipo = Math.pow(ladoA, 2) + Math.pow(ladoB, 2);
        return Math.sqrt(hipo);

    } // final hipotenusa

} // final classe