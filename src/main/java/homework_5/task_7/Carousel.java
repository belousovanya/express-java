package homework_5.task_7;

public class Carousel extends Attraction {
    @Override
    public void info() {
        System.out.println("Карусель - спокойный аттракцион");
    }

    @Override
    public void maintain() {
        System.out.println("Карусли нужно техническое обслуживание");
    }
}
