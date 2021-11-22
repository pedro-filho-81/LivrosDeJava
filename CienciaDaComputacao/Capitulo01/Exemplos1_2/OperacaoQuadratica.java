package Exemplos1_2;

/*
    Dados b e c, resolva as raízes de x * x + b * x + c.
    Assuma que ambas as raízes têm valor real.
*/
public class OperacaoQuadratica {
    public static void main(String[] args) {

        // cria e inicializa as variáveis
        double b = 5;
        double c = 2;

        // calcula
        double discriminant = b * b - 4.0 * c;
        double sqroot = Math.sqrt(discriminant);

        double root1 = (-b + sqroot) / 2.0;
        double root2 = (-b - sqroot) / 2.0;

        // imprime resultado
        System.out.println(root1);
        System.out.println(root2);
    } // fim main
} // fim classe
