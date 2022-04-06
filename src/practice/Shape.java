package practice;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;

import static java.time.ZoneOffset.UTC;
//import java.util.Date;

public class Shape {
    private String color = "grey";
    private boolean isFilled;
    private LocalDate newDate;
    private LocalTime myTime;
    private String name;

    public String getName(){
        return name;
    }
    public Shape(String name){
        this.name = name;
        isFilled = true;
        newDate = LocalDate.now();
        myTime = LocalTime.now(Clock.tickMinutes(UTC));
    }

    @Override
    public String toString(){
        return name + " color is " + color + "\ncreated on " + newDate.getDayOfWeek() + " " +newDate.getMonth() + " " +newDate.getYear() + "\nand the time is " + myTime;
    }
    public boolean isFilled(){
        return isFilled;
    }

    public LocalDate dateTime(){
        return newDate;
    }


}
