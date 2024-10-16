import java.util.ArrayList;
import java.util.List;

public class Pizza extends Food {
    
    protected List<String> toppings;

    public Pizza(){
        super("Pizza", 45);
        this.toppings = new ArrayList<String>();
    }

    public void addTopping(String topping){
        toppings.add(topping);
        price+=10;
    }

    public void setName(String name){
        this.name = name;
    }

    public void display(){
        String separator = "";  // first, no space
        System.out.print(price + " kr " + name + " {");
        if (toppings.size()>0) {
            System.out.print(" ");
        }
        for (String word : toppings) {
            System.out.print(separator);
            System.out.print(word);
            separator = ", ";  
            

        }
        System.out.print(" }\n");
    }

}
