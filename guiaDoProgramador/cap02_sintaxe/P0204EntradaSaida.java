package guiaDoProgramador.cap02_sintaxe;

import java.util.Scanner; // importação da classe Scanner do pacote java.util

public class P0204EntradaSaida {
	public static void main (String args[]) {

      System.out.println("Ola!"); // Mensagem inicial
		
      // entrada de dados
      System.out.print("Digite um inteiro: "); // Exibe mensagem
		Scanner s = new Scanner(System.in); // Prepara entrada de dados
		int valor = s.nextInt();	 // Declara e inicia variável
		
      // exibe resultado
      System.out.println("Valor = " + valor); // Exibe valor lido
		s.close(); // Fecha objeto leitor
	}	// end main 
} // end class