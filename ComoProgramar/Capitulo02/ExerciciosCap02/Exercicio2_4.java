public class Exercicio2_4 {
   /*
    * 2.4 Identifique e corrija os erros em cada uma das seguintes instruções:
    a) if (c < 7); 
     System.out.println(“c is less than 7”);
     b) if (c => 7) 
     System.out.println(“c is equal to or greater than 7”)
    */
    public static void main(String[] args) {
      
      int c = 5;

      // a) if (c < 7);
      // if (c < 7); 
         // System.out.println("“c is less than 7”");
     
     // b) if (c => 7)
     // if (c => 7) 
         // System.out.println(“c is equal to or greater than 7”);

      System.out.println("""
            sendo: 
               int c = 5;
            b) if (c => 7) INSTRUÇÃO ERRADA, NA COMPILAÇÃO GERA UMA EXCEÇÃO
                  System.out.println("“c is equal to or greater than 7”");
                  Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
                     Type mismatch: cannot convert from int to boolean
                     Syntax error on token ">", delete this token
                     Syntax error on token "Invalid Character", @ expected
                     Syntax error, type annotations are illegal here
                     is cannot be resolved to a variable
                     Syntax error on token "equal", instanceof expected
                     to cannot be resolved to a type
                     Syntax error, insert ")" to complete MethodInvocation
                     Syntax error, insert ";" to complete Statement
                     greater cannot be resolved to a type
                     Syntax error on tokens, delete these tokens

                     at Exercicio2_4.main(Exercicio2_4.java:18)
            CORRETO: if(c >= 7)
            """);

            System.out.println("""
                     TRADUÇÃO:
                  Exceção no thread "main" java.lang.Error: Problemas de compilação não resolvidos:
                  Incompatibilidade de tipo: não é possível converter de int para booleano
                  Erro de sintaxe no token ">", exclua este token
                  Erro de sintaxe no token "Caractere inválido", @ esperado
                  Erro de sintaxe, anotações de tipo são ilegais aqui
                  não pode ser resolvido para uma variável
                  Erro de sintaxe no token "equal", instanceof esperado
                  não pode ser resolvido para um tipo
                  Erro de sintaxe, insira ")" para concluir MethodInvocation
                  Erro de sintaxe, insira ";" para concluir Statement
                  maior não pode ser resolvido para um tipo
                  Erro de sintaxe em tokens, exclua estes tokens

                  em Exercicio2_4.main(Exercicio2_4.java:18)
         """);
      System.out.println("\nSINTAXE CORRETA:");
      System.out.println("if (c < 7) ");
         System.out.println("“c is less than 7”");
     System.out.println("if (c >= 7) ");
     System.out.println("“c is greater than or equal to 7”\n");

      if (c < 7) 
      System.out.println("if (c < 7) ");
         System.out.println("“c is less than 7”");
     if (c >= 7) 
     System.out.println("if (c >= 7) ");
         System.out.println("“c is greater than or equal to 7”");
    }
}
