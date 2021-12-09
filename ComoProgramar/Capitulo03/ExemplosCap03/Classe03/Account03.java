// Fig. 3.8: Account.java
// Classe de conta com um saldo variável de instância dupla e um construtor
// e método de depósito que executa a validação.
public class Account03 {
   private String name; // instance variable
   private double balance; // instance variable

   // Account constructor that receives two parameters
   // construtor da conta que recebe dois parâmetro
   public Account03(String name, double balance) {
      // atribui o nome para a variável de instância nome
      this.name = name; // assign name to instance variable name

      // validate that the balance is greater than 0.0; if it's not,
      // valida se o saldo é maior que 0,0; se não for,
      // instance variable balance keeps its default initial value of 0.0
      // o equilíbrio da variável de instância mantém seu valor inicial padrão de 0,0
      if (balance > 0.0) // if the balance is valid
         this.balance = balance; // assign it to instance variable balance
   }

   // method that deposits (adds) only a valid amount to the balance
   // método que deposita (adiciona) apenas uma quantia válida ao saldo
   public void deposit(double depositAmount) {
      if (depositAmount > 0.0) // if the depositAmount is valid
         balance = balance + depositAmount; // add it to the balance
   }

   // method returns the account balance
   public double getBalance() {
      return balance;
   }

   // method that sets the name
   public void setName(String name) {
      this.name = name;
   }

   // method that returns the name
   public String getName() {
      return name;
   }
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
