package homework_5.task_7;

public class Main {
    public static void main(String[] args) {
        Attraction rollerCoaster = new RollerCoaster();
        Attraction carousel = new Carousel();
        AmusementPark amusementPark = new AmusementPark();

        amusementPark.addAttraction(rollerCoaster);
        amusementPark.operateAttraction();

        amusementPark.addAttraction(carousel);
        amusementPark.operateAttraction();
    }
}
