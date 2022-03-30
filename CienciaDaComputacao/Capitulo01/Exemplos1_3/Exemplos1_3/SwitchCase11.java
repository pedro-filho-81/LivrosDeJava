import java.util.Scanner;

public class SwitchCase11 {
    /**
     * Alternar declarações. As instruções if e if-else 
     * permitem uma ou duas alternativas. Às vezes, um cálculo 
     * sugere naturalmente mais de duas alternativas mutuamente 
     * exclusivas. Java fornece a instrução switch para esta finalidade. 
     * NameOfDay.java recebe um inteiro entre 0 e 6 como argumento 
     * de linha de comando e usa uma instrução switch para imprimir 
     * o nome correspondente do dia (domingo a sábado).
     * 30/03/2022
     */
    public static void main(String[] args) {

        // objeto Scanner
        Scanner input = new Scanner(System.in);

        // entrada do usuário
        System.out.print("Qual o dia da semana existe entre os números (1 e 7 inclusive)? ");
        int dia = input.nextInt();

        // caso dia seja
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Qinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Não é um dia da semana.");
                break;
        } // fim switch
    } // fim main
} // fim classe