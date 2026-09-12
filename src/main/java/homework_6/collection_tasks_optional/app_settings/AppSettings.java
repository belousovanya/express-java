package homework_6.collection_tasks_optional.app_settings;

import java.util.HashMap;
import java.util.Map;

/*
3. Хранение ключей и значений (настройки приложения)
Задача:
Хранить параметры приложения по имени и значению.
 */
public class AppSettings {
    private Map<String, String> settings = new HashMap<>();

    public void addSettings(String name, String value) {
        settings.put(name, value);
    }

    public void getSetting(String name) {
        if (settings.containsKey(name)) {
            System.out.println(settings.get(name));
        }
    }
}
