//package ExemplosCap08.Time2;

public class Time2 {

    // variáveis de instância
    public int horas; // 0 - 23
    private int minutos; // 0 - 59
    private int segundos; // 0 - 59

    // construtor se arguentos
    // inicializa as variáveis de instância co zeros
    public Time2() throws IllegalAccessException
    {
        this(0, 0, 0); // invoca o construtor co 3 arguentos
    } // final construtor

    // construtor co as horas fornecidas, inutos e segundos co o padrão 0
    public Time2(int horas) throws IllegalAccessException
    {
        this(horas, 0, 0); // invoca o construtor co 3 arguentos

    } // final Time2-1

    // construtor horas e inuros fornecidos
    public Time2(int horas, int minutos) throws IllegalAccessException 
    {
        this(horas, minutos, 0);
    } // final construtor Time2-2

    public Time2(int horas, int minutos, int segundos) 
                throws IllegalAccessException
    {
        if(horas < 0 || horas >= 24)
            throw new IllegalAccessException("hora deve ser entre 0 - 23");
        if(minutos < 0 || minutos >= 59)
            throw new IllegalStateException("minutos deve ser entre 0 - 59");
        if(segundos < 0 || segundos>= 59)
            throw new IllegalStateException("segundos deve ser entre 0 - 59");

        this.horas = horas;
        this. minutos = minutos;
        this.segundos = segundos;

    } // final construtor Time2-3

    // outro construtor co o objeto Time2 fornecido
    public Time2(Time2 time) throws IllegalAccessException
    {
        // invoca o construtor co três arguentos
        this(time.getHoras(), time.getMinutos(), time.getSegundos());
    }

    // configura u novo valor de tepo~
    // usando a hora universal valida dados
    public void setTime(int horas, int minutos, int segundos) 
                throws IllegalAccessException
    {
        if(horas < 0 || horas >= 24)
            throw new IllegalAccessException("hora deve ser entre 0 - 23");
        if(minutos < 0 || minutos >= 59)
            throw new IllegalStateException("minutos deve ser entre 0 - 59");
        if(segundos < 0 || segundos>= 59)
            throw new IllegalStateException("segundos deve ser entre 0 - 59");

        this.horas = horas;
        this. minutos = minutos;
        this.segundos = segundos;

    } // final construtor Time2-
    
    // valida a configuração da hora
    public void setHoras(int horas) 
                throws IllegalAccessException 
    {
        if(horas < 0 || horas >= 24) {
            throw new IllegalAccessException("horas deve ser entre 0 e 23 ");
        }

        this.horas = horas;

    } // fi set horas

    // valida e configura is inutos
    public void setMinutos(int minutos) 
                throws IllegalAccessException
    {
        if(minutos < 0 || minutos >= 60)
        {
            throw new IllegalAccessException("minutos deve ser entre 0 e 59");
        }

        this.minutos = minutos;

    } // final setminutos

    // valida e configura os segundos
    public void setSegundos(int segundos) 
                throws IllegalAccessException
    {
        if(segundos < 0 || segundos >= 60)
        {
            throw new IllegalAccessException("segundos deve ser entre 0 e 59");
        }

        this.segundos = segundos;
    }

    // retornando horas
    public int getHoras() 
    {
        return horas;
    }

    // retornando minutos
    public int getMinutos() 
    {
        return minutos;
    }

    // retornando os segundos
    public int getSegundos()
    {
        return segundos;
    }

    public void incrementeHoras()
    {
        this.horas += 1;
    }

    public void incrementeMinutos()
    {
        this.minutos += 1;
    }

    public void incrementeSegundos()
    {
        this.segundos += 1;
    }

    public void incrementeParaProximoDia(int horas, int minutos, int segundos)
    {
        if(horas >= 11 || minutos >= 59 || segundos >= 59)
        {
            
        }
    }

    // converte e String o forato data/horas no forato universal (HH:NN:SS)
    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d", 
                        getHoras(), getMinutos(), getSegundos());
    }

    // converte e String no forato padrão de data/horas (H:MM:SS AM ou PM)
    public String toString()
    {
        return String.format("%d:%02d:%02d %s", 
                    ((getHoras() == 0 || getHoras() == 12) ? 12 : getHoras() % 12),
                    getMinutos(), getSegundos(), (getHoras() < 12 ? "AM" : "PM"));
    }

} // final classe Time2
