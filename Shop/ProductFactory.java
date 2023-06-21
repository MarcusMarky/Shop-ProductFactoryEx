public class ProductFactory {
//HW3:
    public static Product createProduct(String type, String name, double price, int diagonal) {
        if (type.equalsIgnoreCase("phone")) {
            return new Phone(name, price, diagonal);
        } else if (type.equalsIgnoreCase("printer")) {
            return new Printer(name, price, null);
        }

        return null;
    }

    public static Product createProduct(String type, String name, double price, String format) {
        if (type.equalsIgnoreCase("printer")) {
            return new Printer(name, price, format);
        }

        return null;
    }
}