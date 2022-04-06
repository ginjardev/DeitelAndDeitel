package chapterFive;

public class PythagoreanTriples {
    public static void main(String[] args) {
        System.out.printf("%s%8s%11s%n", "Side 1", "Side 2", "Hypotenuse");
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 200; j++) {
                for (int k = 0; k < 200; k++) {
                    if(Math.pow(i,2) + Math.pow(j,2) == Math.pow(k,2)){
                        if(i > 0 && j > 0 && k > 0){
                            System.out.printf("%1d%9d%11d%n", i, j, k);
                        }

                    }
                }
            }
        }
    }
}
