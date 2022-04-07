package oop;

public class BasePlusCommissionEmployee extends CommissionEmployee{

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRate, double baseSalary){
        super(firstName, lastName, socialSecurityNumber,
                grossSales, commissionRate);

        if(baseSalary < 0.0) throw new IllegalArgumentException("Base salary must be > 0.0");

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0) throw new IllegalArgumentException("Base salary must be > 0.0");
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings(){
        return baseSalary + (getGrossSales() * getCommissionRate());
    }

    @Override
    public String toString(){
        return String.format("%s : %s%n%s : %s%n%s: %.2f%n%s : %.2f","Employee", getFirstName() + " " + getLastName(),
                "Social Security Number", getSocialSecurityNumber(), "Base Salary ", baseSalary,
                "Earnings", earnings());
    }

    public static void main(String[] args) {

        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee(
                "Audu", "Isa", "SSN567891",
                2500.0, 0.2, 500.0
        );

        System.out.println(basePlusCommissionEmployee);

        basePlusCommissionEmployee.setGrossSales(4500.0);
        basePlusCommissionEmployee.setCommissionRate(0.125);
        System.out.println();
        System.out.println(basePlusCommissionEmployee);
    }
}
