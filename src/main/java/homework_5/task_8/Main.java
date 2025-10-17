package homework_5.task_8;

public class Main {
    public static void main(String[] args) {
        Exhibit manuscript = new Manuscript();
        Exhibit sculpture = new Sculpture();
        Museum museum = new Museum();

        museum.addExhibit(manuscript);
        museum.showExhibit();

        museum.addExhibit(sculpture);
        museum.showExhibit();
    }
}
