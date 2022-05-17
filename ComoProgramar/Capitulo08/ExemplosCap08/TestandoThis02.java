public class TestandoThis02 {
    /**
     * // Figura 8.4: ThisTest.java
     * this utilizado implícita e explicitamente 
     * para referência a membros de um objeto
     */
    public static void main(String[] args) {
        
        // objeto da classe SimpleTie
        SimpleTime time = new SimpleTime(15, 30, 25);

        // mostra e chama o método buildeString()
        System.out.println(time.buildeString());

    } // fim main
} // fim classe

    // demonstra a referência "this"
    class SimpleTime {

        // variáveis de instância
        private int horas; // 0 - 23;
        private int minutos; // 0 - 59;
        private int segundos; // ~0 - 59;

        /*  se o construtor utilizar nomes de parâmetros identicos 
            as variáveis de instância a palavra-chave "this" será
            exigida para distinguir entre os nomes
        */
        public SimpleTime(int horas, int minutos, int segundos) {
            // atribuindo parâmetros as variáveis de instância
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        } // fim construtor

        // utiliza "this" explico e implicito para chamar toUniversalString
        public String buildeString() {
            return String.format("%24s: %s%n%24s: %s",
                            "this.toUniversalString()", this.toUniversalString(),
                            "toUniversalString", toUniversalString());
        } // fim buildeString

        // converte em String o formato data/hora universal "HH:MM:SS"
        public String toUniversalString() {
            // "this" não é requerido aqui para acessar variáveis de instância, 
            // porque o método não tem variáveis locais com os mesmos 
            // nomes das variáveis de instância
            return String.format("%02d:%02d:%02d", 
            this.horas, this.minutos, this.segundos);
        } // fim toUniversalString
    
    } // fimm classe SimpleTie