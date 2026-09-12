package homework_6.collection_tasks_optional.app_settings;

public class Main {
    public static void main(String[] args) {
        AppSettings appSettings = new AppSettings();

        appSettings.addSettings("theme", "dark");
        appSettings.addSettings("language", "ru");
        appSettings.addSettings("fontSize", "16");

        appSettings.getSetting("theme");
        appSettings.getSetting("language");
        appSettings.getSetting("fontSize");

    }
}
