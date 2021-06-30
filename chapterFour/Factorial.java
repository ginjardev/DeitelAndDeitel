package chapterFour;

public class Factorial {

    //(a)
    public int factorialOfNumber(int number){
        if(number == 0 ){
            return 1;
        }else if (number == 1){
            return 1;
        }else {
            int factorial = 1;
            while(number >= 2){
                factorial *= number;
                number--;
            }
            return factorial;
        }
    }
    //(b)
    public double mathConstant(int value){
        double e;
        if(value == 1){
            e = 1 + (1.0);
            return e;
        }else if (value == 0){
            e = 1 + 1;
            return e;
        } else{
            double factorial = 1;
            while(value >= 2){
                factorial += (1.0/factorialOfNumber(value));
                value--;
            }
            return e = 1 + factorial;
        }

    }
    //(c.a)
    public double powerOfNumber(int base, int exp){
        int powerOfNumber = 1;
        int counter = exp;
        while(counter >= 1){
            powerOfNumber*=base;
            counter--;
        }
        return powerOfNumber;
    }
    public int powerOfNumberInt(int base, int exp){
        int powerOfNumber = 1;
        int counter = exp;
        while(counter >= 1){
            powerOfNumber*=base;
            counter--;
        }
        return powerOfNumber;
    }
    //(c.b)
    public double exponentOfMathConstant(int base, int exponent){
        double exponentE;
        if(base == 0){
            exponentE = 1;
            return exponentE;
        }else if(base == 1){
            exponentE = 1 + 1;
            return exponentE;
        }else{
            double factorial = 1;
            while(base >= 2){
                factorial *= (powerOfNumber(base, exponent)/factorialOfNumber(base));
                base--;
            }
            exponentE = 1 + factorial;
        }
        return exponentE;
    }
    public static void main(String[] args){
        Factorial factorial = new Factorial();
        System.out.println("factorial of number is " + factorial.factorialOfNumber(6));
        System.out.println("mathematical const (e) evaluates to " + factorial.mathConstant(12));
        //System.out.println(factorial.powerOfNumber(2,4));
       // System.out.println("exponent of e = " + factorial.exponentOfMathConstant(3, 3));
    }
}
