import java.util.Arrays;
import java.util.Vector;

public class Menu {
    private static Menu instance;
    public Vector<String> items = new Vector<>(Arrays.asList("Beef Burger", "Chicken Burger", "Cheese Burger"));
    public Vector<Double> prices = new Vector<>(Arrays.asList(80.0,100.0,50.0));


    private Menu() {}

    public static Menu getInstance() {
        if (instance == null) {
            synchronized (Menu.class) {
                if (instance == null) {
                    instance = new Menu();
                }
            }
        }
        return instance;
    }

    public void show() {
        for (int i = 1; i <= items.size(); i++) {
            System.out.print(i); 
            System.out.print("-");
            System.out.print(items.get(i-1));
            System.out.print("  ");
            System.out.println(prices.get(i - 1));
        }
    }

    public void showAdmin() {
        System.out.println("1-View Menu");
        System.out.println("2-View Additions");
        System.out.println("3-Add New Item to the Menu");
        System.out.println("4-Add New Addition to the Menu");

    }

    public void add(String item, Double price) {
        items.add(item);
        prices.add(price);
        
    }
}
