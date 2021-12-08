// Fig. 3.1: Account.java
// A Classe Account que contém uma variável de instância nome
// e métodos que configura e obtem seu valor

public class Account01 {
   private String name; // variável de instância nome

   // método para configurar o nome do objeto
   // usamos a palavra-chave THIS para referenciar a variável de instância
   // ou seja, evita-se a proliferação de nomes de variável
   public void setName(String name) {
      this.name = name; // armazena o nome
   } // fim setName

   // method to retrieve the name from the object
   // método para recuperar o nome do objeto
   public String getName() {
      // retorna o valor do nome para o chamador
      return name; // return value of name to caller
   } // fim get

} // end class Account

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and *
 * Pearson Education, Inc. All Rights Reserved. *
 * *
 * DISCLAIMER: The authors and publisher of this book have used their *
 * best efforts in preparing the book. These efforts include the *
 * development, research, and testing of the theories and programs *
 * to determine their effectiveness. The authors and publisher make *
 * no warranty of any kind, expressed or implied, with regard to these *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or *
 * consequential damages in connection with, or arising out of, the *
 * furnishing, performance, or use of these programs. *
 *************************************************************************/
