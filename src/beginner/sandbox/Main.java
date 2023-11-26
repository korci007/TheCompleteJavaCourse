package beginner.sandbox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Command: ");
        String word = scanner.nextLine();
        System.out.println(word);
    }
}
