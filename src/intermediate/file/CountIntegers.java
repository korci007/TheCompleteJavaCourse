package intermediate.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountIntegers {
    public static void main(String[] args) {
        String datasetName = "dataset_91022.txt";
        File file = new File(datasetName);
        int counter = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                int number = scanner.nextInt();
                if (number >= 9999) {
                    counter++;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("No file found: "+ datasetName);
        }

        System.out.println(counter);
    }
}
