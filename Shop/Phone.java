public class Phone extends Product {
    private int diagonal;

    public Phone(String name, double price, int diagonal) {
        super(name, price);
        this.diagonal = diagonal;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return super.toString() + " diagonal: " + diagonal + " |";
    }
}