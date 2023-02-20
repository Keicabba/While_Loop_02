package it.figuccia;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter a command: ");
            String input = scanner.nextLine();
            System.out.println("You entered: " + input);
            String Stopper =  input.replaceFirst("(?i)stop","stop");
            if (Stopper.equalsIgnoreCase("stop")) {
                System.out.println("Stopping...");
                break;
            }
        }

        scanner.close();
    }
}
