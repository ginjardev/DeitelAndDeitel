package chapterFive;

import java.util.Scanner;

public class GlobalWarmingFactsQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer;
        int correctScore = 0;
        String questionOne = "What is 2 x 4 ";
        String questionTwo = "What is 4 x 5 ";
        String questionThree = "What is 5 x 6 ";
        String getQuestionFour = "What is 6 x 8 ";
        String questionFive = "What is 8 x 10 ";

        for (int i = 1; i <= 5; i++) {
            switch (i){
                case 1:
                    System.out.println(questionOne);
                    System.out.println("1. Eight 2. Six 3. Nine 4. Ten");
                    answer = scanner.nextInt();
                    if (answer == 1){
                        ++correctScore;
                    }
                    break;
                case 2:
                    System.out.println(questionTwo);
                    System.out.println("1. Sixteen 2. Twenty 3. Twenty-two 4. Twenty-four");
                    answer = scanner.nextInt();
                    if (answer == 2){
                        ++correctScore;
                    }
                    break;
                case 3:
                    System.out.println(questionThree);
                    System.out.println("1. Thirty-two 2. Thirty-six 3. Forty 4. Thirty");
                    answer = scanner.nextInt();
                    if (answer == 4){
                        ++correctScore;
                    }
                    break;
                case 4:
                    System.out.println(getQuestionFour);
                    System.out.println("1. Forty 2. Forty-two 3. Forty-eight 4. Forty-six");
                    answer = scanner.nextInt();
                    if (answer == 3){
                        ++correctScore;
                    }
                    break;
                case 5:
                    System.out.println(questionFive);
                    System.out.println("1. Eighty 2. Sixty 3. Ninety 4. Seventy");
                    answer = scanner.nextInt();
                    if (answer == 1){
                        ++correctScore;
                    }
                    break;
            }
        }
        System.out.println();
        if(correctScore == 5){
            System.out.println("Excellent");
        }else if(correctScore == 4){
            System.out.println("Very good");
        }else if(correctScore == 3 || correctScore < 3){
            System.out.println("Time to brush up on your knowledge of global warming");
        }
    }
}
