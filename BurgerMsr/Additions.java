import java.util.Arrays;
import java.util.Vector;

public class Additions {
    private static Additions instance;
    public Vector<String> items = new Vector<>(Arrays.asList("Catchup", "Mayonnaise", "Tomato", "Cheese"));
    public Vector<Double> prices = new Vector<>(Arrays.asList(2.0,2.0,3.0,10.0));


    private Additions() {}

    public static Additions getInstance() {
        if (instance == null) {
            synchronized (Additions.class) {
                if (instance == null) {
                    instance = new Additions();
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

    public void add(String item, Double price) {
        items.add(item);
        prices.add(price);
        
    }
    
}
