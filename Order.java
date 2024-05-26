
import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null
        // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.

    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();

    }
    
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }
    // ORDER METHODS
    // GETTERS & SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
    	// Most of your code will go here, 
     public void addItem(Item i){
        items.add(i);
         }

    public String getStatusMessage(){
        if(this.ready){
            return "Your Order Is Ready";
        }
        else {
            return "Thank you your order will be ready soon";
        }
    }
    public double getOrderTotal(){
        double total = 0;
        for( Item item: items){
            total += item.getPrice();
        }
        return total;
    }

    public void display(){
        System.out.println(" Customer Name: "+ this.name);
        for(Item item: items){
            System.out.println(item.getName() + "-" + "$"+item.getPrice());
        }
        System.out.println("Total : " + "$"+getOrderTotal());

    }


    
    
}


    
