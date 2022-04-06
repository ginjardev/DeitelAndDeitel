package chapterSix;

import java.util.Scanner;

public class QualityPoints {

    public static int qualityPoints(int studentsAverage){
        int quality = 0;
        if(studentsAverage > 89 && studentsAverage < 101){
            quality = 4;
        }else if(studentsAverage > 79 && studentsAverage < 90){
            quality = 3;
        }else if(studentsAverage > 69 && studentsAverage < 80){
            quality = 2;
        }else if(studentsAverage > 59 && studentsAverage < 70){
            quality = 1;
        }else{
            quality = 0;
        }
        return quality;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prompt = 1;
        while(prompt != 0){
            System.out.println("Enter a student average: ");
            int average = scanner.nextInt();
            System.out.println("Student's quality point = " + qualityPoints(average));
            System.out.println("Press any number to CONTINUE, 0 to EXIT ");
            prompt = scanner.nextInt();
        }

    }
}
