/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exp5_10;

/**
 * Operadores lógicos do java
 * @author 15/01/2022
 */
public class Exp5_10 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // cria a tabela-verdade para operador && lógico (E condicional )
        System.out.printf("%s%n%s:  %6b%n%s:  %7b%n%s:  %6b%n%s: %7b%n%n",
                                       "Condicional E (&&)", "false && false", (false && false),
                                       "false && true", (false && true),
                                       "true  && false", (true && false),
                                       "true  && true", (true && true) );       
         
        // cria a tabela-verdade para operador || lógico (OU condicional )
        System.out.printf("%s%n%s:  %6b%n%s:  %6b%n%s:  %5b%n%s: %7b%n%n",
                                       "Condicional OU ( || )", "false || false", (false || false),
                                       "false || true", (false || true),
                                       "true  || false", (true || false),
                                       "true  || true", (true || true) );
         
        // cria a tabela-verdade para operador & lógico (E Lógico booleano )
        System.out.printf("%s%n%s:  %6b%n%s:  %7b%n%s:  %6b%n%s: %7b%n%n",
                                       "Lógico booleano E (&)", "false & false", (false & false),
                                       "false & true", (false & true),
                                       "true  & false", (true & false),
                                       "true  & true", (true & true) );
       
        // cria a tabela-verdade para operador | lógico (OU Inclusivo lógico booleano )
        System.out.printf("%s%n%s:  %6b%n%s:  %6b%n%s:  %5b%n%s: %7b%n%n",
                                       "Inclusivo lógico booleano OU ( | )", "false | false", (false | false),
                                       "false | true", (false | true),
                                       "true  | false", (true | false),
                                       "true  | true", (true | true) );
         
        // cria a tabela-verdade para operador ^ lógico (OU Exclusivo lógico booleano )
        System.out.printf("%s%n%s:  %6b%n%s:  %6b%n%s:  %5b%n%s: %8b%n%n",
                                       "Exclusivo lógico booleano OU ( ^ )", "false ^ false", (false ^ false),
                                       "false ^ true", (false ^ true),
                                       "true  ^ false", (true ^ false),
                                       "true  ^ true", (true ^ true) );
         
        // cria a tabela-verdade para operador ! lógico ( ! Negação lógica )
        System.out.printf("%s%n%s:  %6b%n%s:  %8b%n:",
                                       "Negação lógica  ( ! )",
                                       "!false", ( !false ),
                                       "!true", ( !true)  );      
    } // fim main    
} // fim classe
