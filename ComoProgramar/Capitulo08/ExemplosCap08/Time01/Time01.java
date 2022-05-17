public class Time01 {

    // cria variáveis de instância
    private int horas; // 0 / 24
    private int minutos; // 0 / 59
    private int segundos; // 0 / 59
    
    // configura o tempo conforme a hora universal
    public void setTime( int horas, int minutos, int segundos ) 
                    throws IllegalAccessException { 
        if(horas < 0 || horas >= 24 || 
            minutos < 0 || minutos >= 60 || 
                segundos < 0 || segundos >= 60 ) { 
                    throw new IllegalAccessException
                        ("Horas, minutos e/ou segundos fora do padrao.");
        } // fim if

        // atribuindo parâmetros às variáveis de instância
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
            
    } // fim setTime

    // converte em String no forato de data/hora universal (HH:MM:SS)
    public String toUniversalString() {

        // retorna no formato de String às horas os minutos e os segundos
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);

    } // fim toUniversalString

    public String toString() {
        return String.format("%02d:%02d:%02d %s", 
                ( (horas == 0 || horas == 12) ? 12 : horas % 12),
                minutos, segundos, (horas < 12 ? "AM" : "PM" ) );
    } // fim toString

} // fim classe Time01