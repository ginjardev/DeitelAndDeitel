package oop.polymorphism;

public class Payroll {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];

        SalariedEmployee salariedEmployee = new SalariedEmployee("jeff", "funds",
                "SSN1234",34.0);

        HourlyEmployee hourlyEmployee = new HourlyEmployee("belle", "ben",
                "SSN09876", 50, 1.8);

        employees[1] = hourlyEmployee;
        employees[0] = salariedEmployee;


        for (Employee employee:employees) {
            System.out.println(employee);
            System.out.println();
        }
        for (Employee employee:employees) {
            System.out.println("Employee first name " + employee.getFirstName());
            System.out.println("Employee earnings " + employee.earnings());
            System.out.println(employee.getClass().getName());
        }
    }
}
