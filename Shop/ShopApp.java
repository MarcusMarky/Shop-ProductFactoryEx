
public class ShopApp {
    public static void main(String[] args) {
 //HW1:       
   Product phone = ProductFactory.createProduct("phone", "iPhone 12", 15000.00, 10);
   Product printer = ProductFactory.createProduct("printer", "Canon", 8799.99, "A4");

        System.out.println(phone.toString());
        System.out.println(printer.toString());
    }
}
