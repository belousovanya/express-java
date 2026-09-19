package homework_6.collection_tasks_optional.page_visits;

import java.util.HashSet;
import java.util.Set;

/*
4. Учёт посещений страниц
Задача:
Отслеживать уникальные страницы и общее количество посещений.
 */
public class PageVisits {
    private Set<String> visits = new HashSet<>();
    private int totalCount;

    public void addPage(String url) {
        totalCount++;
        visits.add(url);
    }

    public void printVisits() {
        System.out.println("Уникальных страниц: "+ visits.size());
        System.out.println("Всего посещений: " + totalCount);
    }
}
