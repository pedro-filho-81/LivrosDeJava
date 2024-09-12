package ComoProgramar.Capitulo08.ExerciciosCap08.ClasseRetangulo;

/**
 * 8.4 (Classe Rectangle) Crie uma classe Rectangle com os 
 * atributos length e width, cada um dos quais assume o padrão de 1. 
 * Forneça os métodos que calculam o perímetro e a área do retângulo. 
 * A classe tem métodos set e get para o comprimento (length) e a largura 
 * (width). Os métodos set devem verificar se length e width são, cada um, 
 * números de ponto flutuante maiores que 0,0 e menores que 
 * 20,0. Escreva um programa para testar a classe Rectangle.
 */
public class TestaRetangulo {
    public static void main(String[] args)
    {
        // cria objeto da classe retângulo
        Retangulo retrangulo = new Retangulo(15f, 10f);

        System.out.println("Largura = " + retrangulo.getLargura());
        System.out.println("Altura = " + retrangulo.getAltura());
        
        retrangulo.area();
        retrangulo.perimetro();

    } // final principal
} // final classe