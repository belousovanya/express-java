package homework_6.page_visits;

public class Main {
    public static void main(String[] args) {
        PageVisits pageVisits = new PageVisits();

        pageVisits.addPage("yandex.ru");
        pageVisits.addPage("google.com");
        pageVisits.addPage("avito.ru");
        pageVisits.addPage("avito.ru");

        pageVisits.printVisits();

    }
}
