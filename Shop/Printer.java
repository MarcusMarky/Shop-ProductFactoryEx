public class Printer extends Product {
    private String format;

    public Printer(String name, double price, String format) {
        super(name, price);
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return super.toString() + " format: " + format + " |";
    }
}
