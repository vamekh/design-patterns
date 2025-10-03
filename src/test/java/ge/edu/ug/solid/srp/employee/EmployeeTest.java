package ge.edu.ug.solid.srp.employee;

import org.junit.jupiter.api.Test;

class EmployeeTest {
    @Test
    void testBadExample() {
        Employee erich = new Employee("Erich", "Gamma", 10.0);
        showEmployeeDetails(erich);
    }

    private void showEmployeeDetails(Employee employee) {
        employee.displayEmployeeDetails();
        employee.employeeId = employee.generateEmployeeId();

        System.out.printf("Employee id: %s\n", employee.employeeId);
        System.out.printf("This employee is a %s employee\n", employee.checkSeniority());
    }
}
