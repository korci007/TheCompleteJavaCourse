package intermediate.inheritance;

import java.util.Scanner;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        //call your implemented methods here.
        if (x <= 0) {
           x =  f1(x);
        } else if (x >= 1) {
            x = f3(x);
        } else {
             x = f2(x);
        }
        return x;
    }

    //implement your methods here
    public static double f1(double x) {
        return x * x + 1;
    }

    public static double f2(double x) {
        return 1.0 / (x * x);
    }

    public static double f3(double x) {
        return x * x - 1;
    }
}