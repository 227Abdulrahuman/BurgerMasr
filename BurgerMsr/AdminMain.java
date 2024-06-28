import java.util.Scanner;

public class AdminMain {

    public static void main(String[] args) {
        
        Menu menu = Menu.getInstance();
        Additions additions = Additions.getInstance();

        menu.showAdmin();

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        int choiceInt = Integer.parseInt(choice);

        switch (choiceInt) {
                //1 -> Show Menu.
            case 1:
                menu.show();
                break;
                // 2 -> Show Additions.
            case 2:
                additions.show();
                break;
                // 3 -> Edit Menu.
            case 3:
                while (true) {
                    System.out.println("New Sandwich ");
                    System.out.println("Enter Sandwich Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Sandwich Price");
                    String price = scanner.nextLine();
                    double priceDouble = Double.parseDouble(price);
                    System.out.println("Confirm:Yes/No");
                    String confirm = scanner.nextLine().trim(); 
                    if (confirm.equalsIgnoreCase("Yes")) {
                        menu.add(name, priceDouble);
                        System.out.println("New Menu");
                        menu.show();
                        break;
                    } else if (confirm.equalsIgnoreCase("No")) {
                        continue;
                    }
                }
                break;
                // 4 -> Edit Additions.
            case 4:
                while (true) {
                    System.out.println("New Addition ");
                    System.out.println("Enter Addition Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Addition Price");
                    String price = scanner.nextLine();
                    double priceDouble = Double.parseDouble(price);
                    System.out.println("Confirm:Y/N");
                    String confirm = scanner.nextLine().trim(); 
                    if (confirm.equalsIgnoreCase("Y")) {
                        additions.add(name, priceDouble);
                        System.out.println("New Additions");
                        additions.show();
                        break;
                    } else if (confirm.equalsIgnoreCase("N")) {
                        continue;
                    }
                }
                break;
                
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}
