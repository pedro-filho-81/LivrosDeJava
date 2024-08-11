package help_java;                              
/*
 * Este projeto constrói um sistema de ajuda simples que exibe a sintaxe 
 * das  instruções de controle Java. Nessa primeira versão do programa, 
 * só há ajuda disponível  para as instruções if e switch.
 * Schildt, Herbert. Java para iniciantes (Portuguese Edition) (p. 72). 
 * Edição do Kindle. 
 */
import java.io.IOException;

public class Help01 {
   public static void main(String[] args) throws IOException {
      
      // menu help
      System.out.print("""
                 Menu
            ****************     
               Help on:
                  1. if
                  2. switch
            *****************
            """);
            // opção
      System.out.print("Choice on: ");

      // variável
      char choice = (char) System.in.read();
      // opções da escolha
      switch (choice) { // inicio do bloco switch
         case '1':
         System.out.println("""
               The if(condição):
                  Se a condição do IF for verdadeira 
                  a instrução será execurada, se não, ou seja,
                  se falso o ELSE será executado.
               if(condition)  // se a condição for verdadeira
               {              // inicio do bloco if
                  statement;  // executa essa instrução
               } else         // se for falsa
               {              // inicio do bloco else
                  statement;  // executa essa instrução
               }              // fim do bloco if - else
               """);
            System.out.println("\n");
            break;
         
            case '2':
            System.out.println("""
                  The switch(expressão)
                     O valor da expressão é comparado com os valores de cada CASE. 
                     Se houver uma correspondência, o bloco de código associado será executado.
                     As palavras-chave BREAK e DEFAULT são opcionais.
                     BREAK sai instrução, do loop, etc.
                     DEFAULT captura escolhas inválidas. Se o usuário inserir 3, 
                     não terá um CASE correspondente, isso fará a
                     sequência DEFAULE ser executada.

                  switch (expressão) 
                  {                 // inicio do bloco switch
                     case 1:        // Se o valor da expressao for 1
                        statement;  // essa(s) instruções seral executadas
                        break;      // e sai de switch
                  
                     case 2:        // caso o valor da expressão for 2
                        statement;  // essa(s) instruções serão executadas
                        break;      // e sai do switch

                     default:       // caso o valor da expressão 
                                       seja diferente de 1 ou 2
                                    // exibe essa mensagem
                        System.out.println("Selection not found.");
                        statement;  // essa instrução será executada
                        break;      // e sai do switch, instrução opcional
                  } // fim do bloco switch
                  """); // fim
         default:
            break;
      } // end switch
   } // end main
} // end clas
