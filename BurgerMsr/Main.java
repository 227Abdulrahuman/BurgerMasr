import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        while (true) {
            System.out.println("User:1");
            System.out.println("Admin:2");
            System.out.println("Exit:0");

            String choice = scanner.nextLine().trim();

            int choiceInt;
            try {
                choiceInt = Integer.parseInt(choice);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue; 
            }

            if (choiceInt == 1) {
                UserMain.main(args);
            } else if (choiceInt == 2) {
                AdminMain.main(args);
            } else if (choiceInt == 0) {
                System.out.println("Exiting...");
                break; 
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close(); 
    }
}