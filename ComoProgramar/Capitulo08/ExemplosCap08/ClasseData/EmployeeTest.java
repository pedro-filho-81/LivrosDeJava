public class EmployeeTest {
    public static void main(String[] args) throws IllegalAccessException {
        // objetos
        Data aniversario = new Data(24, 9, 1963);
        Data contrato = new Data(04, 8, 2022);
        Employee employee = new Employee("Pedro", "Santos Finho",
                                                         contrato, aniversario);

        System.out.println(employee);
        
    } // final principal
} // final Employee
