package javaParaIniciantes.capitulo05.exemplos.QDemo11;


public class Queue11 {

   // vetor
   char q[]; // esse array contêm uma fila
   int putloc, getloc; // os indices put e get

   // cria o construtor Quene11
   public Queue11(int size) {
      q = new char[size]; // aloca memoria para a fila
      putloc = getloc = 0; // variáveis recebem 0
   } // end construtor
   
   // insere um caractere na fila
   void put(char ch) {
      // verifica se a fila está cheia
      if (putloc == q.length) {
         System.out.println(" - Queue is full.");
         return;
      } // end if
      // adiciona um caractere ao vetor q no indice putloc++
      q[putloc++] = ch;
   } // end full

   // obtêm um caractere da fila
   char get() {
      // verifica se a fila está vazia
      if(getloc == putloc) { // se verdade
         // exibe a mensagem
         System.out.println(" - Queue is empty.");
         return (char) 0; // e retorna 0
      } // end if

      return q[getloc++];
   } // end get

} // end class
