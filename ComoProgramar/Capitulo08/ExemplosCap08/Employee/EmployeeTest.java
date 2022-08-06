/**
 * Figura 8.13: EmployeeTest.java
 * Demonstração do membro static.
 */
public class EmployeeTest {

    public static void main(String[] args)
    {
        // mostra que a contagem é 0 antes de criar Employees
        System.out.printf("Employee antes da inicialização: %d%n",
                    Employee.getCount()); // chama a classe e o método gerCout da classe

        // cria dois objetos Employee
        Employee e1 = new Employee("Pedro", "Filho");
        Employee e2 = new Employee("Cleonice", "Santos");

        // mostra que a contagem é 2 depois de criar dois objetos Employ
        System.out.printf("%nEmployees depois da inicialização%n");
        System.out.printf("via o objeto e1.getCount(): %d%n", e1.getCount());
        System.out.printf("via o objeto e2.getCount(): %d%n", e2.getCount());
        
        // mostra getCount chamado pela própria classe Employee
        System.out.printf("Classe Employee.getCount(): %d%n", Employee.getCount());

        // mostra os nomes
        System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n",
                        e1.getFirstName(), e1.getLastName(), // nome e sobre-nome com o objeto e1
                        e2.getFirstName(), e2.getLastName()); // nome e sobre-nome com o objeto e2

    } // final principal

} // final classe EmployeeTest