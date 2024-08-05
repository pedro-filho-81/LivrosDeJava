package guiaDoProgramador.cap02_sintaxe;
// Saída formatada com (printf)
import java.util.Scanner;

public class P0205SaidaFormatada {
	public static void main(String a[]) {
		// cria o objeto Scanner
      Scanner sc = new Scanner(System.in); // prepara console

      // entrada de dados
		System.out.print("No final? ");
		int limite = sc.nextInt(); // entrada do usuário
		
      // variável
      int soma = 0; 

      // loop for para somar os valores
		for (int i=1; i<=limite; i++) {
         // exibe resultado parcial da soma formatada
			System.out.printf("%3da. soma parcial = %6d%n", i, soma); 
         // soma os valores de i
			soma += i;
		} // end for

      // exibe o total formatado
		System.out.printf("Soma total[0..%3d] = %6d%n", limite, soma);
		
      sc.close(); // fecha o objeto
	} // end main
} // end class