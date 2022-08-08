package ExemplosCap08;
/**
 * Figura 8.15: PackageDataTest.java
 * Membros de acesso de pacote de uma classe 
 * permanecem acessíveis a outras classes no mesmo pacote.
 */
public class PakageDataTest {
    public static void main(String[] args)
    {
        // objeto PackageData
        PackageData packageData = new PackageData();

        // gera saída da String packageData 
        System.out.printf("Antes das mudanças pelo método principal: %n%s%n", packageData);

        //muda os dados das variáveis de instância da classe PackageData
        packageData.number = 12345;
        packageData.string = "Pedro Filho";

        // gera saída da String packageData 
        System.out.printf("Depois das mudanças feitas pelo método principal: %n%s%n", packageData);

    }    // final principal
} // final classe

// classe com variáveis de instância de acesso de pacote
class PackageData
{
    // variáveis de instância não protegidas da classe
    int number; // variável para o núero
    String string; // para o noe

    // construtor
    public PackageData()
    {
        number = 54321;
        string = "Ola Java";
    } // final construtor

    // retorna os valores atribuidos no construtor
    public String toString()
    {
        return String.format("Numero: %d%n String: %s%n", number, string);
    } // final toString

} // final classe
