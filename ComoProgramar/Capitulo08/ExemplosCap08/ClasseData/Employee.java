/**
 * classe Employee co referência a outros objetos
 */
public class Employee {

    // variáveis de instância
    private String firstName;
    private String lastName;
    private Data birthData;
    private Data hireData;

    // construtor para inicializar as variáveis de instância
    public Employee(String firstName, String lastName, Data birthData, Data hireData)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthData = birthData;
        this.hireData = hireData;

    } // final construtor

    // converte Emplouee no forato String
    public String toString()
    {
        return String.format("%s %s Contratado em: %s Aniversário: %s ",
                            firstName, lastName, birthData, hireData);
    } // final toString
    
} // final classe