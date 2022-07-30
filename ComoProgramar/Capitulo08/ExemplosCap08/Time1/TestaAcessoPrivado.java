public class TestaAcessoPrivado {
    /**
     * testa o acesso a variáveis de instância privadas
     */
    public static void main(String[] args) {

        // cria objeto 
        Time1 time = new Time1();

        // tentando atribuir valores as variáveis da classe Time1
        time.horas = 7;
        time.minutos = 15;
        time.segundos = 20;

        /*
         * TestaAcessoPrivado.java:11: error: horas has private access in Time1
         * time.horas = 7;
              ^
            TestaAcessoPrivado.java:12: error: minutos has private access in Time1
            time.minutos = 15;
                ^
            TestaAcessoPrivado.java:13: error: segundos has private access in Time1
            time.segundos = 20;
                ^
            3 errors
         */

    } // final principal    
} // final classe
