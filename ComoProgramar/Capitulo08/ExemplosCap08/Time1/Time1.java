
// Timi1.java
// Cria a classe Time1 mantém a data/hora no formato de 24 horas
public class Time1 {
    
    // variáveis de instancia
    private int horas; // 0 / 23
    private int minutos; // 0 / 59
    private int segundos; // 0 / 59

    // configura um novo valor de tempo usando hora universal;
    // lança umma exceção se ahora, minutos ou segundo for inválido.
    public void setTime( int horas, int minutos, int segundos) 
    {
        if(horas < 0 || horas >= 24 || minutos < 0 || minutos >= 60 || segundos < 0 || segundos >= 60)
        {
            throw new IllegalArgumentException("Horas, minutos e/ou segundos fora do intervalo adequado.");
        } // fimm if throw

        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    } // fim setTime

    // converte em String no formado data/hora universal (HH:MM:SS)
    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    } // fim toUniversalString

    //converte em String no formato data/hora padrão (HH:MM:SS AM/PM)
    public String toString()
    {
        return String.format("%d:%02d:%02d %s", (horas == 0 || horas == 12 ? 12 : horas % 12),
                                                        minutos, segundos, (horas < 12 ? "AM" : "PM") );          
    } // FIM toString

} // fim classe
