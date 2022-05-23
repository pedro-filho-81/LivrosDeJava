import java.security.SecureRandom;

public class EliminaDuplicata12 {
    /**
     * 7.12 (Eliminação de duplicatas) Utilize um array unidimensional 
     * para resolver o seguinte problema: escreva um aplicativo que insere cinco 
     * números, cada um entre 10 e 100, inclusive. Enquanto cada número é lido, 
     * exiba-o somente se ele não tiver uma duplicata de um número já lido. 
     * Cuide de tratar o pior caso, em que todos os cinco numeros sao diferentes. 
     * Utilize o menor array possível para resolver esse problema. 
     * Exiba o conjunto completo de valores únicos inseridos depois que 
     * o usuário inserir cada valor novo.
     * Pedro, 23/05/2022
     */
    public static void main(String[] args) {
        
        // vetor
        int[] duplicatas = new int[5];

        // chama adicionar
        adicionar(duplicatas);

        // mmostrar
        mostrar(duplicatas);

    } // fim mmain
    
    // adicionar valores ao vetor
    public static void adicionar(int[] vetor) {
        // objeto SecureRandom
        SecureRandom aleatorio = new SecureRandom();

        // variável
        int resposta = 0;
        int contar = 0;
        // enquanto resposta diferente de -1 e contar menor que 5 faça
        while(resposta != -1 && contar < 5) {
            // resposta recebe o valor da pesquisa
            resposta = pesquisar(vetor, 10 + aleatorio.nextInt(90) );
            // se resposta diferente de -1
            if(resposta != -1) { 
                // vetor recebe o valor da resposta
                vetor[contar] = resposta;
                // e contar soma mais 1
                contar++;
            } // fim if

        } // fim for i
    } // fim adicionar

    // pesquisar valores
    public static int pesquisar(int[] vetor, int chave) {

        SecureRandom aleatorio = new SecureRandom();

        int contar = 0;

        // pesquisar o valor no vetor
        for(int i = 0; i < vetor.length; i++) {
            if(chave == vetor[i]) { 
                //System.out.printf("%3 = vetor", chave);
                chave = 10 + aleatorio.nextInt(90);
            } // fim if
        } // fim for

        // enquanto vetor diferente da chave faça
        while(vetor[contar] != chave) {
            contar++;
            // retorna a chave
            return chave;
        } // fim for i

        // se não retorna -1
        return -1;
    } // fim pesquiar
    
    // mostrar valores
    public static void mostrar(int[] vetor) {
        System.out.println("Duplicatas: ");
        for(int i = 0; i < vetor.length; i++) 
            System.out.printf("%3d", vetor[i]);
    } // fim mostrar

} // fim classe