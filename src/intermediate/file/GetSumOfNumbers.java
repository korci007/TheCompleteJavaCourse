package intermediate.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetSumOfNumbers {
    public static void main(String[] args) {
        String fileName = "dataset_91033.txt";
        File file = new File(fileName);

        int sum = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                sum += scanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
        if (sum > 0) {
            System.out.println(sum);
        }
    }
}
