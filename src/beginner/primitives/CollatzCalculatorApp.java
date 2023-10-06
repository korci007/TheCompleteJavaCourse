package beginner.primitives;

import java.util.Scanner;

public class CollatzCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        do {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        } while (1 != n);
        System.out.println(1);
    }

}
