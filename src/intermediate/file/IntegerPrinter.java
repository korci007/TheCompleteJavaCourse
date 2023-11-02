package intermediate.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IntegerPrinter {
    public static void main(String[] args) throws FileNotFoundException {
        String pathToFile = "file.txt";
        try (Scanner scanner = new Scanner(new File(pathToFile))) {
            System.out.println(scanner.nextInt());
        }
    }
}
