import java.util.Scanner;

public class UserMain {

    public static void main(String[] args) {
        while (true) {
            
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please Choose an Option: ");

        Menu menu =  Menu.getInstance();
        menu.show();

        System.out.print('\n');
        System.out.println("Please Select and Option");
        String choice = scanner.nextLine();
        int choiceInt = Integer.parseInt(choice);
        
        Receipt receipt = new Receipt();
        receipt.add(menu.items.get(choiceInt - 1), menu.prices.get(choiceInt - 1));
        
        System.out.println("Do you like to add an additions? ");
        System.out.println("   1-Yes");
        System.out.println("   2-No");

        choice = scanner.nextLine();
        choiceInt = Integer.parseInt(choice);

        if (choiceInt == 1) {
        Additions additions = Additions.getInstance();
        additions.show();

        System.out.println("Please Select Option Like This 1,2");
        choice = scanner.nextLine();
       String [] choiceArray = choice.split(",");
            
        for (int i = 0; i < choiceArray.length; i++) {
            receipt.add(additions.items.get(Integer.parseInt(choiceArray[i])-1), additions.prices.get(Integer.parseInt(choiceArray[i])-1));
        }

        
    }
        
        System.out.println("Your Order is: ");
        receipt.showNoPrice();
        System.out.println("   1-Confirm");
        System.out.println("   2-Back To Menu");

        choice = scanner.nextLine();
        choiceInt = Integer.parseInt(choice);

        if (choiceInt == 1) {
            receipt.show();
            System.out.println("   1-Back To Menu");
            System.out.println("   2-Exit");
            choice = scanner.nextLine();
        choiceInt = Integer.parseInt(choice);

        if (choiceInt == 1) {
            continue;
        }
        else if (choiceInt == 2) {
            break;
        }
        }
        else if (choiceInt == 2) {
            continue;
        }
    
    }   
    }
    

}
