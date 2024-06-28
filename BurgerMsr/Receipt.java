import java.util.Vector;

public class Receipt {
    private double total = 0;
    private Vector<String> items = new Vector<>();
    private Vector<Double> prices = new Vector<>();

    public void show() {
        for (int i = 1; i <= items.size(); i++) {
            System.out.print(i); 
            System.out.print("-");
            System.out.print(items.get(i-1));
            System.out.print("  ");
            System.out.println(prices.get(i - 1));
        }
        System.out.print('\n');
        System.out.print("Total ");
        System.out.println(total);
    }

    public void add(String item, Double price) {
        items.add(item);
        prices.add(price);
        total += price;
    }

    public void showNoPrice() {
        for (int i = 1; i <= items.size(); i++) {
            
            
            System.out.print(items.get(i-1));
            System.out.print(" ");
            if (i < items.size()) {
                System.out.print("+");
                System.out.print(" ");
            }
            
        }
        System.out.print('\n');
    }
    


}
