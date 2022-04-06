package chapterFour;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userMilesPerTrip = 0;
        int userGallonsPerTrip = 0;
        double totalMilesTravelled = 0;
        double totalGallonsPerTravel = 0;

        while(userMilesPerTrip != -1 && userGallonsPerTrip != -1){

            int milesPerTrip = 0;
            int gallonsPerTrip = 0;

            System.out.println("Enter miles per trip & -1 to exit");
            userMilesPerTrip = scanner.nextInt();
            if(userMilesPerTrip > 0)
                milesPerTrip = userMilesPerTrip ;

            System.out.println("Enter gallons per trip & -1 to exit");
            userGallonsPerTrip = scanner.nextInt();
            if(userGallonsPerTrip > 0)
                gallonsPerTrip = userGallonsPerTrip;

            double milesPerGallon = (double) milesPerTrip / gallonsPerTrip;

            System.out.printf("miles per gallon = %.2f%n", milesPerGallon);

            totalMilesTravelled += milesPerTrip;
            totalGallonsPerTravel += gallonsPerTrip;

        }
        System.out.println("total miles travelled " + totalMilesTravelled);
        System.out.println("total gallons used " + totalGallonsPerTravel);
        System.out.printf("Total miles per gallon = %.2f%n", totalMilesTravelled/totalGallonsPerTravel);


    }
}
