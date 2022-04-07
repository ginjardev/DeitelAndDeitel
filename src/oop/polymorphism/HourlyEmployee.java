package oop.polymorphism;

public class HourlyEmployee extends Employee{

    private int hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
                          int hours, double wage){
        super(firstName, lastName,socialSecurityNumber);

        if(hours < 0 || hours > 168) throw new IllegalArgumentException("Hours out of range ");
        this.hours = hours;

        if(wage < 0) throw new IllegalArgumentException("wage cannot be < 0");
        this.wage = wage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours < 0 || hours > 168) throw new IllegalArgumentException("Hours out of range ");
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage < 0) throw new IllegalArgumentException("wage cannot be < 0");
        this.wage = wage;
    }

    @Override
    public double earnings() {
        return getHours() * getWage();
    }

    @Override
    public String toString(){
        return String.format("%s : %s %s%n%s : %s%n%s : %.2f",
                "HourlyEmployee names", getFirstName(), getLastName(),
                "HourlyEmployee Social Security Number", getSocialSecurityNumber(),
                "HourlyEmployee Salary", earnings());
    }

    public static void main(String[] args){

        HourlyEmployee hourlyEmployee = new HourlyEmployee("Titus", "Tim", "SSN138945",
                24, 2.5);

        System.out.println(hourlyEmployee);

    }
}
