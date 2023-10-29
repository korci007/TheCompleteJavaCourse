/* For the given numbers K, N, and M find the first seed that is greater than or equal to K where
 * each of N Gaussian numbers is less than or equal to M.
 * The input contains numbers K, N, M in a single line.
 * You should output the seed. */

package beginner.primitives;

import java.util.*;
//import java.util.Scanner;

public class Gaussian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();

        /* You have to check all N iterations of Gaussian generated numbers to be less than or equal to M.
         * If that is true, then escape loop and print the seed. If any of the generated numbers is greater
         * than M, then you have to test out the next seed and go to the loop all over again.*/
        boolean goodSeed = false;

         while (!goodSeed) {
            Random random = new Random(k++);
            for (int i = 0; i < n; i++) {
                if (m < random.nextGaussian()) {
                    goodSeed = false;
                    break;
                } else {
                    goodSeed = true;
                }
            }
        }

        System.out.println(k-1);
    }
}