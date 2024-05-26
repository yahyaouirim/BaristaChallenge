public class Test {
    public static void main(String[] args) {
        Item item1 = new Item("drip coffee", 1.50);
        Item item2 = new Item("capuccino", 2.50);
        Item item3 = new Item("latte", 3.50);
        Item item4 = new Item("mocha", 4.50);
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Rima");
        Order order4 = new Order("Youssef");
        Order order5 = new Order("Chaima");

order3.addItem(item4);
order3.addItem(item1);

order1.addItem(item4);
order1.addItem(item3);

order2.addItem(item2);
order2.addItem(item1);

order4.addItem(item4);
order4.addItem(item3);
order4.setReady(true);
System.out.println(order4.getStatusMessage());
System.out.println(order4.getOrderTotal());
order4.display();

        
    }
}
