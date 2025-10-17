package homework_5.task_8;

public class Sculpture extends Exhibit {
    @Override
    public String describe() {
        return "Скульптурный объект";
    }

    @Override
    public void preserve() {
        System.out.println("Скульптура требует реставрации");
    }
}
