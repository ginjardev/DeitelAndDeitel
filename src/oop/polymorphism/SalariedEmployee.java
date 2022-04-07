package oop.polymorphism;

import java.lang.instrument.ClassDefinition;

public class SalariedEmployee extends Employee{

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName,
                            String socialSecurityNumber, double weeklySalary){
        super(firstName, lastName, socialSecurityNumber);

        if(weeklySalary < 0.0 ) throw new IllegalArgumentException("Salary must be > 0.0");

        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0) throw new IllegalArgumentException("Salary must be > 0.0");
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString(){
        return  String.format("%s : %s%n%s : %s%n%s : %s%n%s : %.2f%n",
                "SalariedEmployee first name", getFirstName(),
                "SalariedEmployee last name", getLastName(),
                "SalariedEmployee Social Security Number", getSocialSecurityNumber(),
                "SalariedEmployee Salary", getWeeklySalary());
    }

    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("greg", "chad",
                "SSN34567", 34.0);

        System.out.println(salariedEmployee);
    }
}
