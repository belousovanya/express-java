package practice_5.task_2;

public class Clothes extends Item {
    private static final char DEFAULT_SIZE = 'M';
    private char size;

    public Clothes(String name, double price, int count) {
        super(name, price, count);
        this.size = DEFAULT_SIZE;
    }

    public char getSize() {
        return this.size;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(", размер " + this.size);
    }
}
