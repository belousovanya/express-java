package homework_5.task_8;

public class Manuscript extends Exhibit {
    @Override
    public String describe() {
        return "Манускрипт - древний текст";
    }

    @Override
    public void preserve() {
        System.out.println("Манускрипт требует контролируемой влажности");
    }
}
