import java.util.ArrayList;
import java.util.List;

public class Order{
    protected List<Food> ordered;

    public Order(){
        this.ordered = new ArrayList<Food>();
    }

    public void addFood(Food food){
        ordered.add(food);
    }

    public int total(){
        int total = 0;
        for (Food food : ordered) {
            total += food.price;
        }
        return total;
    }

    public boolean payWith(CreditCard card) {
        if (!card.withdraw(total())) {
            System.out.println("ERROR: Payment failed");
            return false;
        }
        return true;
    }

    public void display(){
        int total = 0;
        for (Food food : ordered) {
            food.display();
            total +=food.price;
        }
        System.out.println(total + " kr "+ "TOTAL");
    }
}
