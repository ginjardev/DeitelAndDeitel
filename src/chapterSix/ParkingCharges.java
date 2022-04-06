package chapterSix;

import java.util.Scanner;

public class ParkingCharges {
    //double basicParkCharge = 2.00;
    int hoursParked;
    double total = 0;

    public void setHoursParked(int hoursParked){
        if(hoursParked > 0 && hoursParked <= 24){
            this.hoursParked = hoursParked;
        }
    }

    public double calculateCharges(){
        double parkCharge = 0;
        if (hoursParked >= 1 && hoursParked <= 3){
            parkCharge = 2.0;
            return parkCharge;
        } else if(hoursParked > 3 && hoursParked < 24){
           parkCharge = 2.0 + ((hoursParked - 3) * 0.50);
           return parkCharge;
        }else if(hoursParked == 24){
            parkCharge = 10.0;
            return parkCharge;
        }
        return parkCharge;
    }

    public double totalDayReceipt(){
        total+= calculateCharges();
        return total;
    }


    public static void main(String[] args) {
        ParkingCharges parkingCharges = new ParkingCharges();
        Scanner scanner = new Scanner(System.in);
        int input = 1;
        while (input != 0){
            System.out.println("How many hours was the vehicle parked? ");
            int hours = scanner.nextInt();
            parkingCharges.setHoursParked(hours);
            System.out.println("Parking Charge is " + parkingCharges.calculateCharges());
            System.out.println("Total Day Receipt is " + parkingCharges.totalDayReceipt());
            System.out.println(""" 
                    Enter any number to CONTINUE or 0 EXIT!
                    """);
            input = scanner.nextInt();
        }
    }
}
