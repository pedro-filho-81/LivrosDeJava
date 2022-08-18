import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * Interest.java
 * Cálculos de juros compostos com BigDecimal.
 */

 public class CalculoJurosCompostos {
    public static void main(String[] args)
     {
        
        //quantidade principal antes dos juros
        BigDecimal principal = BigDecimal.valueOf(1000.0); // R$ 1000,0
        // taxa de juros anual 5% ou 0,05 ou 5/100
        BigDecimal taxa = BigDecimal.valueOf(0.05); // 5%

        // exibe cabeçalho
        System.out.printf("%s%20s%n", "Ano", "Saldo/Déposito");

        // loop para exibir o saldo
        for(int ano = 1; ano <= 10; ano++)
        {
            // calcula os novos valores com a taxa de juros anual
            // multiply => 1 + pow(taxa, tempo)
            BigDecimal saldo = principal.multiply(taxa.add(BigDecimal.ONE).pow(ano));
        
            System.out.printf("%4d%20s%n", ano, 
                            NumberFormat.getCurrencyInstance().format(saldo));
           
        } // final for

    } // final main
} // final classe