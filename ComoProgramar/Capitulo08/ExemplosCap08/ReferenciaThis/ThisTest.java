package ExemplosCap08.ReferenciaThis;

public class ThisTest {
    /**
     * 
     */
    public static void main(String[] args) {

        // objeto SimpleTime
        SimpleTime time = new SimpleTime(15, 30, 19);
        System.out.println(time.buildString());

        System.out.println();

        // objeto SimpleTime
        SimpleTime time2 = new SimpleTime(20, 20, 19);
        System.out.println(time2.buildString());


    } // final principal

} // final classe ThisTest

    // deonstra a referência this
    class SimpleTime 
    {
        // variáveis de instância
        private int horas; // 0 - 23
        private int minutos; // 0 - 59
        private int segundos; // 0 - 59

        /*
         * Se o construtor utilizar no parametro nomes iguais aos nomes das 
         * variáveis de instância a referência "this" será nescessária para
         * distinguir os nomes
         */
        public SimpleTime(int horas, int minutos, int segundos) 
        {
            this.horas = horas; // configura a hora do objeto "this"
            this.minutos = minutos; // configura os minutos do objeto "this"
            this.segundos = segundos; // configura os segundos do objeto "this"
        } // final construtor

        // utiliza "this" explicito e iplicito para chaar toUniversalString
        public String buildString() 
        {
            return String.format("%24s:%s%n%24s: %s",
                    "this.toUniversalString() ", this.toUniversalString(),
                    "toUniversalString() ", toUniversalString());
        } // final buildString

        // converte em String data/hora no forato universal (HH:mm:SS)
        public String toUniversalString()
        {
            // "this" nçae é aqui requerido para acessar variáveis de instância;
            // porque porque o método não tem variáveis locais co o mesmo nome
            // das variáveis de instância
            return String.format("%02d:%02d:%02d",
                    this.horas, this.minutos, this.segundos);
        } // final toUniversalString

    } // final classe SimpleTime
