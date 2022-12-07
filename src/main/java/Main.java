import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        List<Employee>employees = new ArrayList<>();

        employees.add(new Employee(1,"mariusz", 999, EmployeeRole.BACKEND_DEVELOPER));
        employees.add(new Employee(1,"mariusz", 999, EmployeeRole.BACKEND_DEVELOPER));
        employees.add(new Employee(1,"mariusz", 999, EmployeeRole.BACKEND_DEVELOPER));
        employees.add(new Employee(4,"paulina", 1999, EmployeeRole.FRONTEND_DEVELOPER));
        employees.add(new Employee(5,"paulina", 1999, EmployeeRole.FRONTEND_DEVELOPER));
        employees.add(new Employee(5,"paulina", 1999, EmployeeRole.FRONTEND_DEVELOPER));
        employees.add(new Employee(6,"talarek", 2999, EmployeeRole.MANUAL_TESTER));
        employees.add(new Employee(6,"talarek", 2999, EmployeeRole.MANUAL_TESTER));
        employees.add(new Employee(7,"marek", 199, EmployeeRole.SCRUM_MASTER));
        employees.add(new Employee(8,"marek", 199, EmployeeRole.SCRUM_MASTER));
        employees.add(new Employee(8,"marek", 199, EmployeeRole.SCRUM_MASTER));
        employees.add(new Employee(8,"marek", 199, EmployeeRole.SCRUM_MASTER));
        employees.add(new Employee(5,"uix", 39, EmployeeRole.UI_UX_DESIGNER));
        employees.add(new Employee(5,"uix", 39, EmployeeRole.UI_UX_DESIGNER));
        employees.add(new Employee(5,"uix", 39, EmployeeRole.UI_UX_DESIGNER));
        employees.add(new Employee(5,"uix", 39, EmployeeRole.UI_UX_DESIGNER));
        employees.add(new Employee(5,"uix", 39, EmployeeRole.UI_UX_DESIGNER));
        employees.add(new Employee(5,"uix", 39, EmployeeRole.UI_UX_DESIGNER));
        employees.add(new Employee(5,"uix", 39, EmployeeRole.UI_UX_DESIGNER));
        employees.add(new Employee(5,"uix", 39, EmployeeRole.UI_UX_DESIGNER));
        employees.add(new Employee(5,"uix", 39, EmployeeRole.UI_UX_DESIGNER));
        employees.add(new Employee(5,"uix", 39, EmployeeRole.UI_UX_DESIGNER));
        employees.add(new Employee(6,"michal", 9, EmployeeRole.PRODUCT_OWNER));
        employees.add(new Employee(6,"michal", 9, EmployeeRole.PRODUCT_OWNER));
        employees.add(new Employee(6,"michal", 9, EmployeeRole.PRODUCT_OWNER));
        employees.add(new Employee(6,"michal", 9, EmployeeRole.PRODUCT_OWNER));
        employees.add(new Employee(6,"michal", 9, EmployeeRole.PRODUCT_OWNER));
        employees.add(new Employee(6,"michal", 9, EmployeeRole.PRODUCT_OWNER));

        Optional<Employee> employeeById = StreamMethods.getEmployeeById(employees, 1);
        System.out.println(employeeById.get());

        System.out.println("--------");

        Integer totalSalaryBudget = StreamMethods.getTotalSalaryBudget(employees);
        System.out.println(totalSalaryBudget);

        Optional<Employee> bestEarningEmployee = StreamMethods.getBestEarningEmployee(employees);
        System.out.println(bestEarningEmployee.get());

        System.out.println("----");

        System.out.println(StreamMethods.getRoleWithLeastEmployees(employees));


    }
}
