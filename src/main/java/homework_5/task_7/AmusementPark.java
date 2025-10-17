package homework_5.task_7;

public class AmusementPark {

    private Attraction attraction;

    public void addAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public void operateAttraction() {
        attraction.info();
        attraction.maintain();
    }
}
