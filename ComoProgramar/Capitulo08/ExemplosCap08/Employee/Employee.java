/**
 * Figura 8.12: Employee.java
 * Variável static utilizada para manter uma contagem do número de 
 * objetos Employee na memória.
 */
public class Employee {

    //variáveis de instância 
    private static int count = 0; // conta o número de empregados cadastrados
    private String firstName; // prieiro nome
    private String lastName; // resto do nome

    // inicializa Employee, adiciona 1 a static count e 
    // gera a saída de String indicando que o construtor foi chamado
    public Employee(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;

        ++count; // pré-incrementa o contador
        // imprime
        System.out.printf("Employee construtor: %s %s; cout = %d%n",
                        firstName, lastName, count);

    } // final construtor

    // obtém o primeiro nome
    public String getFirstName()
    {
        return firstName;
    } // final getName

    // obtém o último nome
    public String getLastName()
    {
        return lastName;
    } // final getLastName

    // método estático para obter valor de contagem de estático
    public static int getCount()
    {
        return count;
    } // final getCout

} // final Employee
