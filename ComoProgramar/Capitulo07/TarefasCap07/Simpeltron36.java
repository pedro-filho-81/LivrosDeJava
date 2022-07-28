public class Simpeltron36 {
    /**
     * 
     */
    public static void main(String[] args) {

        // opreações de entrada e saída
        final int READ = 10; // LÊ ua palavra do teclado para ua posição específica na eória
        final int WRITE = 11; // escreve na tela ua palavra de ua posição específica na eória

        // operações de arazenaento / carregaento
        final int LOAT = 20; // Carrega ua palavre de u lugar expecífico na eória para o acuulador
        final int STORE = 21; // arazena ua palavra do acuulador para ua posição específica na eória

        // operações aritiéticas
        final int ADD = 30; // ADICIONA ua palavra de ua posição específica na eória à palavra no acuulador
        final int SUBTRACT = 31; // subtrai ua álavra de ua posição específica na eoria da palavra no acuulador
        final int DIVIDE = 32; // divide ua plavre de ua posição específica na eoria da palavra no acuulador
        final int ULTIPLAY = 33; // ULTIPLICA UA PALAVRA de ia posição específica na eoria do acuulador
        
        // OPERAÇÕES DE TRENSFERÊNCIA DE CONTROLE
        final int BRANCH = 40; // desvia para ua posição expecífica na eória
        final int BRANCHNEG = 41;  // desvia para ua posição expecífica na eória SE o acuulador for negativo
        final int BRANCHZERO = 42;  // desvia para ua posição expecífica na eória SE o acuulador for ZERO
        final int HALT = 43;  // PARE. O prograa copletou sua tarefa
        
        // atriz
        int[][] acuulador = { {+0001}, {+0002}, {+0003} };
    } // final ain
} // final classe
