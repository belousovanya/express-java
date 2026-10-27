package homeworks.homework_12.entity_manager;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class EntityManager<T extends Entity> {
    private final List<T> entities = new CopyOnWriteArrayList<>();

    public void add(T entity) {
        Objects.requireNonNull(entity, "Нельзя добавить null");
        entities.add(entity);
    }

    public boolean remove(T entity) {
        return entities.remove(entity);
    }

    public List<T> getAll() {
        return List.copyOf(entities);
    }

    public List<T> filterByAge(int minAge, int maxAge) {
        if (minAge > maxAge) {
            throw new IllegalArgumentException(
                    "Минимальный возраст больше максимального"
            );
        }
        return entities.stream()
                .filter(entity -> entity.getAge() >= minAge
                        && entity.getAge() <= maxAge)
                .collect(Collectors.toList());
    }

    public List<T> filterByName(String name) {
        return entities.stream()
                .filter(entity -> name.equalsIgnoreCase(entity.getName()))
                .collect(Collectors.toList());
    }

    public List<T> filterByActivity(boolean active) {
        return entities.stream()
                .filter(entity -> entity.isActive() == active)
                .collect(Collectors.toList());
    }
}
