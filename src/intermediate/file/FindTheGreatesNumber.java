package intermediate.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindTheGreatesNumber {
    public static void main(String[] args) {
        String pathToFile  = "dataset_91007.txt";
        File file = new File(pathToFile);

        int max = Integer.MIN_VALUE;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                int tmp = scanner.nextInt();
                if (tmp > max) {
                    max = tmp;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathToFile);
        }
        System.out.println(max);
    }
}

