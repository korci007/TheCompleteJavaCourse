package intermediate.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EvenCounter {
    public static void main(String[] args) {
        String pathToFile= "dataset_91065.txt";
        File file = new File(pathToFile);
        int counter = 0;
        int value = Integer.MAX_VALUE;

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNext()) {
                value = scanner.nextInt();
                if (value == 0) {
                    break;
                }

                if (value % 2 == 0) {
                    counter++;
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + pathToFile);
        }
        System.out.println("Number of even numbers was: " + counter);
    }
}
