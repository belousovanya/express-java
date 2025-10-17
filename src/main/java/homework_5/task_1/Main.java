package homework_5.task_1;

public class Main {
    public static void main(String[] args) {
        Animal elephant = new Elephant();
        Animal bird = new Bird();
        Zoo zoo = new Zoo();

        zoo.add(elephant);
        zoo.showAnimalBehavior();

        zoo.add(bird);
        zoo.showAnimalBehavior();
    }
}
