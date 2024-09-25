package javaParaIniciantes.capitulo01.exemplos;
/**
 * Convertendo galões em litros
 */
public class GalToLit {
   public static void main(String[] args) {
      
      // declares variables
      double gallons = 10; // assing 10 to variable
      double liters = gallons * 3.7854; // convert gallons to litres (1 gallons = 3.7854 litros)

      // display result
      System.out.println(gallons + " galons is " + liters + " liters.");
   } // end main
} // end class