import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class StreamMethods {
    /*
    Get the employee with given ID
     */
    public static Optional<Employee> getEmployeeById(Collection<Employee> employees, Integer id){
        return employees.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst();
    }

    /*
    Return the total amount of money required to pay all given employees
     */
    public static Integer getTotalSalaryBudget(Collection<Employee> employees){
        return employees.stream()
                .map(e-> e.getSalary())
                .reduce(0, Integer::sum);

    }

    /*
    Get the best earning employee
     */
    public static Optional<Employee> getBestEarningEmployee(Collection<Employee> employees){
       /* nie wiem czemu ale na tym qualified nie widać Comparator.comparing ale metoda  działa w IntelliJ
       bo sprawdzałem
        */
        /*
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .findFirst();
                */
/*
        return employees.stream()
                .max(Comparator.comparing(Employee::getSalary));
*/


        return employees.stream()
                .max((e1,e2)-> e1.getSalary().compareTo(e2.getSalary()));


    }

    /*
    Get names of all employees of given role
     */
    public static Stream<String> getNamesOfEmployeesOfRole(Collection<Employee> employees, EmployeeRole role){
        return  employees.stream()
                .filter(e -> e.getRole().equals(role))
                .map(e-> e.getName());
    }

    /*
    Get the average value of salaries of all employees of given role
     */
    public static Double getAverageSalaryOfRole(Collection<Employee> employees, EmployeeRole role){
        return employees.stream()
                .filter(e -> e.getRole().equals(role))
                .map(e -> e.getSalary())
                .mapToDouble(e -> e)
                .average().getAsDouble();

    }

    /*
    Get the role that has the least employees
     */
    public static Optional<EmployeeRole> getRoleWithLeastEmployees(Collection<Employee> employees){

        Map<EmployeeRole, Long> rolesMap = employees.stream()
           .collect(Collectors.groupingBy(Employee::getRole, Collectors.counting()));

        Stream<Map.Entry<EmployeeRole, Long>> sorted = rolesMap.entrySet().stream()
                .sorted((Map.Entry.comparingByValue()));

        EmployeeRole key = sorted.findFirst().get().getKey();
        return Optional.of(key);
    }

    /*
    Get the division with the greatest pay gap between its manager and employees
    Pay Gap formula: Manager_Salary - Average_Employees_Salary
     */
    public static Optional<Division> getDivisionWithGreatestManagerEmployeePayGap(Collection<Division> divisions){
            divisions
                    .stream()
                    .collect(Collectors.groupingBy(division -> division.getManager()))

    }

    /*
    Get the best earning employee of given role out of all divisions
     */
    public static Optional<Employee> getBestEarningEmployeeOfRole(Collection<Division> divisions, EmployeeRole role){
        return divisions.stream()
                .map(d -> d.getEmployees())
                .flatMap(Collection::stream)
                .filter(e -> e.getRole().equals(role))
                .max((e1,e2)-> e1.getSalary().compareTo(e2.getSalary()));
    }
}
