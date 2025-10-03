package ge.edu.ug.solid.srp.employee;

import org.junit.jupiter.api.Test;

class EmployeeTest {
    @Test
    void displayEmployeeDetails() {
        Employee nikola = new Employee("Nikola", "Tesla", 10.0);
        EmployeeIdGenerator idGenerator = new EmployeeIdGenerator();
        nikola.employeeId = idGenerator.generateEmployeeId();
        showEmpDetail(nikola);
    }

    private static void showEmpDetail(Employee emp) {
        // Display employee detail
        emp.displayEmployeeDetails();
        System.out.println("The employee id: " + emp.employeeId);
        // Check the seniority level
        SeniorityChecker seniorityChecker = new SeniorityChecker();
        System.out.printf("This employee is a %s employee.", seniorityChecker.checkSeniority(emp.experienceInYears));
    }
}
