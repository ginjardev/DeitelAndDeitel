package arraysPractise;

public class FindSmallestElementInArray {
    public static double min(double[] array){
        double minElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < minElement){
                minElement = array[i];
            }
        }
        return minElement;
    }

    public static void main(String[] args) {
        double[] findMin = {13.5, 9.3, 4.1, 2.2, 34.0, 26.7};
        System.out.println(min(findMin));
    }
}
