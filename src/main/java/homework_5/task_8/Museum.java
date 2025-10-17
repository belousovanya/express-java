package homework_5.task_8;

public class Museum {

    private Exhibit exhibit;

    public void addExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
    }

    public void showExhibit() {
        System.out.println(exhibit.describe());
        exhibit.preserve();
    }
}
