package beginner.multidimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows =  scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int[][] rotatedMatrix = new int[columns][rows];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rotatedMatrix[j][rows - 1 - i] = matrix[i][j];
            }
        }

        for (int[] row : rotatedMatrix) {
            System.out.println(Arrays.toString(row));
        }

        // for (int i = 0; i < columns; i++) {
        //      for (int j = rows - 1; j >= 0; j--) {
        //          if (j > 0) {
        //              System.out.print(matrix[j][i] + " ");
        //          } else {
        //              System.out.println(matrix[j][i]);
        //          }
        //      }
        //  }
        //  for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[i].length; j++) {
        //         System.out.print(matrix[matrix.length - 1 - i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}
