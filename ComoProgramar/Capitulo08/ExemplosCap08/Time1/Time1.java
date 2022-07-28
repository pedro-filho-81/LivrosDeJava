public class Time1 {
    /**
     * mantem a data/hora no forato de 24 horas
     * @throws IllegalAccessException
     */

    // variáveis de instância
    private int horas;
    private int minutos;
    private int segundos;

    public void setTime(int horas, int minutos, int segundos) 
                        throws IllegalAccessException {
        // validando horas, minutos e segundos
        if(horas < 0 || horas >= 24 || minutos < 0 || minutos >= 60 ||
            segundos < 0 || segundos >= 60 ) {
                throw new IllegalAccessException("Horas, minutos e/ou segundos fora do padrao ideal");
        } // final if

        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;

    } // final setTime

    // converte em String no fomrato de data/hora universal (HH:mm:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    } // final toUniversalString

    // converte e String no forato padrão de data/hora (H:mm:SS Am OU Pm)
    public String toString() {
        return String.format( "%d:%02d:%02d %s", ((horas == 0 || horas == 12) ? 12 : horas % 12), 
                                minutos, segundos, (horas < 12 ? "Am" : "Pm"));
    } // final toString
} // final classe
