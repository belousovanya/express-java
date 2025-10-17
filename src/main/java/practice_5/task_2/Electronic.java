package practice_5.task_2;

public class Electronic extends Item {
    private static final int DEFAULT_GUARANTEE = 2;
    private int guarantee;


    public Electronic(String name, double price, int count) {
        super(name, price, count);
        this.guarantee = DEFAULT_GUARANTEE;
    }

    public int getGuarantee() {
        return this.guarantee;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(", гарантия " +  this.guarantee + " года");
    }
}
