package beginner.primitives;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int len = scanner.nextInt();
//        int[] array = new int[len];
//        int max =  0;

        String str1 = null;
        String str2 = "123";

        if (!str2.equals(str1)) {
            str2 = null;
        }

        str1 = str2;
        str2 = str1;

        System.out.println(str2);

//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//       for (int i = 0; i < array.length -1 ; i++) {
//           int product = array[i] * array[i+1];
//           if (product > max) {
//               max = product;
//           }
//
//        }
//        System.out.println(max);
    }
}
