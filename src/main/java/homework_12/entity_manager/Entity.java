package homework_12.entity_manager;

public abstract class Entity {
    private final String name;
    private final int age;
    private final boolean active;

    protected Entity(String name, int age, boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isActive() {
        return this.active;
    }
}