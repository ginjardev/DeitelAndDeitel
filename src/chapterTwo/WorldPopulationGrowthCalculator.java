package chapterTwo;
import java.util.Scanner;
public class WorldPopulationGrowthCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long currentWorldPopulation = 0;
        double worldPopulationGrowthRate = 0;
        int time = 0;

        System.out.println("Enter current world population");
        currentWorldPopulation = scanner.nextLong();
        System.out.println("Enter world population growth rate");
        worldPopulationGrowthRate = scanner.nextDouble();
        System.out.println("Enter years to calculate");
        time = scanner.nextInt();

        long newWorldPopulation = (long) ((currentWorldPopulation * worldPopulationGrowthRate * time)/100 + currentWorldPopulation);

        System.out.println("World population in " + time + " years will be " + newWorldPopulation);
    }
}
