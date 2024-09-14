package cap04_condicoes.exercicios;
/**
 * 
 * Pedro, 14/09/2024
 */
import java.util.Scanner;

public class NomeSexoDoUsuario11 {
   public static void main(String[] args) {
      
      // objeto Scanner
      Scanner input = new Scanner(System.in);

      // variáveis
      String nome = "", msg = "";
      String sexo;

      // entrada de dados
      System.out.println("\nEntrada de Dados:");
      System.out.print("Digite seu nome: ");
      nome = input.nextLine();
      System.out.print("Digite o sexo (h/H)-(f/F): ");
      sexo = input.nextLine();

      // condição
      switch (sexo) {
         case "h":
         case "H":
            msg = "Ilmo Sr. " + nome + " Bom dia!\n";
            break;

         case "f":
         case "F":
            msg = "Ilma Sra. " + nome + " Bom dia!\n";
            break;

         default:
         msg = "Sexo informado inválido.";
            break;
      } // end swhit

      // exibe resultado
      System.out.println("\nRESULTADO:");
      System.out.printf(msg + "\n");

   } // end main 
} // end class
